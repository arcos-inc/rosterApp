package Pages;

import Base.BaseUtil;
import Utilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class QualificationsPage extends BaseUtil {

    Helper help;

    public QualificationsPage (WebDriver driver){
        help = new Helper();
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"PostForm\"]/table[1]/tbody/tr[3]/td/ul/li[4]")
    public WebElement clickQualificationsLinkText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"divQualifications\"]/div[1]/a")
    public WebElement clickCreateNewQualificationLink;

    @FindBy(how = How.ID, using = "txtQualificationCode")
    public WebElement enterQualificationCode;

    @FindBy(how = How.ID, using = "txtQualificationDescription")
    public WebElement enterQualificationDesc;

    @FindBy(how = How.ID, using = "txtQualificationOutsideCode")
    public WebElement enterQualificationOutsideCode;

    @FindBy(how = How.ID, using = "chkIsActive")
    public WebElement chkIsActive;

    @FindBy(how = How.ID, using = "btnUpdate")
    public WebElement btnUpdate;

    public void clickQualificationsLink() {
        clickQualificationsLinkText.click();
    }

    public void clickCreateNewQualification() {
        clickCreateNewQualificationLink.click();
    }

    public void enterCode(String enterCode) {
        enterQualificationCode.clear();
        enterQualificationCode.sendKeys(enterCode);
    }

    public void enterDescription(String enterDescription) {
        enterQualificationDesc.clear();
        enterQualificationDesc.sendKeys(enterDescription);
    }

    public void enterOutsideCode(String enterOutsideCode) {
        enterQualificationOutsideCode.clear();
        enterQualificationOutsideCode.sendKeys(enterOutsideCode);
    }

    public void checkIsActiveCheckbox() {
        chkIsActive.click();
    }

    public void clickSaveButton() {
        btnUpdate.click();
    }
}
