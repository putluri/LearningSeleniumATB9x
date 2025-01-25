package com.arjunproject.ex34_FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUpload53 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        //1) Single File Upload
//        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Documents\\Test1.txt");
//         if (driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Test1.txt"))
//         {
//             System.out.println("File Uploaded Successfully");
//         }
//         else
//         {
//             System.out.println("File Not Uploaded");
//         }

       //2) Multiple File Upload
        String file1 = "C:\\Documents\\Test1.txt";
        String file2 = "C:\\Documents\\Test2.txt";
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);

        int noofFilesUploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();

        //Validation 1 - No of files
        if (noofFilesUploaded==2)
         {
             System.out.println("All files are uploaded");
         }
         else
         {
             System.out.println("Files are not uploaded or incorrect files uploaded");
         }

         //Validation 2 - Name of the files
            if (driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Test1.txt")
                    && driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Test2.txt"))
            {
                System.out.println("File names matching");
            }
            else
            {
                System.out.println("File names not matching");
            }
        }
    }

