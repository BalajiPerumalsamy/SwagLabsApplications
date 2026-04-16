package com.positiveTests;

import com.BasePage.BaseClass;
import com.Listeners.MyListener;
import com.swagLabsPages.LoginClass;
import com.swagLabsPages.ProductAddToCartClass;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(MyListener.class)
public class ProductAddToCartPageTest
{
    public BaseClass baseClass;
    public LoginClass loginPage;
    public ProductAddToCartClass addToCartPage;

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
    public void verifyProductAddToCart()
    {
        addToCartPage=new ProductAddToCartClass();
        addToCartPage.selectProduct();
        Assert.assertTrue(addToCartPage.showRemoveButton().isDisplayed(),"Couldn't select product");
    }

    @AfterMethod
    public void tearDown()
    {
        baseClass.quitApplications();
    }
}
