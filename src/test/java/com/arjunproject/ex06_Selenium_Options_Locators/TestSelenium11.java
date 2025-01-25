package com.arjunproject.ex06_Selenium_Options_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium11 {

    @Description("Options Class")
    @Test
    public void test_Selenium01() throws Exception {

       // SafariOptions, EdgeOptions, FirefoxOptions, ChromeOptions
        EdgeOptions edgeOptions = new EdgeOptions();

        //EdgeOptions -> It will help you set the browser.
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100+ others, https, http
        // localstorage, download ?

        //edgeOptions.addArguments("--window-size=1280,720");
        edgeOptions.addArguments("--window-size=1920,1080");
        //edgeOptions.addArguments("--incognito");
        //edgeOptions.addArguments("--start-maximized");
        //edgeOptions.addArguments("--headless");


        WebDriver  driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.google.com");

        Thread.sleep(5000);
        driver.quit();
    }
}
