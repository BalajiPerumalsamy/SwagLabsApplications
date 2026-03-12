package com.positiveTests;

import com.swagLabsPages.BasePage;
import com.swagLabsPages.LoginPage;
import com.swagLabsPages.LogoutPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LogoutPageTest
{
    public BasePage basePage;
    public LoginPage loginPage;
    public LogoutPage logoutPage;

    @BeforeMethod
    public void setUp()
    {
        basePage=new BasePage();
        basePage.navigateToApplication();
        loginPage=new LoginPage();
        loginPage.login(basePage.properties.getProperty("username"),basePage.properties.getProperty("password"));
        Assert.assertTrue(loginPage.product().isDisplayed(),"Couldn't navigate to Dashboard page");
    }

    @Test
    public void verifyLogout()
    {
        logoutPage=new LogoutPage();
        logoutPage.logout();
        Assert.assertTrue(logoutPage.verifyLogo().isDisplayed(),"Couldn't navigate to Login page");
    }

    @AfterMethod
    public void tearDown()
    {
        basePage.quitApplications();
    }
}
