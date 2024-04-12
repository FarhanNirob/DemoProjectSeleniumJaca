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
    private By employeeId = By.cssSelector(".oxd-grid-2.orangehrm-full-width-grid .oxd-grid-item.oxd-grid-item--gutters input");
    private By generateLoginDetailsBtn = By.cssSelector(".oxd-switch-input.oxd-switch-input--active.--label-right");
    private By loginInformationInsertField = By.cssSelector(".oxd-input-group.oxd-input-field-bottom-space .oxd-input.oxd-input--active");
    private By saveBtn = By.cssSelector(".oxd-form-actions button:nth-child(3)");
    private By topBarEmployeeListMenu = By.cssSelector(".oxd-topbar-body-nav ul li:nth-child(2)");
    private By employeeNameSearchField = By.cssSelector(".oxd-grid-item.oxd-grid-item--gutters:first-child input");
    private By employeeIdSearchField = By.cssSelector(".oxd-grid-item.oxd-grid-item--gutters:nth-child(2) input");
    private By searchBtn = By.cssSelector(".oxd-form-actions button:last-child");
    private By employeeInformationCells = By.cssSelector(".oxd-table-card:first-child .oxd-table-cell.oxd-padding-cell");
    private By addEmployeeSuccessPopup = By.cssSelector(".oxd-toast.oxd-toast--success.oxd-toast-container--toast");



    public WebElement getNavbarPIMMenu(){return elementWithWait(navbarPIMMenu,"presence");}
    public WebElement getTopBarAddEmployeeMenu(){return elementWithWait(topBarAddEmployeeMenu,"clickable");}
    public WebElement getEmployeeFirstName(){return elementWithWait(employeeFirstName,"presence");}
    public WebElement getEmployeeMiddleName(){return elementWithWait(employeeMiddleName,"presence");}
    public WebElement getEmployeeLastName(){return elementWithWait(employeeLastName,"presence");}
    public WebElement getEmployeeId(){return elementWithWait(employeeId,"presence");}
    public WebElement getGenerateLoginDetailsBtn(){return elementWithWait(generateLoginDetailsBtn,"presence");}
    public List<WebElement> getLoginInformationInsertField(){return elementsWithWait(loginInformationInsertField,"presence");}
    public WebElement getSaveBtn(){return elementWithWait(saveBtn,"presence");}
    public WebElement getTopBarEmployeeListMenu(){return elementWithWait(topBarEmployeeListMenu,"presence");}
    public WebElement getEmployeeNameSearchField(){return elementWithWait(employeeNameSearchField,"presence");}
    public WebElement getEmployeeIdSearchField(){return elementWithWait(employeeIdSearchField,"presence");}
    public WebElement getSearchBtn(){return elementWithWait(searchBtn,"presence");}
    public List<WebElement> getEmployeeInformationCells(){return elementsWithWait(employeeInformationCells,"presence");}

    public WebElement getAddEmployeeSuccessPopup(){return elementWithWait(addEmployeeSuccessPopup,"presence");}



}
