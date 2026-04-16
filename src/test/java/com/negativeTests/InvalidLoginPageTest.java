package com.negativeTests;

import com.Listeners.MyListener;
import com.BasePage.BaseClass;
import com.swagLabsPages.LoginClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class InvalidLoginPageTest
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
    public void verifyInvalidUserLogin()
    {
        loginPage=new LoginClass();
        loginPage.login(baseClass.properties.getProperty("invalidUserName"), baseClass.properties.getProperty("invalidPassword"));
        Assert.assertTrue(loginPage.verifyErrorMessage1().isDisplayed(),"Couldn't show error message");
    }

    @Test
    public void verifyEmptyFieldLogin()
    {
        loginPage=new LoginClass();
        loginPage.emptyFieldLogin();
        Assert.assertTrue(loginPage.verifyErrorMessage2().isDisplayed(),"Couldn't show error message");
    }

    @Test
    public void verifyLockedUserLogin()
    {
        loginPage=new LoginClass();
        loginPage.login(baseClass.properties.getProperty("lockedUserName"), baseClass.properties.getProperty("password"));
        Assert.assertTrue(loginPage.verifyErrorMessage3().isDisplayed(),"Couldn't show error message");
    }

    @AfterMethod
    public void tearDown()
    {
        baseClass.quitApplications();
    }
}
