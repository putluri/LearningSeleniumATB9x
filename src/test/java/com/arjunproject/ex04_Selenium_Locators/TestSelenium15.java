package com.arjunproject.ex04_Selenium_Locators;


import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium15 {

    @Description("Verify that with invalid emailid, password, error message is shown on the app.vwo.com")
    @Test
    public void test_Opencart_login() throws Exception {
       WebDriver driver = new ChromeDriver();
       driver.get("https://demo.opencart.com/");
       driver.manage().window().maximize();

       //name
       // driver.findElement(By.name("search")).sendKeys("mac");

        //Id
        boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
        System.out.println("Status of displayed logo should be "+logoDisplayStatus);

        //Linktext & partial Linktext
        //driver.findElement(By.linkText("Tablets")).click();
        //driver.findElement(By.partialLinkText("Tab")).click();

        //Classname
        //List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
        //System.out.println("Total no of header links :"+headerLinks.size());

        //Tagname
        List<WebElement> Links = driver.findElements(By.tagName("a"));
        System.out.println("Total no of links :"+Links.size());

        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total no of images :"+images.size());
    }
}
