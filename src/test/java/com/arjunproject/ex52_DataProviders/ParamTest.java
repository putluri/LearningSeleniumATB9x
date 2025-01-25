package com.arjunproject.ex52_DataProviders;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParamTest {

    WebDriver driver;

    @BeforeClass
    @Parameters({"browser"})
    void setup(String br) {

        // Initialize WebDriver based on the browser parameter
        switch (br.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Invalid browser: " + br);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        // Use WebDriverWait to ensure the page loads fully
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='company-branding']")));
    }

    @Test(priority = 1)
    void testLogo() {
        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertTrue(status, "Logo should be displayed");
    }

    @Test(priority = 2)
    void testTitle() {
        Assert.assertEquals(driver.getTitle(), "OrangeHRM", "Title mismatch");
    }

    @Test(priority = 3)
    void testURL() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", "URL mismatch");
    }

    @AfterClass
    void tearDown() {
        driver.quit();  // Use quit() to close the entire browser session
    }
}
