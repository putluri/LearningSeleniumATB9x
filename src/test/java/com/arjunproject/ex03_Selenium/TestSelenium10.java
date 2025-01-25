package com.arjunproject.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium10 {

    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {
        WebDriver  driver = new EdgeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        //Use navigation methods
        driver.navigate().to("https://www.bing.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
