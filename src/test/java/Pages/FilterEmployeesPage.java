package Pages;

import Base.BaseUtil;
import Utilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FilterEmployeesPage extends BaseUtil {

    Helper help;

    public FilterEmployeesPage(WebDriver driver){
        help = new Helper();
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "ucPageHeader_ucRoleSwitcher_cboRole")
    public WebElement dropDownActingAs;

    @FindBy(how = How.ID, using = "cboFilter")
    public WebElement filterDropdown;

    @FindBy(how = How.ID, using = "cboWorkGroup")
    public WebElement filterWorkGroup;

    public void GetLocationURL() throws Exception {
        //String locationLabel = getLocationLabel.getText().toLowerCase();
        String url = BaseUtil.Web_Driver.getCurrentUrl();

        //System.out.println("You got this value: " + locationLabel);

        if (url.contains("Supervisor")) {
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(0);
//            actingAs.selectByValue("Location Administrator");
        } else if (url.contains("Location")) {
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(0);
        } else if (url.contains("HumanResources")) {
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(0);
        } else if (url.contains("ScheduleView")) {
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(0);
        } else if (url.contains("Admin")) {
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(0);
        } else if (url.contains("CompanyAdministrator")) {
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(0);
        }
        //help.waitForAWhile(dropDownActingAs.toString());
    }

    public void clickFilterDropdown() {
        Select select = new Select(filterDropdown);
        select.selectByIndex(2);
    }

    public void clickActiveFilterDropdown() {
        Select select = new Select(filterDropdown);
        select.selectByIndex(0);
    }

    public void clickInactiveFilterDropdown() {
        Select select = new Select(filterDropdown);
        select.selectByIndex(1);
    }

    public void clickWorkgroupDropdown() {
        Select select = new Select(filterWorkGroup);
        select.selectByIndex(15);
    }

    public void enterEmployeeName() {

    }
}
