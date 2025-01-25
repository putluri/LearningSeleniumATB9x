package com.arjunproject.ex05_Selenium_CSSSelectors;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium16 {

    @Description("Verify that CSS Selectors")
    @Test
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //Tag and ID
        //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
        //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirts");

        //Tag and Class
        //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");
        //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-Shirts");

        //Tag and Attribute
        //driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("T-Shirts");
       // driver.findElement(By.cssSelector("[id='small-searchterms']")).sendKeys("T-Shirts");

        //Tag and Class and Attribute
        //driver.findElement(By.cssSelector("input.search-box-text[id='small-searchterms']")).sendKeys("T-Shirts");
        driver.findElement(By.cssSelector(".search-box-text[id='small-searchterms']")).sendKeys("T-Shirts");
    }
}
