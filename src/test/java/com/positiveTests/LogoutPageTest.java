package com.positiveTests;

import com.Listeners.MyListener;
import com.BasePage.BaseClass;
import com.swagLabsPages.LoginClass;
import com.swagLabsPages.LogoutClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class LogoutPageTest
{
    public BaseClass baseClass;
    public LoginClass loginPage;
    public LogoutClass logoutPage;

    @BeforeMethod
    public void setUp()
    {
        baseClass =new BaseClass();
        baseClass.navigateToApplication();
        loginPage=new LoginClass();
        loginPage.login(baseClass.properties.getProperty("username"), baseClass.properties.getProperty("password"));
        Assert.assertTrue(loginPage.product().isDisplayed(),"Couldn't navigate to Dashboard page");
    }

    @Test
    public void verifyLogout()
    {
        logoutPage=new LogoutClass();
        logoutPage.logout();
        Assert.assertTrue(logoutPage.verifyLogo().isDisplayed(),"Couldn't navigate to Login page");
    }

    @AfterMethod
    public void tearDown()
    {
        baseClass.quitApplications();
    }
}
