package tests;

//import databaseConnection.DatabaseConnection;
//import excelhandle.WriteExcelSheet;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.Page;
//import utils.DataSetAccess;
import utils.ConfigProperties;
import utils.Constant;
import utils.Helper;
import utils.Log;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static utils.Constant.*;

public class LoginTest extends BaseTest{
    WebDriver driver;
    Page page;
//    WriteExcelSheet writeExcelSheet;
//    DatabaseConnection databaseConnection;
    public LoginTest(String url) {
        super(url);
    }



    @BeforeClass
    public void beforeClass(){
        driver = BaseTest.driver;
        page = BaseTest.page;
//        writeExcelSheet = new WriteExcelSheet();
//        databaseConnection = new DatabaseConnection();
    }


//    @Test
//    public void locatorTest() throws Exception {
//        SoftAssert softAssert = new SoftAssert();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        System.out.println("Test Start .......");
//
//        popupHandle();
//
//        String pageTitle = driver.getTitle();     //Get the page title
//        System.out.println("Page title is: "+pageTitle);
//
//        //Get the current URL
//        String current_url = driver.getCurrentUrl();
//        System.out.println("Current url is: "+current_url);
//        softAssert.assertEquals(current_url,"bootcamp_url");
//
//        page.getInstance(HomePage.class).getEmailField().sendKeys(user_email);
//        page.getInstance(HomePage.class).getPasswordField().sendKeys(password);
//        page.getInstance(HomePage.class).getCompany().sendKeys(company_name);
//        page.getInstance(HomePage.class).getMobile_number().sendKeys(Mobile_number);
//        page.getInstance(HomePage.class).getSubmit_btn().click();
//
//
//        //LinkText & PartialLinkText
//        WebElement checkoutButton = page.getInstance(HomePage.class).getCheckoutBtn();
//        checkoutButton.click();
//        page.getInstance(HomePage.class).getJoinTrainingLink().click();   //linkText
//
//        Thread.sleep(5000);
//
//        //Window handles
//        Set w = driver.getWindowHandles();
//        Iterator t = w.iterator();
//        String a = (String) t.next();
//        String b = (String) t.next();
//        driver.switchTo().window(b);
//        driver.close();
//
//        driver.switchTo().window(a);
//
//        Thread.sleep(2000);
//
//        driver.navigate().refresh();  //Refresh the current page
//        page.getInstance(HomePage.class).getCheckoutBtn().click();
//        page.getInstance(HomePage.class).getTryTestCaseStudioLink().click();   //PartialLinkText
//        driver.switchTo().window(a);
//
//        //Select element for dropdown
//        WebElement chooseCarDropdown = page.getInstance(HomePage.class).getCarDD();
//        Select select = new Select(chooseCarDropdown);
//        List<WebElement> carTypes = select.getOptions();
//        carTypes.get(1).click();
//
//        //Scroll down
//        js.executeScript("window.scrollBy(200,0)", "");
//
//        //Find the date time picker control
//        WebElement datePicker = page.getInstance(HomePage.class).getDatePicker();
////        datePicker.click();
//        datePicker.sendKeys("03282024");   //Fill date as mm/dd/yyyy as 03/28/2024
//        datePicker.sendKeys(Keys.TAB);
//        takeScreenshot(driver, "./resources/"+"Screenshots\\datepicker.png");
//
//
//        //Scroll down
//        js.executeScript("window.scrollBy(700,0)", "");
//
//        //Checkbox Select
//        page.getInstance(HomePage.class).getFirstCheckbox().click();
//        page.getInstance(HomePage.class).getSecondCheckbox().click();
//        page.getInstance(HomePage.class).getThirdCheckbox().click();
//
//        //Finding number of Rows
//        List<WebElement> rowsNumber = page.getInstance(HomePage.class).getRow();
//        int rowCount = rowsNumber.size();
//        System.out.println("No of rows in this table : " + rowCount);
//
//        //Finding number of Columns
//        List<WebElement> columnsNumber = page.getInstance(HomePage.class).getColumn();
//        int columnCount = columnsNumber.size();
//        System.out.println("No of columns in this table : " + columnCount);
//
//        //Finding cell value at 6th row and 2rd column
//        WebElement cellAddress = page.getInstance(HomePage.class).getCellValue();
//        String value = cellAddress.getText();
//        System.out.println("The Cell Value is : " +value);
//
//        //Call the screenshot function
//        takeScreenshot(driver, "./resources/"+"Screenshots\\test.png");
//
////        driver.navigate().refresh();
//
//        //Scroll down
//        js.executeScript("window.scrollBy(600,0)", "");
//        js.executeScript("window.scrollBy(700,0)", "");
//
//        //Explicit wait
////        WebDriver wait = new WebDriverWait(driver,20);
//
//        //Upload file from choose file
//        String filePath = System.getProperty("user.dir") + "\\resources\\Image.png";
//        page.getInstance(HomePage.class).getChooseFile().sendKeys(filePath);
//
//
//        //Handling Window Alerts
//        page.getInstance(HomePage.class).getAlertBtn().click();
//        Alert alert;
//        alert = driver.switchTo().alert();
//        System.out.println("Alert text is: "+alert.getText());
//        alert.accept();
//
//        page.getInstance(HomePage.class).getPromptAlertBtn().click();
//        alert = driver.switchTo().alert();
////        driver.findElement()
//        driver.switchTo().alert().sendKeys("Test.......Test........");
//        alert.dismiss();
//
//        //Capture the contents of a page
//        String pageContent = js.executeScript("return document.documentElement.outerHTML;").toString();
//        System.out.println("Page Content is: "+pageContent);
//
//        //Handling Broken Links
//       /* // Find all the links on the page
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//
//        // Iterate through each link and check if it's broken
//        for (WebElement link : links) {
//            String url = link.getAttribute("href");
//
//            if (url != null && !url.isEmpty()) {
//                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
//                connection.setRequestMethod("GET");
//                connection.connect();
//
//                int statusCode = connection.getResponseCode();
//                if (statusCode >= 400) {
//                    System.out.println("Broken Link: " + url + " - Status Code: " + statusCode);
//                } else {
//                    System.out.println("Valid Link: " + url + " - Status Code: " + statusCode);
//                }
//            }
//        }*/
//
//
//        Thread.sleep(5000);
////        js.executeScript("window.scrollBy(300,0)", "");
////
////        //Handling Frames
////        page.getInstance(HomePage.class).getIFrameLink().click();
////
////        String currentUrl = driver.getCurrentUrl();
////        System.out.println("iFrame url is: "+currentUrl);
////        softAssert.assertEquals(currentUrl,"https://selectorshub.com/iframe-in-shadow-dom/");
////
////        driver.switchTo().frame(0); //Switch to frame
////        page.getInstance(HomePage.class).getIFrameTextArea().sendKeys("Checking iFrame..");
//
//
//        Thread.sleep(5000);
//
//
//    }
//
//
//    @Test(dataProvider = "inputFiledData", dataProviderClass =DataSetAccess.class)
//    public void dataDrivenTest(Object ...params) throws InterruptedException {
//        dataSetAccess.inputFieldInfo(params);
//
//        // Get Data from Excel
//        String userEmail = dataSetAccess.email;
//        String userName = dataSetAccess.name;
//        String userCompany = dataSetAccess.company;
//        String userMobileNumber = dataSetAccess.mobileNumber;
//
//        //Insert Data to Field
//        page.getInstance(HomePage.class).getEmailField().sendKeys(userEmail);
//        page.getInstance(HomePage.class).getPasswordField().sendKeys(userName);
//        page.getInstance(HomePage.class).getCompany().sendKeys(userCompany);
//        page.getInstance(HomePage.class).getMobile_number().sendKeys(userMobileNumber);
//
//        Thread.sleep(2000);// To See the Inserted Value
//
//        //Clear Field
//        page.getInstance(HomePage.class).getEmailField().clear();
//        page.getInstance(HomePage.class).getPasswordField().clear();
//        page.getInstance(HomePage.class).getCompany().clear();
//        page.getInstance(HomePage.class).getMobile_number().clear();
//
//        Log.info("Data Inserted Successfully");
//
//        Thread.sleep(2000);// To See the cleared Field
//
//
//    }
//
//
//    @Test
//    public void writeInExcel() throws IOException {
//
//        //Get Text
//        String coronaTxt = page.getInstance(HomePage.class).getCoronaText().getText();
//        Log.info("**************** Text Value: "+coronaTxt);
//
//        //Writing the Value to the Excel Sheet
//        writeExcelSheet.writeData(coronaTxt,0);
//        Log.info("In Write in Excel Test Class...............");
//    }
//
//    @Test
//    public void dbTest() throws IOException {
//
//        //Database Connection
//        databaseConnection.dbConnect();
//        Log.info("In Database Test Class...............");
//    }

    /**
     * Login with valid credentials
     */
    @Test
    public void verifyLoginWithValidInput() throws Exception {


        Log.info("Into verifyLoginWithValidInput Test");

        //Url Assertion
        String currentUrl = driver.getCurrentUrl();
        Log.debug("Current Url: "+ currentUrl);
        String expectedUrl = configProperties.config.getProperty("BASE_URL");
        Log.info("Expected Url: "+expectedUrl);
        softAssert.assertEquals(currentUrl,expectedUrl);

        //Insert Credentials
        page.getInstance(LoginPage.class).getUsernameField().sendKeys(adminUsername);
        page.getInstance(LoginPage.class).getPasswordField().sendKeys(adminPassword);

        //Click on login Button
        page.getInstance(LoginPage.class).getLoginBtn().click();
        Log.info("Login Button Clicked");

        //Logged in User Info
        String loggedInUserInfo = page.getInstance(LoginPage.class).getLoggedInUsername().getText();
        Log.debug("Actual Logged In Username: "+loggedInUserInfo);
//        softAssert.assertEquals(loggedInUserInfo,adminUserInfo);

        String adminLoggedInUrl = driver.getCurrentUrl();
        Log.info("Logged In page URL: "+adminLoggedInUrl);

        captureScreenshot(driver,"verifyLoginWithValidInput");

        //Logout
        Helper.logout();

        softAssert.assertAll();

    }


    /**
     * Login with invalid credentials
     */
    @Test
    public void verifyLoginWithInvalidCredentials() throws Exception {


        Log.info("Into verifyLoginWithInvalidCredentials Test");

        //Url Assertion
        String currentUrl = driver.getCurrentUrl();
        Log.debug("Current Url: "+ currentUrl);
        String expectedUrl = configProperties.config.getProperty("BASE_URL");
        Log.info("Expected Url: "+expectedUrl);
        softAssert.assertEquals(currentUrl,expectedUrl);

        //Random String generation
        String random = Helper.generateRandomString(8);
        Log.info("Random Generated String: "+random);

        //Insert Credentials
        page.getInstance(LoginPage.class).getUsernameField().sendKeys(random);
        page.getInstance(LoginPage.class).getPasswordField().sendKeys(random);

        //Click on login Button
        page.getInstance(LoginPage.class).getLoginBtn().click();
        Log.info("Login Button Clicked with Invalid Credentials");

        //Invalid Credentials Assertion
        String popUpText = page.getInstance(LoginPage.class).getInvalidCredentialsTxt().getText();
        Log.debug("Popup Text for Invalid Credentials: "+popUpText);
        softAssert.assertEquals(popUpText,invalidCredentialsPopupText);

//        takeScreenshot(driver, "./resources/"+"Screenshot\\invalidLogin.png");
        captureScreenshot(driver,"verifyLoginWithInvalidCredentials");

        softAssert.assertAll();

    }




}
