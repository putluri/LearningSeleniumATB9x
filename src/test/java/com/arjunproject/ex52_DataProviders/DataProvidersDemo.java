package com.arjunproject.ex52_DataProviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProvidersDemo {

    WebDriver driver;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(dataProvider = "dp")
    void testLogin(String email, String pwd) {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();

        // Enter login details
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        // Use WebDriverWait instead of Thread.sleep
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean status = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[normalize-space()='My Account']"))) != null;

        if (status) {
            driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
            Assert.assertTrue(true, "Login successful and logged out.");
        } else {
            Assert.fail("Login failed.");
        }
    }

    @AfterClass
    void tearDown() {
        driver.quit(); // Using quit() instead of close() to close the entire browser session
    }

    @DataProvider(name = "dp", indices = {0,1})
    Object[][] loginData() {
        return new Object[][] {
                {"arjun.putluri@gmail.com", "Nani@2016"},
                {"abc@gmail.com", "test123"},
                {"xyz@gmail.com", "test012"},
                {"john@gmail.com", "test@123"},
                {"johncanedy@gmail.com", "test"}
        };
    }
}
