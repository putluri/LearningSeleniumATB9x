package com.arjunproject.ex30_MouseHover_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Mousehover41 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        WebElement desktops = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        WebElement mac = driver.findElement(By.xpath("//a[contains(text(),'Mac (1)')]"));

        Actions act = new Actions(driver);
        //Mouse Hover
        //act.moveToElement(desktops).moveToElement(mac).click().build().perform();
        act.moveToElement(desktops).moveToElement(mac).click().perform();

    }
}
