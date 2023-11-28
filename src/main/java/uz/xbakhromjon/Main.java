package uz.xbakhromjon;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();

        HSSFRow header = sheet.createRow(0);
        header.createCell(0).setCellValue("ID");
        header.createCell(1).setCellValue("Name");
        header.createCell(2).setCellValue("Age");
        header.createCell(3).setCellValue("Money");

        int nextRow = 1;
        while (nextRow < 20) {
            HSSFRow row = sheet.createRow(nextRow);
            row.createCell(0).setCellValue(1);
            row.createCell(1).setCellValue("Umar");
            row.createCell(2).setCellValue(21);
            row.createCell(3).setCellValue(100);

            nextRow++;
        }

        File file = new File("users.xlsx");
        workbook.write(file);
        workbook.close();
    }
}
