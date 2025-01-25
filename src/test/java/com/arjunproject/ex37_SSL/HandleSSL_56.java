package com.arjunproject.ex37_SSL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HandleSSL_56 {
    public static void main(String[] args) {

        ChromeOptions  options = new ChromeOptions();
        options.setAcceptInsecureCerts(true); //accept SSL certificates

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://expired.badssl.com/"); //Privacy error
        System.out.println("The current title of the page is : "+driver.getTitle());
        driver.manage().window().maximize();




    }
}
