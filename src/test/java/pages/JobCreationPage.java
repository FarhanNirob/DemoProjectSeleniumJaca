package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.io.IOException;

public class JobCreationPage extends BasePage {
    public JobCreationPage(WebDriver driver) throws IOException {
        super(driver);
    }

    private By navbarAdminMenu = By.cssSelector(".oxd-navbar-nav ul li:first-child a span");
    private By topBarJobMenu = By.cssSelector(".oxd-topbar-body-nav ul li:nth-child(2) i");
    private By jobTitleDropdownOption = By.cssSelector(".oxd-dropdown-menu li:nth-child(1)");
    private By jobTitleAddBtn = By.cssSelector(".orangehrm-header-container button i");
    private By jobTitleInputField = By.cssSelector(".oxd-form-row:first-child input");
    private By jobDescriptionTextArea = By.cssSelector(".oxd-form-row:nth-child(2) textarea");
    private By jobSpecificationFileUpload = By.cssSelector(".oxd-form-row:nth-child(3) .oxd-file-input");
    private By note = By.cssSelector(".oxd-form-row:nth-child(4) textarea");
    private By saveBtn = By.cssSelector(".oxd-form-actions button:last-child");


    public WebElement getNavbarAdminMenu(){return elementWithWait(navbarAdminMenu,"presence");}
    public WebElement getTopBarJobMenu(){return elementWithWait(topBarJobMenu,"clickable");}
    public WebElement getJobTitleDropdownOption(){return elementWithWait(jobTitleDropdownOption,"clickable");}
    public WebElement getJobTitleAddBtn(){return elementWithWait(jobTitleAddBtn,"clickable");}
    public WebElement getJobTitleInputField(){return elementWithWait(jobTitleInputField,"presence");}
    public WebElement getJobDescriptionTextArea(){return elementWithWait(jobDescriptionTextArea,"presence");}
    public WebElement getJobSpecificationFileUpload(){return elementWithWait(jobSpecificationFileUpload,"presence");}
    public WebElement getNote(){return elementWithWait(note,"presence");}
    public WebElement getSaveBtn(){return elementWithWait(saveBtn,"presence");}



}
