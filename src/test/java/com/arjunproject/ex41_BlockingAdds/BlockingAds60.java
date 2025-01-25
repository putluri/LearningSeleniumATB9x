package com.arjunproject.ex41_BlockingAdds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class BlockingAds60 {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        File file = new File("C:\\Users\\Arjun Reddy\\AutomationFiles\\CRX Files\\uBlock-Origin-Chrome-Web-Store.crx");
        options.addExtensions(file);  //Enable Extensions at Runtime

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

    }
}
