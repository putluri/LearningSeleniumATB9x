package com.arjunproject.ex46_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

/*/
1) open the application
2) test logo presence
3) test login
4) test close
 */
public class OrangeHRMTest72 {

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

    @Test (priority = 3)
    void login() {
     driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
     driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test(priority = 4)
    void closeapp() {
        driver.quit();
    }
}
