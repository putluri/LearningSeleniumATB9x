package com.arjunproject.ex01_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Description("Open the app.vwo.com and Get the title of the page")
    @Test
    public void test_Selenium01(){
        System.out.println("Hello Selenium");
        //Open the URL
        //Print the Title

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
    }
}
