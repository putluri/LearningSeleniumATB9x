package com.arjunproject.ex10_Sleep_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestSelenium22 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

        WebElement txtpassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

        WebElement loginButton = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        loginButton.click();

        driver.close();

    }
}
