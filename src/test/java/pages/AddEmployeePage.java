package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class AddEmployeePage extends BasePage {
    public AddEmployeePage(WebDriver driver) throws IOException {
        super(driver);
    }

    private By navbarPIMMenu = By.cssSelector(".oxd-main-menu li:nth-child(2) a svg");
    private By topBarAddEmployeeMenu = By.cssSelector(".oxd-topbar-body ul li:nth-child(3) a");
    private By employeeFirstName = By.cssSelector(".--name-grouped-field .oxd-input.oxd-input--active.orangehrm-firstname");
    private By employeeMiddleName = By.cssSelector(".--name-grouped-field .oxd-input.oxd-input--active.orangehrm-middlename");
    private By employeeLastName = By.cssSelector(".--name-grouped-field .oxd-input.oxd-input--active.orangehrm-lastname");
    private By generateLoginDetailsBtn = By.cssSelector(".oxd-switch-input.oxd-switch-input--active.--label-right");
    private By loginInformationInsertField = By.cssSelector(".oxd-input-group.oxd-input-field-bottom-space .oxd-input.oxd-input--active");
    private By saveBtn = By.cssSelector(".oxd-form-actions button:nth-child(3)");



    public WebElement getNavbarPIMMenu(){return elementWithWait(navbarPIMMenu,"presence");}
    public WebElement getTopBarAddEmployeeMenu(){return elementWithWait(topBarAddEmployeeMenu,"clickable");}
    public WebElement getEmployeeFirstName(){return elementWithWait(employeeFirstName,"presence");}
    public WebElement getEmployeeMiddleName(){return elementWithWait(employeeMiddleName,"presence");}
    public WebElement getEmployeeLastName(){return elementWithWait(employeeLastName,"presence");}
    public WebElement getGenerateLoginDetailsBtn(){return elementWithWait(generateLoginDetailsBtn,"presence");}
    public List<WebElement> getLoginInformationInsertField(){return elementsWithWait(loginInformationInsertField,"presence");}
    public WebElement getSaveBtn(){return elementWithWait(saveBtn,"presence");}




}
