package com.arjunproject.ex26_HandleFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestSelenium31 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        //Frame 1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
         driver.switchTo().frame(frame1); // Passed frame as a webelement - Switch to frame 1
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");

        driver.switchTo().defaultContent(); //go back to page

        //Frame 2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2); // Passed frame as a webelement - Switch to frame 2
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");

        driver.switchTo().defaultContent(); //go back to page

        //Frame 3
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3); // Passed frame as a webelement - Switch to frame 3
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("With Java");

        //inner iframe - part of frame 3
        driver.switchTo().frame(0); //Switching to frame using index
        //driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();

        WebElement rdbutton = driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
        JavascriptExecutor  js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", rdbutton);

        driver.switchTo().defaultContent(); //go back to page

        //Frame 4
        WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
        driver.switchTo().frame(frame4); // Passed frame as a webelement - Switch to frame 4
        driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Automation");

        driver.switchTo().defaultContent(); //go back to page

        //Frame 5
        WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
        driver.switchTo().frame(frame5); // Passed frame as a webelement - Switch to frame 5
        driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Testing");

        driver.findElement(By.linkText("https://a9t9.com")).click();
        driver.switchTo().defaultContent(); //go back to page
    }
}
