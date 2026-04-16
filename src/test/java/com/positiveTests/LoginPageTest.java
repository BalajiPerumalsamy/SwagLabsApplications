package com.positiveTests;

import com.BasePage.BaseClass;
import com.Listeners.MyListener;
import com.swagLabsPages.LoginClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class LoginPageTest
{
    public BaseClass baseClass;
    public LoginClass loginPage;
    @BeforeMethod
    public void setUp()
    {
        baseClass =new BaseClass();
        baseClass.navigateToApplication();
    }
    @Test
    public void verifyLogin()
    {
        loginPage=new LoginClass();
        loginPage.login(baseClass.properties.getProperty("username"), baseClass.properties.getProperty("password"));
        Assert.assertTrue(loginPage.product().isDisplayed(),"Couldn't navigate to Dashboard page");
    }

    @AfterMethod
    public void tearDown()
    {
        baseClass.quitApplications();
    }
}
