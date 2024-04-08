package tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.JobCreationPage;
import pages.Page;
import utils.Constant;
import utils.DataSetAccess;
import utils.Helper;
import utils.Log;


public class JobCreationTest extends BaseTest{
    WebDriver driver;
    Page page;
    public JobCreationTest(String url) {
        super(url);
    }



    @BeforeClass
    public void beforeClass(){
        driver = BaseTest.driver;
        page = BaseTest.page;
    }



    /**
     * Job Creation with admin user
     * The case will be executed with every row from excel
     */
    @Test(dataProvider = "inputFiledData", dataProviderClass = DataSetAccess.class)
    public void verifyJobCreation(Object ...params) throws Exception {


        Log.info("Into verifyJobCreation Test");

        dataSetAccess.inputFieldInfo(params);

        // Get Data from Excel
        String jobTitle = dataSetAccess.jobTitle;
        String JobDescription = dataSetAccess.jobDescription;
        String note = dataSetAccess.note;

        //Logged In as Admin
        Helper.adminLogin();

        //Admin Menu Selected
        page.getInstance(JobCreationPage.class).getNavbarAdminMenu().click();
        Log.info("Admin Menu Selected");
        String adminMenuUrl = driver.getCurrentUrl();
        Log.debug("Admin page Url: "+adminMenuUrl);
        softAssert.assertEquals(adminMenuUrl, Constant.adminPageUrl);

        //Select Job Section
        page.getInstance(JobCreationPage.class).getTopBarJobMenu().click();
        Log.info("Job Menu Clicked");

        //Select Job Title
        page.getInstance(JobCreationPage.class).getJobTitleDropdownOption().click();
        Log.info("Job Title Option Selected");
        String jobTitleListPageUrl = driver.getCurrentUrl();
        Log.info("Job Title List Page Url:"+jobTitleListPageUrl);
        softAssert.assertEquals(jobTitleListPageUrl,Constant.JobTitleListPageUrl);

        //Select Add Button
        page.getInstance(JobCreationPage.class).getJobTitleAddBtn().click();
        Log.info("Add Button Clicked");
        String saveJobTitlePageUrl = driver.getCurrentUrl();
        Log.info("Save Job Title Page Url:"+saveJobTitlePageUrl);
        softAssert.assertEquals(saveJobTitlePageUrl,Constant.saveJobTitlePage);


        //Insert Data to Field
        page.getInstance(JobCreationPage.class).getJobTitleInputField().sendKeys(jobTitle);
        page.getInstance(JobCreationPage.class).getJobDescriptionTextArea().sendKeys(JobDescription);
        page.getInstance(JobCreationPage.class).getNote().sendKeys(note);

        Log.info("Data Inserted Successfully");

        //Job Specification File Upload
        String filePath = System.getProperty("user.dir") + "\\resources\\testdata\\Image\\test.png";
        page.getInstance(JobCreationPage.class).getJobSpecificationFileUpload().sendKeys(filePath);
        Log.info("File Upload Successfully");

        //Save Button Clicked
        page.getInstance(JobCreationPage.class).getSaveBtn().click();
        Log.info("Save Button Clicked");

        takeScreenshot(driver, "./resources/"+"Screenshot\\jobCreation.png");

        //Logout
        Helper.logout();


        }


}
