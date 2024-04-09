package excelHandle;

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

        int lastRow = sheet.getLastRowNum();

        //-1 indicating the sheet is empty. So the last row number is set to 0.
        if(lastRow == -1){
            lastRow = 0;
        }
        Log.info("********** Last Row: "+lastRow);

        Row createdRow = sheet.createRow(lastRow+1); // Adding new row after finding the last row.
        Log.info("********** Created Row: "+createdRow.toString());


        createdRow.createCell(cellNumber).setCellValue(writeValue);
        Log.info("*********** Data Inserted to Excel Sheet Successfully.");


        FileOutputStream fos = new FileOutputStream(source);

        xsf.write(fos);

        fos.close();
    }
}
