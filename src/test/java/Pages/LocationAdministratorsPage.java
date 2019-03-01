package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LocationAdministratorsPage {

    public LocationAdministratorsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "lnkNew")
    //@CacheLookup
    public WebElement addAdministratorLink;

    @FindBy(how = How.ID, using = "txtSearch")
    public WebElement txtSearchAdministrator;

    @FindBy(how = How.ID, using = "btnSearch")
    public WebElement btnSearch;

    @FindBy(how = How.ID, using = "lstEmployees")
    public WebElement lstEmployees;

    @FindBy(how = How.ID, using = "btnSubmit")
    public WebElement btnSubmit;

    public void clickAddAdministrator() {
        addAdministratorLink.click();
    }

    public void getAdministratorSearchBox() {
        if (txtSearchAdministrator.isEnabled()) {
            System.out.println("Administrator Search Box load Successfully");
        }
    }

    public void enterAdministratorName(Character ranChar) {
        txtSearchAdministrator.clear();
        txtSearchAdministrator.sendKeys(ranChar.toString());
    }

    public void clickSearchButton() {
        btnSearch.click();
    }

    public int sizeAdministratorList() {
        Select administratorList = new Select(lstEmployees);
        return administratorList.getOptions().size();
    }

    public void selectAdministrator() {
        Select administratorList = new Select(lstEmployees);
        administratorList.selectByIndex(1);
        System.out.println("Selected Administrator : " + administratorList.getFirstSelectedOption().getText());
    }

    public void clickOnCreateButton() {
        btnSubmit.click();
    }
}