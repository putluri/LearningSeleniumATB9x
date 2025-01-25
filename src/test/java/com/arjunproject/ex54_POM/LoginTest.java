package com.arjunproject.ex54_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

    WebDriver driver;
    @BeforeClass
    void setup() throws InterruptedException {
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      driver.manage().window().maximize();
      Thread.sleep(3000);
    }

    @Test
    void testLogin()
    {
      LoginPage2 lp = new LoginPage2(driver);
      lp.setUserName("Admin");
      lp.setPassword("admin123");
      lp.clickLogin();

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }

    @AfterClass
    void tearDown()
    {
      driver.quit();
    }
}
