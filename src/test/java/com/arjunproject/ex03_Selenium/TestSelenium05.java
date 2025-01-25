package com.arjunproject.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium05 {

    @Description("Open the app.vwo.com and Get the title of the page")
    @Test
    public void test_Selenium01(){
        WebDriver  driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");

    }
}
