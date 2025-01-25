package com.arjunproject.ex07_Selenium_Xpath_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium17 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        //xpath with single attribute
        //driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T-Shirts");

        //xpath with multiple attribute
        //driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-Shirts");

        //xpath with 'AND' operator
        //driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("T-Shirts");

        //xpath with 'OR' operator
        //driver.findElement(By.xpath("//input[@name='search' or @placeholder='Seaugu']")).sendKeys("T-Shirts");

        //xpath with 'text()' method
        //driver.findElement(By.xpath("//a[text()='Desktops']")).click();

//        Boolean DisplayStatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
//        System.out.println(DisplayStatus);
//
//        String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
//        System.out.println(value);

       //xpath with contains
       // driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("T-Shirts");

        //xpath with Starts-with
        //driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sear')]")).sendKeys("T-Shirts");

        //Chained xpath
        boolean imagestatus = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
        System.out.println(imagestatus);


    }
}
