package com.arjunproject.ex33_JavaScriptExecutorTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutorDemo50 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver1 = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));

        //Passing text into input box - alternative of sendKeys().
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //JavascriptExecutor js = driver1;
       js.executeScript("arguments[0].setAttribute('value','Arjun')",inputbox);

       //Click on Male radio button.
        WebElement radiobtn = driver.findElement(By.xpath("//input[@id='male']"));
        js.executeScript("arguments[0].click()",radiobtn);


    }
}
