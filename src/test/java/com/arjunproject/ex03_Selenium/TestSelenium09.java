package com.arjunproject.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium09 {

    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {
        WebDriver  driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        if (driver.getPageSource().contains("CURA Healthcare Service")) {
            System.out.println("CURA Healthcare Service is visible");
            Assert.assertTrue(true);
        }
              else {
            throw new Exception("CURA Healthcare Service is not visible");

        }
        
    }
}
