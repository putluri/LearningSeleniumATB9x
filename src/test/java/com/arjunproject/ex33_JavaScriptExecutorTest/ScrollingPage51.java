package com.arjunproject.ex33_JavaScriptExecutorTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollingPage51 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //1. scroll down the page by pixel number
        js.executeScript("window.scrollBy(0,1000)", "");
        System.out.println(js.executeScript("return window.pageYOffset;"));

       //2. scroll down the page till the element is located.
        WebElement ele = driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
        js.executeScript("arguments[0].scrollIntoView();", ele);
        System.out.println(js.executeScript("return window.pageYOffset;")); //2435.199951171875

        //3. scroll down the page till the end of the page.
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;")); //2468

        //4.  scroll up the initial page.
        js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));
    }
}
