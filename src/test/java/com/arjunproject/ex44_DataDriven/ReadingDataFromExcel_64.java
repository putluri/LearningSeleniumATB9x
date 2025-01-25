package com.arjunproject.ex44_DataDriven;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Excel File--->Workbook--->Sheets--->Rows--->Cells
public class ReadingDataFromExcel_64 {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\Arjun Reddy\\IdeaProjects\\LearningSeleniumATB9x\\Files\\Book1.xlsx");
        XSSFWorkbook  workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1"); //XSSFSheet sheet = workbook.getSheetAt(0);
        int totalRows = sheet.getLastRowNum();
        int totalCells = sheet.getRow(1).getLastCellNum();
        System.out.println("Total no of rows :"+totalRows);
        System.out.println("Total no of cells :"+totalCells);

        for(int r=0;r<=totalRows;r++)
         {
             XSSFRow  currentRow = sheet.getRow(r);
            for(int c=0;c<totalCells;c++)
            {
                XSSFCell cell = currentRow.getCell(c);
                System.out.print(cell.toString()+" ");
            }
            System.out.println();
        }
        workbook.close();
        file.close();
    }
}
