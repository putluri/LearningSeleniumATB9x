package com.arjunproject.ex43_ShadowDom;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ShadowDom_Demo_62 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://books-pwakit.appspot.com/");
        driver.manage().window().maximize();

        //Handle shadow DOM element.
        SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
        Thread.sleep(1000);
        shadow.findElement(By.cssSelector("#input")).sendKeys("WELCOME");


    }
}
