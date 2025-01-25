package com.arjunproject.ex53_TestNG_Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.time.Duration;

//@Listeners(MyListener.class)
public class OrangeHRM {

    WebDriver driver;
    @Test(priority = 1)
    void openapp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test(priority = 2)
    void logopresence() throws InterruptedException {
        Thread.sleep(5000);
        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        System.out.println("The logo status of the image is : "+status);
    }

    @Test(priority = 3)
    void testAppUrl()
    {
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/");
    }


    @Test (priority = 4, dependsOnMethods = {"testAppUrl"})
    void testHomePageTitle() {
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }

    @AfterClass
    void closeapp() {
        driver.quit();
    }
}
