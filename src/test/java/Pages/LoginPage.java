package Pages;

import Utilities.ReadExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.dropDownAdminRole = driver.findElement(By.id(ReadExcel.GetCellValue(1, 2)));
        this.btnLogin = driver.findElement(By.id(ReadExcel.GetCellValue(3, 2)));
    }

    @FindBy(how = How.XPATH, using = "...")
    @CacheLookup
    public WebElement txtUsername;

    @FindBy(how = How.XPATH, using = "...")
    //@CacheLookup
    public WebElement txtPassword;

    //@FindBy(how = How.ID, using = "cboRole")
    public WebElement dropDownAdminRole;

    //@FindBy(how = How.ID, using = "btnLogin")
    public WebElement btnLogin;

    public void Login(String userName, String Password) {
        txtUsername.sendKeys(userName);
        txtPassword.sendKeys(Password);
    }

    public void ClickLogin() {
        btnLogin.click();
    }

    public void ClickAdminRole() {
        dropDownAdminRole.click();
    }

    public void SelectAdminRole() {
        Select adminRole = new Select(dropDownAdminRole);
        adminRole.selectByIndex(1);
    }
/*
        if(!(locationLabel.equals("locations for my airline"))){
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(1);
        }
*/
}