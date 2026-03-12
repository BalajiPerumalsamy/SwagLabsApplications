package com.swagLabsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage
{
    public By userName=By.xpath("//input[@name='user-name']");
    public By password=By.xpath("//input[@name='password']");
    public By loginButton=By.xpath("//input[@name='login-button']");
    public By productsList=By.xpath("//span[text()='Products']");
    public By errorMessage1=By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']");
    public By errorMessage2=By.xpath("//h3[text()='Epic sadface: Username is required']");
    public By errorMessage3=By.xpath("//h3[text()='Epic sadface: Sorry, this user has been locked out.']");

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

    public WebElement verifyErrorMessage1()
    {
        return driver.findElement(errorMessage1);
    }

    public WebElement verifyErrorMessage2()
    {
        return driver.findElement(errorMessage2);
    }

    public WebElement verifyErrorMessage3()
    {
        return driver.findElement(errorMessage3);
    }

    public void login(String userName,String password)
    {
        writeText(userName,enterUserName());
        writeText(password,enterPassword());
        clickButton(clickLoginButton());
    }

    public void emptyFieldLogin()
    {
        clickButton(clickLoginButton());
    }

}
