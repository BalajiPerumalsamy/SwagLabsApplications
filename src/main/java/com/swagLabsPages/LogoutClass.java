package com.swagLabsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogoutPage extends BasePage
{
    public By menu= By.xpath("//button[text()='Open Menu']");
    public By logoutButton=By.xpath("//a[text()='Logout']");
    public By logo=By.xpath("//div[text()='Swag Labs']");

    public WebElement clickMenuButton()
    {
        return driver.findElement(menu);
    }

    public WebElement clickLogoutButton()
    {
        return driver.findElement(logoutButton);
    }

    public WebElement verifyLogo()
    {
        return driver.findElement(logo);
    }

    public void logout()
    {
        clickButton(clickMenuButton());
        clickButton(clickLogoutButton());
    }
}
