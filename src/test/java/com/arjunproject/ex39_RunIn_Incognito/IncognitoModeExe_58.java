package com.arjunproject.ex39_RunIn_Incognito;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoModeExe_58 {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");  //Run in Incognito Mode

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.opencart.com/");
        driver.manage().window().maximize();

    }
}
