package com.arjunproject.ex25_Handle_Alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedPopup30 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //driver.get("https://the-internet.herokuapp.com/basic_auth");

        //Syntax
        //https://username:password@the-internet.herokuapp.com/basic_auth
        
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.manage().window().maximize();
    }
}
