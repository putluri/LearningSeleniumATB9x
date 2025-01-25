package com.arjunproject.ex45_DataDriven2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class FDCalculator_69 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
        driver.manage().window().maximize();

        String filepath = System.getProperty("user.dir")+"\\testdata\\caldata.xlsx";
        int rows = ExcelUtils_68.getRowCount(filepath, "Sheet1");
        for (int i=1; i<=rows; i++)
        {
            //read data from excel
            String pric = ExcelUtils_68.getCellData(filepath,"Sheet1",i,0);
            String rateofinterest = ExcelUtils_68.getCellData(filepath,"Sheet1",i,1);
            String per1 = ExcelUtils_68.getCellData(filepath,"Sheet1",i,2);
            String per2 = ExcelUtils_68.getCellData(filepath,"Sheet1",i,3);
            String fre = ExcelUtils_68.getCellData(filepath,"Sheet1",i,4);
            String exp_mvalue = ExcelUtils_68.getCellData(filepath,"Sheet1",i,5);

            //pass above data into application.
            driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pric);
            driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterest);
            driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
            Select perdrp = new Select(driver.findElement(By.xpath("//input[@id='interest']")));
            perdrp.selectByVisibleText(per2);

            Select fredrp = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
            fredrp.selectByVisibleText(fre);

            driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click(); //Clicked on Calculate

            //validation
            String act_mvalue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
            if (Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))
            {
                System.out.println("Test Passed");
                ExcelUtils_68.setCellData(filepath,"Sheet1", i,7,"Passed");
                ExcelUtils_68.fillGreenColor(filepath,"Sheet1",i,7);
            }
            else
            {
                System.out.println("Test Failed");
                ExcelUtils_68.setCellData(filepath,"Sheet1", i,7,"Failed");
                ExcelUtils_68.fillRedColor(filepath,"Sheet1",i,7);
            }
            Thread.sleep(3000);
            driver.findElement(By.xpath("//img[@class='PL5']")).click(); //clicked on Clear button
        } //Ending of for loop
        driver.quit();
    }
}
