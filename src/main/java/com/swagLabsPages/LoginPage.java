package com.swagLabsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage
{
    By userName=By.xpath("//input[@name='user-name']");
    By password=By.xpath("//input[@name='password']");
    By loginButton=By.xpath("//input[@name='login-button']");
    By productsList=By.xpath("//span[text()='Products']");

    public WebElement enterUserName()
    {
        return driver.findElement(userName);
    }

    public WebElement enterPassword()
    {
        return driver.findElement(password);
    }

    public WebElement clickLoginButton()
    {
        return driver.findElement(loginButton);
    }

    public WebElement product()
    {
        return driver.findElement(productsList);
    }

    public void login(String userName,String password)
    {
        writeText(userName,enterUserName());
        writeText(password,enterPassword());
        clickButton(clickLoginButton());
    }

}
