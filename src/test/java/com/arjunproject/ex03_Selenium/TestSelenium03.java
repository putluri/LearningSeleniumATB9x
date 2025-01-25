package com.arjunproject.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {

    @Description("Open the app.vwo.com and Get the title of the page")
    @Test
    public void test_Selenium01(){
        //Selenium 3
        // You need to setup the Driver(browser)
        //System.geProperty("webdriver.gecko.driver", "geckodriver.exe");

        //Selenium 4
        //SeleniumManager - utility - Which can download the driver automatically
        //Start and stop itself

    }
}
