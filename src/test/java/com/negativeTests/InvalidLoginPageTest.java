package com.negativeTests;

import com.Listeners.MyListener;
import com.swagLabsPages.BasePage;
import com.swagLabsPages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(MyListener.class)
public class InvalidLoginPageTest
{
    public BasePage basePage;
    public LoginPage loginPage;

    @BeforeMethod
    public void setUp()
    {
        basePage=new BasePage();
        basePage.navigateToApplication();
    }

    @Test
    public void verifyInvalidUserLogin()
    {
        loginPage=new LoginPage();
        loginPage.login(basePage.properties.getProperty("invalidUserName"),basePage.properties.getProperty("invalidPassword"));
        Assert.assertTrue(loginPage.verifyErrorMessage1().isDisplayed(),"Couldn't show error message");
    }

    @Test
    public void verifyEmptyFieldLogin()
    {
        loginPage=new LoginPage();
        loginPage.emptyFieldLogin();
        Assert.assertTrue(loginPage.verifyErrorMessage2().isDisplayed(),"Couldn't show error message");
    }

    @Test
    public void verifyLockedUserLogin()
    {
        loginPage=new LoginPage();
        loginPage.login(basePage.properties.getProperty("lockedUserName"),basePage.properties.getProperty("password"));
        Assert.assertTrue(loginPage.verifyErrorMessage3().isDisplayed(),"Couldn't show error message");
    }

    @AfterMethod
    public void tearDown()
    {
        basePage.quitApplications();
    }
}
