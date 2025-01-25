package com.arjunproject.ex09_Conditional_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium19 {
    public static void main(String[] args) {

        WebDriver  driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();

        //isDisplayed()
        //WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        //System.out.println("Display status of logo : "+logo.isDisplayed());

        //boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        //System.out.println("Display status of logo :"+status);

        //isEnabled()
        boolean status = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
        System.out.println("Display status should be :"+status);

       //isSelected()
        System.out.println("Before Selection...");
        WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
        System.out.println("Status of male :"+male_rd.isSelected());

       WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
        System.out.println("Status of female :"+female_rd.isSelected());

        System.out.println("After Selecting Male...");
        male_rd.click();
        System.out.println("Status of male :"+male_rd.isSelected());
        System.out.println("Status of female :"+female_rd.isSelected());

        boolean newsletterstatus = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
               System.out.println("Status of newsletter :"+newsletterstatus);
    }
}
