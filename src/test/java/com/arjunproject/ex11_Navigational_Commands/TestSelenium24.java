package com.arjunproject.ex11_Navigational_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class TestSelenium24 {
    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://demo.nopcommerce.com/"); //Accepts URL only in String format

        //URL myurl =  new URL("https://demo.nopcommerce.com/");
        //driver.navigate().to(myurl);

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.navigate().back();
        System.out.println( driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println( driver.getCurrentUrl());

        driver.navigate().refresh();

    }
}
