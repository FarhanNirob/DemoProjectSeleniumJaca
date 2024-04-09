package tests;


import excelHandle.WriteExcelSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddEmployeePage;
import pages.LoginPage;
import pages.Page;
import utils.Constant;
import utils.Helper;
import utils.Log;

import java.util.List;

import static utils.Constant.*;

public class AddEmployeeTest extends BaseTest{
    WebDriver driver;
    Page page;
    WriteExcelSheet writeExcelSheet;
    public AddEmployeeTest(String url) {
        super(url);
    }



    @BeforeClass
    public void beforeClass(){
        driver = BaseTest.driver;
        page = BaseTest.page;
        writeExcelSheet = new WriteExcelSheet();
    }


    /**
     * Login with valid credentials
     */
    @Test
    public void verifyAddEmployee() throws Exception {


        Log.info("Into verifyAddEmployee Test");

        //Url Assertion
        String currentUrl = driver.getCurrentUrl();
        Log.debug("Current Url: "+ currentUrl);
        String expectedUrl = configProperties.config.getProperty("BASE_URL");
        Log.info("Expected Url: "+expectedUrl);
        softAssert.assertEquals(currentUrl,expectedUrl);

        //Login as Admin
        Helper.adminLogin();

        //Select PIM
        page.getInstance(AddEmployeePage.class).getNavbarPIMMenu().click();
        Log.info("PIM Menu Clicked");

        //Select add Employee
        page.getInstance(AddEmployeePage.class).getTopBarAddEmployeeMenu().click();
        Log.info("Add Employee Menu Clicked");

        //Insert Employee Information
        String firstName = Helper.generateRandomString(5)+"FirstName";
        String middleName = Helper.generateRandomString(5)+"MiddleName";
        String lastName = Helper.generateRandomString(5)+"LastName";
        page.getInstance(AddEmployeePage.class).getEmployeeFirstName().sendKeys(firstName);
        page.getInstance(AddEmployeePage.class).getEmployeeMiddleName().sendKeys(middleName);
        page.getInstance(AddEmployeePage.class).getEmployeeLastName().sendKeys(lastName);

        Log.info("Inserted Employee Information: "+" "+firstName+ " "+middleName+ " "+ lastName);

        //Generate Login Information
        page.getInstance(AddEmployeePage.class).getGenerateLoginDetailsBtn().click();
        Log.debug("Generate Login Information Button Clicked");

        //Insert Login Information
        List<WebElement> loginInformationInsertFields = page.getInstance(AddEmployeePage.class).getLoginInformationInsertField();

        //Username
        loginInformationInsertFields.get(4).sendKeys(employeeUsername);
        //Password
        loginInformationInsertFields.get(5).sendKeys(employeePassword);
        //Confirm Password
        loginInformationInsertFields.get(6).sendKeys(employeePassword);

        Log.info("Login Information Inserted");

        //Click on save button
        page.getInstance(AddEmployeePage.class).getSaveBtn().click();
        Log.info("Save Button Clicked");



        captureScreenshot(driver,"verifyAddEmployee");

        //Logout
        Helper.logout();

        softAssert.assertAll();

    }








}
