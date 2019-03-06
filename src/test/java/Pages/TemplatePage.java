package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TemplatePage {
    public TemplatePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        // We use this approach when we fetching elements from Excel File

        //this.testVariable1 = driver.findElement(By.id(ReadExcel.GetCellValue(1, 2)));
        //this.testVariable2 = driver.findElement(By.id(ReadExcel.GetCellValue(3, 2)));
    }

    @FindBy(how = How.ID, using = "...")
    //@CacheLookup
    public WebElement testVariable1;

    @FindBy(how = How.ID, using = "...")
    public WebElement testVariable2;

    @FindBy(how = How.ID, using = "...")
    public WebElement testVariable3;

    public void testFunction1() {
        System.out.println("This is a Test Variable: " + testVariable1);
    }

    public void testFunction2() {
        System.out.println("This is a Test Variable: " + testVariable2);
    }

    public void testFunction3() {
        System.out.println("This is a Test Variable: " + testVariable3);
    }
}
