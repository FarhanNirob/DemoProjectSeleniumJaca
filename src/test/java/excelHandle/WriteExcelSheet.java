package excelHandle;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelSheet {
    public void writeData(String writeValue, int cellNumber) throws IOException {

        String filePath = System.getProperty("user.dir") + "\\resources\\testdata\\ExcelFiles\\TestDataWrite.xlsx";

        File source = new File(filePath);// File path set here....
        FileInputStream fis = new FileInputStream(source);
        XSSFWorkbook xsf = new XSSFWorkbook(fis);
        XSSFSheet sheet = xsf.getSheetAt(0);

        Log.info("Inside Write Data Function");

        int rowNumber = 0; // Start from the specified row number, Starting from 0

        // Find the next available row with no data in the specified cell
        while (sheet.getRow(rowNumber) != null && sheet.getRow(rowNumber).getCell(cellNumber) != null
                && sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue() != null
                && !sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue().isEmpty()) {
            rowNumber++; // Move to the next row
        }

        Row row = sheet.getRow(rowNumber); // Check if row already exists

        if (row == null) {
            // If row does not exist, create a new row
            row = sheet.createRow(rowNumber);
            Log.info("********** Created Row: " + row.toString());
        } else {
            Log.info("********** Row already exists: " + row.toString());
        }

        // Update cell value
        Cell cell = row.getCell(cellNumber);
        if (cell == null) {
            // If cell does not exist, create a new cell
            cell = row.createCell(cellNumber);
        }
        cell.setCellValue(writeValue);
        Log.info("*********** Data Inserted to Excel Sheet Successfully.");

        FileOutputStream fos = new FileOutputStream(source);

        xsf.write(fos);

        fos.close();
    }
}
