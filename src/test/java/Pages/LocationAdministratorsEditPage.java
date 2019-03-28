package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LocationAdministratorsEditPage {
    public LocationAdministratorsEditPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "btnSubmit")
    public WebElement submitButton;

    @FindBy(how = How.ID, using = "btnCancel")
    public WebElement cancelButton;

    public void clickSubmitButton(){
        submitButton.click();
    }
    public void clickCancelButton() { cancelButton.click(); }
}