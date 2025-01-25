package com.arjunproject.ex04_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium14 {

    @Description("Verify that with invalid emailid, password, error message is shown on the app.vwo.com")
    @Test
    public void test_katalon_login() throws Exception {

       // SafariOptions, EdgeOptions, FirefoxOptions, ChromeOptions
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver  driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

//        1. Find the email inputbox and enter the email
//        2. Find the password inputbox and enter the password
//        3. Find the submit button and click on it.
//        4. Find the invalid error message and verify.

        WebElement make_appointment = driver.findElement(By.linkText("Make Appointment"));
        make_appointment.click();

        Thread.sleep(3000);

        WebElement  Username = driver.findElement(By.id("txt-username"));
        Username.sendKeys("John Doe");

        WebElement  Password = driver.findElement(By.id("txt-password"));
        Password.sendKeys("ThisIsNotAPassword");

        WebElement loginButton = driver.findElement(By.id("btn-login"));
                loginButton.click();

        Thread.sleep(3000);


        driver.quit();
    }
}
