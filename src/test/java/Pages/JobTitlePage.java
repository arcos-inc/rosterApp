package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class JobTitlePage {
    public JobTitlePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.LINK_TEXT, using = "JOB TITLES")
    public WebElement jobTitleTab;

    @FindBy(how = How.ID, using = "lblPageHeading")
    public WebElement jobTitleLable;

    @FindBy(how = How.ID, using = "lnkNew")
    public WebElement createNewJobTitle;

    @FindBy(how = How.ID, using = "txtShortDesc")
    public WebElement shortDescription;

    @FindBy(how = How.ID, using = "txtDescription")
    public WebElement longDescription;

    @FindBy(how = How.ID, using = "cboDepartment")
    public WebElement dropDownDepartment;

    @FindBy(how = How.ID, using = "btnAddEdit")
    public WebElement addButton;

    public void clickOnJobTitleTab() {
        jobTitleTab.click();
    }

    public void clickOnCreateNewJobTitle() {
        createNewJobTitle.click();
    }

    public void getNewJobTitleTitleLable() {
        String newJobLabel = jobTitleLable.getText().toLowerCase();
        if (newJobLabel.contains("New Job Title")) {
            System.out.println("Get the Get the New Job Title Window");
        }
    }

    public void enterShortDescription(String sDescription) {
        shortDescription.sendKeys(sDescription);
    }

    public void enterLongDescription(String lDescription) {
        longDescription.sendKeys(lDescription);
    }

    public void selectDepartment() {
        Select department = new Select(dropDownDepartment);
        department.selectByIndex(1);
    }

    public void clickOnAddButton() {
        addButton.click();
    }
}
