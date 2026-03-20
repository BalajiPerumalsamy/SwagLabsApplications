package com.swagLabsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductAddToCartPage extends BasePage
{
    public By clickProduct=By.xpath("//div[text()='Sauce Labs Fleece Jacket']");
    public By addToCartButton=By.xpath(" //button[text()='Add to cart']");
   // public By removeButton=By.xpath("//button[@name='remove']");

    public WebElement product()
    {
        return driver.findElement(clickProduct);
    }

    public WebElement clickAddToCartButton()
    {
        return driver.findElement(addToCartButton);
    }

    /*public WebElement showRemoveButton()
    {
        return driver.findElement(removeButton);
    }*/

    public void selectProduct()
    {
        clickButton(product());
        clickButton(clickAddToCartButton());
    }
}
