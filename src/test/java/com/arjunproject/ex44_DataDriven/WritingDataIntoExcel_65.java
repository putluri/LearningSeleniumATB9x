package com.arjunproject.ex44_DataDriven;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Excel File--->Workbook--->Sheets--->Rows--->Cells
public class WritingDataIntoExcel_65 {
    public static void main(String[] args) throws IOException {

        FileOutputStream  file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
        XSSFWorkbook  workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Data");
        XSSFRow row1 = sheet.createRow(0);
             row1.createCell(0).setCellValue("Java");
             row1.createCell(1).setCellValue(19);
             row1.createCell(2).setCellValue("Automation");

        XSSFRow row2 = sheet.createRow(1);
        row2.createCell(0).setCellValue("Phyton");
        row2.createCell(1).setCellValue(34);
        row2.createCell(2).setCellValue("Automation");

        XSSFRow row3 = sheet.createRow(2);
        row3.createCell(0).setCellValue("C#");
        row3.createCell(1).setCellValue(14);
        row3.createCell(2).setCellValue("Automation");

        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("Writing is done");
    }
}
