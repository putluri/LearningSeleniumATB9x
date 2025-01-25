package com.arjunproject.ex38_HidingAutomationMsg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HidingAutomationMsgWhileExecuting57 {
    public static void main(String[] args)throws Exception {

       // SafariOptions, EdgeOptions, FirefoxOptions, ChromeOptions
        EdgeOptions Options = new EdgeOptions();
        Options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        WebDriver  driver = new EdgeDriver(Options);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

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
