package com.arjunproject.ex44_DataDriven;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//Excel File--->Workbook--->Sheets--->Rows--->Cells
public class WritingDynamicDataIntoExcel_66 {
    public static void main(String[] args) throws IOException {

        FileOutputStream  file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile_dynamic.xlsx");
        XSSFWorkbook  workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("DynamicData");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows?");
        int noOfrows = sc.nextInt();

        System.out.println("Enter no of cells?");
        int noOfcells = sc.nextInt();

        for(int r=0;r<noOfrows;r++)
        {
            XSSFRow row = sheet.createRow(r);
            for(int c=0;c<noOfcells;c++)
            {
                System.out.println("Enter the value");
                XSSFCell cell = row.createCell(c);
                cell.setCellValue(sc.next());
            }
        }

        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("Writing is done");
    }
}
