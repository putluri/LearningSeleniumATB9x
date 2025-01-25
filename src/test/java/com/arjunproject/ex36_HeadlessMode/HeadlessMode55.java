package com.arjunproject.ex36_HeadlessMode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class HeadlessMode55 {
        public static void main(String[] args) throws Exception {
                ChromeOptions  options = new ChromeOptions();
                options.addArguments("--headless=new"); //Setting for headless mode of execution.

                WebDriver driver = new ChromeDriver(options);
                driver.get("https://katalon-demo-cura.herokuapp.com/");
                driver.manage().window().maximize();
                if (driver.getPageSource().contains("CURA Healthcare Service")) {
                        System.out.println("CURA Healthcare Service is visible");
                        Assert.assertTrue(true);
                } else {
                        throw new Exception("CURA Healthcare Service is not visible");

                }
        }
}