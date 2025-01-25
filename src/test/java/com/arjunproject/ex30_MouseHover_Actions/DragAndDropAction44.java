package com.arjunproject.ex30_MouseHover_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DragAndDropAction44 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        //Drag and Drop1
        WebElement Copenhagen = driver.findElement(By.xpath("//div[@id='box4']"));
        WebElement Denmark = driver.findElement(By.xpath("//div[@id='box104']"));

        act.dragAndDrop(Copenhagen,Denmark).perform();

        //Drag and Drop2
        WebElement Rome = driver.findElement(By.xpath("//div[@id='box6']"));
        WebElement Italy = driver.findElement(By.xpath("//div[@id='box106']"));

        act.dragAndDrop(Rome,Italy).perform();
    }
}
