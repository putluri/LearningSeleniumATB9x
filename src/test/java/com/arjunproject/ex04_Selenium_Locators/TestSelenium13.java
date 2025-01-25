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

public class TestSelenium13 {

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

        WebElement a_tag_free_trial = driver.findElement(By.linkText("Start a free trial"));
        a_tag_free_trial.click();

        Thread.sleep(3000);

        WebElement  Email = driver.findElement(By.id("page-v1-step1-email"));
        Email.sendKeys("arjun.putluri@gmail.com");

        WebElement Checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
                Checkbox_policy.click();

        List<WebElement>  buttonList = driver.findElements(By.tagName("button"));
        buttonList.get(0).click();

        Thread.sleep(3000);

        WebElement ErrorMsg = driver.findElement(By.className("invalid-reason"));

        Assert.assertEquals(ErrorMsg.getText(), "An account with this email already exists. Login Here");

        Thread.sleep(3000);
        driver.quit();
    }
}
