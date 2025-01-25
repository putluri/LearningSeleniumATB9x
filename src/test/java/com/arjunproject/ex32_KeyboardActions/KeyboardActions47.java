package com.arjunproject.ex32_KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardActions47 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("WELCOME");
        Actions act = new Actions(driver);
        //Cntrl+A
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
        //Cntrl+C
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
        //Tab
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        //Cntrl+V
        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
    }
}
