package com.arjunproject.ex04_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium12 {

    @Description("Verify that with invalid emailid, password, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_VWO_login() throws Exception {

       // SafariOptions, EdgeOptions, FirefoxOptions, ChromeOptions
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver  driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

//        1. Find the email inputbox and enter the email
//        2. Find the password inputbox and enter the password
//        3. Find the submit button and click on it.
//        4. Find the invalid error message and verify.
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("admin");

        WebElement submitButton = driver.findElement(By.id("js-login-btn"));
        submitButton.click();

        Thread.sleep(3000);

        WebElement  errorMessage = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(errorMessage.getText(), "Your email, password, IP address or location did not match");

        driver.quit();
    }
}
