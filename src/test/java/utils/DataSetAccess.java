package utils;

import excelHandle.ExcelDataManager;
import org.testng.annotations.DataProvider;
import tests.BaseTest;

/**
 * Reads Data form Excel Sheet for Input Fields
 */

public class DataSetAccess {
    public String jobTitle, jobDescription, note;

    /**
     * Return Excel Sheet
     */
    public static final String FILE_PATH = BaseTest.resourcesRoot+"testdata\\ExcelFiles\\input_data.xlsx";

    @DataProvider(name = "inputFiledData")
    public static Object[][] getExcelFilePath(){
        System.out.println(BaseTest.resourcesRoot+"testdata\\ExcelFiles\\input_data.xlsx");
        return ExcelDataManager.getExcelData(FILE_PATH,"Sheet1",0,0);
    }
    public void inputFieldInfo(Object[] params){
        jobTitle = (String) params[0];
        jobDescription = (String) params[1];
        note = (String) params[2];


        Log.info("Excel Data Appearing : -------------------------------------------------------------"+jobTitle+" "+jobDescription+" "+note);
    }








}






