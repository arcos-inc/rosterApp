package Utilities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

    private static XSSFSheet mSheet;

    private ReadExcel() {
    }

    public static void readExcelFile() {
        if (mSheet != null) {
            return;
        }
        File src = new File("C:\\\\Users\\\\SO-PC-008\\\\Documents\\\\GitHub\\\\rosterApp\\\\src\\\\test\\\\java\\\\ExcelFiles\\rosterAppKeywords.xlsx");

        try {
            FileInputStream file = new FileInputStream(src);

            XSSFWorkbook wb = new XSSFWorkbook(file);

            mSheet = wb.getSheetAt(0);

            //String data1 = sheet1.getRow(1).getCell(1).getStringCellValue();

            //return sheet1.getRow(1).getCell(2).getStringCellValue();
        } catch (Exception ex) {
            System.out.println("You got: " + ex);
        }

        return;
    }

    public static String GetCellValue(int row, int column) {
        if (mSheet == null) {
            return "";
        }
        return mSheet.getRow(row).getCell(column).getStringCellValue();
    }
}