package com.positiveTests;

import com.swagLabsPages.BasePage;
import com.swagLabsPages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class LoginPageTest
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
    public void verifyLogin()
    {
        loginPage=new LoginPage();
        loginPage.login(basePage.properties.getProperty("username"),basePage.properties.getProperty("password"));
        Assert.assertTrue(loginPage.product().isDisplayed(),"Couldn't navigate to Dashboard page");
    }

    @AfterMethod
    public void tearDown()
    {
        basePage.quitApplications();
    }
}
