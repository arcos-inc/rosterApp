package Pages;

import Base.BaseUtil;
import Utilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccrualAccountPage extends BaseUtil {

    Helper help;

    public AccrualAccountPage (WebDriver driver){
        help = new Helper();
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"grdLocations\"]/tbody/tr[2]/td[8]/a")
    public WebElement clickAccrual;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ucAccrualAccountsPicker_divAccrualAccountSelectAllNone\"]/a[1]")
    public WebElement clickAllLinkText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ucAccrualAccountsPicker_divAccrualAccountSelectAllNone\"]/a[2]")
    public WebElement clickNoneLinkText;

    @FindBy(how = How.ID, using = "ucAccrualAccountsPicker_lstAccrualAccounts_0")
    public WebElement clickAccrualAccountCheckbox1;

    @FindBy(how = How.ID, using = "ucAccrualAccountsPicker_lstAccrualAccounts_1")
    public WebElement clickAccrualAccountCheckbox2;

    @FindBy(how = How.ID, using = "btnUpdate")
    public WebElement clickOnUpdateButton;

    @FindBy(how = How.ID, using = "btnCancel")
    public WebElement clickOnCancelButton;

    public void clickAccrualAccount() {
        clickAccrual.click();
    }

    public void clickOnAllLinkText() {
        clickAllLinkText.click();
    }

    public void clickOnNoneLinkText() {
        clickNoneLinkText.click();
    }

    public void clickOnAccrualAccountsCheckbox() {
        clickAccrualAccountCheckbox1.click();
        clickAccrualAccountCheckbox2.click();
    }

    public void clickOnUpdateButton() {
        clickOnUpdateButton.click();
    }

    public void clickOnCancelButton() {
        clickOnCancelButton.click();
    }
}
