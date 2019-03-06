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
    /*@FindBy(how = How.ID, using = "TagName")
    public WebElement TagName; */
}
