package com.arjunproject.ex35_TakesScreenshot;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class TakeScreenshot54 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

//        1) Take full page Screenshot
//        TakesScreenshot ts = (TakesScreenshot)driver;
//        File sourcefile = ts.getScreenshotAs(OutputType.FILE);
//        File targetfile = new File(System.getProperty("user.dir")+"./Screenshots/fullpage.png");
//        sourcefile.renameTo(targetfile); //source file to target file
//        System.out.println("Screenshot saved successfully");

        //2) Capture the screenshot of specific section
        WebElement featuredProducts = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        File sourcefile = featuredProducts.getScreenshotAs(OutputType.FILE);
        File targetfile = new File(System.getProperty("user.dir")+"./Screenshots/featuredproducts.png");
        sourcefile.renameTo(targetfile); //source file to target file

        //3) Capture the screenshot of specific WebElement
        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File sourcefile1 = logo.getScreenshotAs(OutputType.FILE);
        File targetfile1 = new File(System.getProperty("user.dir")+"./Screenshots/logo.png");
        sourcefile1.renameTo(targetfile1);
    }
}
