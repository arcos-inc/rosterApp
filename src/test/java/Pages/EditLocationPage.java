package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditLocationPage {
    public EditLocationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"grdLocations\"]/tbody/tr[14]/td[4]/a")
    public WebElement editLocation;

    @FindBy(how = How.ID, using = "lblPageHeading")
    public WebElement lblPageHeading;

    @FindBy(how = How.ID, using = "chkDisplayBid")
    public  WebElement chkDisplayBid;

    @FindBy(how = How.ID, using = "btnAddEdit")
    public WebElement btnAddEdit;

    public void clickEditLocation() {
        editLocation.click();
    }

    public void getEditLocationLabel() {
        String locationLabel = lblPageHeading.getText().toLowerCase();
        if (locationLabel.contains("Edit Location")) {
            System.out.println("Get the Edit Location Tab");
        }
    }

    public void changeSelection(){
        chkDisplayBid.click();
    }

    public void clickOnUpdateButton(){
        btnAddEdit.click();
    }
}
