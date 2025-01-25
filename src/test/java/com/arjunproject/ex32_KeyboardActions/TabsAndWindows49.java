package com.arjunproject.ex32_KeyboardActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TabsAndWindows49 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.opencart.com/");

        //Selenium4.X
        driver.switchTo().newWindow(WindowType.TAB); //Opens new tab.
       //driver.switchTo().newWindow(WindowType.WINDOW); //Opens new browser

        driver.get("https://orangehrm.com/");



    }

}
