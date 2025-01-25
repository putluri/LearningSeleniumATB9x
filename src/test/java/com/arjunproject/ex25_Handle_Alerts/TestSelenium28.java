package com.arjunproject.ex25_Handle_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium28 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //1. Normal alert with OK button
//        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
//        Thread.sleep(3000);
//        Alert myalert = driver.switchTo().alert();
//        System.out.println(myalert.getText());
//        myalert.accept();

        //2. Confirmation Alert - OK & cancel button
//        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
//        Thread.sleep(3000);
//        //driver.switchTo().alert().accept(); //Closing alert by clicking OK button
//        driver.switchTo().alert().dismiss(); //Closing alert by clicking Cancel button

        //3. Prompt Alert - OK & cancel button
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
        Thread.sleep(3000);
        Alert myalert = driver.switchTo().alert();
        myalert.sendKeys("Welcome");
        //myalert.accept();
        myalert.dismiss();
    }
}
