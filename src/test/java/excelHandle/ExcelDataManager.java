package excelHandle;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import tests.BaseTest;
import utils.Log;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExcelDataManager {

    private static InputStream getInputStream(String file){
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            return fileInputStream;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object[][] getExcelData(String path, String sheetName, int startRowNo, int endRowNo) {
        try {
            Object[][] data = readFile(getInputStream(path), sheetName);// Set

            getTotalExcelRowData(path);
            Log.debug("BaseTest.dataRowCount = data.length  :  "+BaseTest.dataRowCount);
            System.out.println("BaseTest.dataRowCount = data.length  : "+BaseTest.dataRowCount);

//            endRowNo = data.length;
            Object[][] resultData = new Object[data.length - startRowNo][];

            if (endRowNo > data.length) { return null; }
            int index = 0;
            for (int i = startRowNo; i < data.length; i++) {
                resultData[index++] = data[i];
            }
            return resultData;
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }


    public static void getTotalExcelRowData(String path) throws IOException {
        Object[][] data = readFile(getInputStream(path), "Sheet1"); //Set Sheet
        BaseTest.dataRowCount = data.length;
    }


    public static XSSFWorkbook workbook;
    public static XSSFSheet worksheet;
    public static DataFormatter formatter= new DataFormatter();

    public static Object[][] readFile(InputStream inputStream, String SheetName) throws IOException {
        System.out.println("Read File Result: "+inputStream);


        workbook = new XSSFWorkbook(inputStream); //get my workbook
        worksheet = workbook.getSheet(SheetName);// get my sheet from workbook
        XSSFRow Row = worksheet.getRow(0);//get my Row which start from 0

        int RowNum = worksheet.getPhysicalNumberOfRows();// count my number of Rows
        int ColNum = Row.getLastCellNum(); // get last ColNum

        Object Data[][] = new Object[RowNum - 1][ColNum]; // pass my count data in array

        for (int i = 0; i < RowNum - 1; i++) //Loop work for Rows
        {
            XSSFRow row = worksheet.getRow(i + 1);

            for (int j = 0; j < ColNum; j++) //Loop work for colNum
            {
                if (row == null)
                    Data[i][j] = "";
                else {
                    XSSFCell cell = row.getCell(j);
                    if (cell == null)
                        Data[i][j] = ""; //if it get Null value it pass no data
                    else {
                        String value = formatter.formatCellValue(cell);
                        Data[i][j] = value; //This formatter get my all values as string i.e integer, float all type data value
                    }
                }
            }
        }

        return Data;
    }

}
