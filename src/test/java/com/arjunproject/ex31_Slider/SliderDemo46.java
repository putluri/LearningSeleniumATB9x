package com.arjunproject.ex31_Slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SliderDemo46 {
    public static void main(String[] args) {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();
        Actions act = new Actions(driver);

        // Min slider
        WebElement min_slider = driver.findElement(By.xpath("(//span[contains(@class, 'ui-slider-handle')])[1]"));
        System.out.println("Location of the min slider before moving: " + min_slider.getLocation());
        System.out.println("Size of the min slider: " + min_slider.getSize());    //(59, 250)
        act.clickAndHold(min_slider).moveByOffset(100, 0).release().perform(); // Move horizontally
        System.out.println("Location of the min slider after moving: " + min_slider.getLocation());

        // Max slider
        WebElement max_slider = driver.findElement(By.xpath("(//span[contains(@class, 'ui-slider-handle')])[2]"));
        System.out.println("Location of the max slider before moving: " + max_slider.getLocation());
        System.out.println("Size of the max slider: " + max_slider.getSize());  // (612, 250)
        act.clickAndHold(max_slider).moveByOffset(-100, 0).release().perform(); // Move horizontally
        System.out.println("Location of the max slider after moving: " + max_slider.getLocation()); // (512, 250)


    }
}
