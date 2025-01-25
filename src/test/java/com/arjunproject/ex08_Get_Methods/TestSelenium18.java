package com.arjunproject.ex08_Get_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class TestSelenium18 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        //get(url) - opens the url on the browser
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

        driver.manage().window().maximize();
        //getTitle() - returns the title of the page
        System.out.println(driver.getTitle());
        //getCurrentUrl() - returns the current URL
        System.out.println(driver.getCurrentUrl());

        //getPageSource() - returns the page source
        //System.out.println(driver.getPageSource());

        //getWindowHandle() - returns the ID of the single Browser Window.
        //String windowid = driver.getWindowHandle();
        //System.out.println("Window Id : "+windowid);

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Set<String> windowids = driver.getWindowHandles();
        System.out.println("Window Ids : "+windowids);
    }
}
