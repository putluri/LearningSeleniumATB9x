package com.arjunproject.ex30_MouseHover_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RightClickAction42 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // This is the website we are going to use for this project
        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        WebElement button = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));

        Actions act = new Actions(driver);
       // Right click action
        act.contextClick(button).perform();

        //Click on Copy option.
        driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();

        //Close the alert
        driver.switchTo().alert().accept();


    }
}
