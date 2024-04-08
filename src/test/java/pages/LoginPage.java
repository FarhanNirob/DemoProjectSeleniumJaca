package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) throws IOException {
        super(driver);
    }

    private By usernameField = By.cssSelector("input[name='username']");
    private By passwordField = By.cssSelector("input[name='password']");
    private By loginBtn = By.cssSelector("button[type='submit']");
    private By loggedInUsername = By.cssSelector(".oxd-userdropdown-name");
    private By invalidCredentialsTxt = By.cssSelector(".oxd-text.oxd-text--p.oxd-alert-content-text");
    private By profileDropdown = By.cssSelector(".oxd-userdropdown-tab i");
    private By logoutBtn = By.cssSelector(".oxd-dropdown-menu li:last-child");

//    private By emailField = By.name("email");
//    private By passwordField = By.name("Password");
//    private By popupClose = By.cssSelector("img[title='Close']");
//    private By company = By.xpath("(//input[@name='company'])[1]");
//    private By mobile_number = By.xpath("(//input[@name='mobile number'])[1]");
//    private By submit_btn = By.cssSelector("button[value='Submit']");
//    private By checkoutBtn = By.cssSelector(".dropbtn");
//    private By joinTrainingLink = By.linkText("Join Training");
//    private By tryTestCaseStudioLink = By.partialLinkText("Try TestCa");
//    private By firstCheckbox = By.xpath("(//input[@type='checkbox'])[1]");
//    private By secondCheckbox = By.xpath("(//input[@type='checkbox'])[2]");
//    private By thirdCheckbox = By.xpath("(//input[@type='checkbox'])[3]");
//    private By carDD = By.id("cars");
//    private By chooseFile = By.xpath("//input[@id='myFile']");
//    private By alertBtn = By.xpath("//button[@onclick='windowAlertFunction()']");
//    private By promptAlertBtn = By.xpath("//button[@onclick='promptAlertFunction()']");
//    private By iframeLink = By.partialLinkText("Click to practice iframe");
//    private By iframeText = By.xpath("//input[@id='glaf']");
//    private By datePicker = By.xpath("//input[@name='the_date']");
//    private By cellValue = By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[2]");
//    private By column = By.cssSelector("table[id='resultTable'] thead tr th");
//    private By row = By.xpath("//table[@id='resultTable'] //tbody //tr");
//    private By coronaText = By.cssSelector(".সংক্রমণ span");

    public WebElement getUsernameField(){return elementWithWait(usernameField,"presence");}
    public WebElement getPasswordField(){return elementWithWait(passwordField,"presence");}
    public WebElement getLoginBtn(){return elementWithWait(loginBtn,"clickable");}
    public WebElement getLoggedInUsername(){return elementWithWait(loggedInUsername,"clickable");}
    public WebElement getInvalidCredentialsTxt(){return elementWithWait(invalidCredentialsTxt,"presence");}
    public WebElement getProfileDropdown(){return elementWithWait(profileDropdown,"clickable");}
    public WebElement getLogoutBtn(){return elementWithWait(logoutBtn,"clickable");}
//    public WebElement getEmailField(){return elementWithWait(emailField,"presence");}
//    public WebElement getPasswordField(){return elementWithWait(passwordField,"presence");}
//    public WebElement getPopupCloseBtn(){return elementWithWait(popupClose,"clickable");}
//    public WebElement getCompany(){return elementWithWait(company,"presence");}
//    public WebElement getMobile_number(){return elementWithWait(mobile_number,"presence");}
//    public WebElement getSubmit_btn(){return elementWithWait(submit_btn,"clickable");}
//    public WebElement getCheckoutBtn(){return elementWithWait(checkoutBtn,"clickable");}
//    public WebElement getJoinTrainingLink(){return elementWithWait(joinTrainingLink,"clickable");}
//    public WebElement getTryTestCaseStudioLink(){return elementWithWait(tryTestCaseStudioLink,"clickable");}
//    public WebElement getFirstCheckbox(){return elementWithWait(firstCheckbox,"clickable");}
//    public WebElement getSecondCheckbox(){return elementWithWait(secondCheckbox,"clickable");}
//    public WebElement getThirdCheckbox(){return elementWithWait(thirdCheckbox,"clickable");}
//    public WebElement getCarDD(){return elementWithWait(carDD,"presence");}
//    public WebElement getChooseFile(){return elementWithWait(chooseFile,"presence");}
//    public WebElement getAlertBtn(){return elementWithWait(alertBtn,"clickable");}
//    public WebElement getPromptAlertBtn(){return elementWithWait(promptAlertBtn,"clickable");}
//    public WebElement getIFrameLink(){return elementWithWait(iframeLink,"clickable");}
//    public WebElement getIFrameTextArea(){return elementWithWait(iframeText,"presence");}
//    public WebElement getDatePicker(){return elementWithWait(datePicker,"presence");}
//    public WebElement getCellValue(){return elementWithWait(cellValue,"presence");}
//    public List<WebElement> getColumn(){return elementsWithWait(column,"presence");}
//    public List<WebElement> getRow(){return elementsWithWait(row,"presence");}
//    public WebElement getCoronaText(){return elementWithWait(coronaText,"presence");}

}
