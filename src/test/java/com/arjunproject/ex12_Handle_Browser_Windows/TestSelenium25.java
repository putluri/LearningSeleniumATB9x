package com.arjunproject.ex12_Handle_Browser_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestSelenium25 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
        Set<String> windowIDs = driver.getWindowHandles();

        //Approach 1
//        List<String> windowList = new ArrayList(windowIDs);
//        String parentID = windowList.get(0);
//        String childID = windowList.get(1);
//
//        //Swith to child window
//        driver.switchTo().window(childID);
//        System.out.println(driver.getTitle());
//
//        //Swith to child window
//        driver.switchTo().window(parentID);
//        System.out.println(driver.getTitle());

        //Approach 2
        for (String windowID : windowIDs) {
            String title = driver.switchTo().window(windowID).getTitle();
            if (title.equals("OrangeHRM")) {
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
    }
}
