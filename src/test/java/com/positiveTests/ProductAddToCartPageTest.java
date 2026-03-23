package com.positiveTests;

import com.Listeners.MyListener;
import com.swagLabsPages.BasePage;
import com.swagLabsPages.LoginPage;
import com.swagLabsPages.ProductAddToCartPage;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(MyListener.class)
public class ProductAddToCartPageTest
{
    public BasePage basePage;
    public LoginPage loginPage;
    public ProductAddToCartPage addToCartPage;

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
    public void verifyProductAddToCart()
    {
        addToCartPage=new ProductAddToCartPage();
        addToCartPage.selectProduct();
        Assert.assertTrue(addToCartPage.showRemoveButton().isDisplayed(),"Couldn't select product");
    }

    @AfterMethod
    public void tearDown()
    {
        basePage.quitApplications();
    }
}
