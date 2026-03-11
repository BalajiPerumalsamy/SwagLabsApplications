package com.swagLabsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BasePage
{
    public static WebDriver driver;
    public static WebDriverWait wait;
    public Properties properties;
    public void navigateToApplication()
    {
        String fPath="C://Users//ELCOT//IdeaProjects//SwagLabs//src//main//resources//Input_Data";
        properties=new Properties();
        try
        {
            FileInputStream fileInput=new FileInputStream(fPath);
            properties.load(fileInput);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        wait=new WebDriverWait(driver,Duration.ofSeconds(40));
        driver.get(properties.getProperty("URL"));
    }

    public void writeText(String text, WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public void clickButton(WebElement element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void quitApplications()
    {
        try
        {
            Thread.sleep(10000);
            driver.quit();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

    }

}
