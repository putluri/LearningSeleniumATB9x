package com.arjunproject.ex30_MouseHover_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClick_Action43 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();

        //Switch to frame
        driver.switchTo().frame("iframeResult");

        WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        box1.clear();
        box1.sendKeys("WELCOME"); //Clears box1

        //Actions class
        Actions act = new Actions(driver);
        act.doubleClick(button).perform();

        //Validation : box2 contains "WELCOME"
         String text = box2.getAttribute("value");
        System.out.println("Captured value is : "+text);

        if (text.equals("WELCOME"))
        {
            System.out.println("Text copied");
        }
        else
        {
            System.out.println("Text not copied");
        }

    }
}
