package Utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.

public class ReadExcel {

    public static void readExcelFile() throws Exception{
        File src = new File("E:\\Projects\\Automation\\BDD Framework\\TestCaseDoc.xlsx");

        FileInputStream file = new FileInputStream(src);

        XSSFWorkbook wb = new XSSFWorkbook(file);

        XSSFSheet sheet1 = wb.getSheetAt(0);

        String data1 = sheet1.getRow(1).getCell(1).getStringCellValue();

        System.out.println("Data from Excel is " + data1);
    }
}