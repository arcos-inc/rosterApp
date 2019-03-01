package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class JobTitleEditPage {
    public JobTitleEditPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        // We use this approach when we fetching elements from Excel File

        //this.testVariable1 = driver.findElement(By.id(ReadExcel.GetCellValue(1, 2)));
        //this.testVariable2 = driver.findElement(By.id(ReadExcel.GetCellValue(3, 2)));
    }

    @FindBy(how = How.ID, using = "lblPageHeading")
    //@CacheLookup
    public WebElement jobTitleLable;

    @FindBy(how = How.ID, using = "...")
    public WebElement testVariable2;

    @FindBy(how = How.ID, using = "...")
    public WebElement testVariable3;

    public void getJobTitleLabel() {
        String jobTitle = jobTitleLable.getText().toLowerCase();
        if (jobTitle.contains("Job Titles for Hawaiian Airlines")){
            System.out.println("User is on Job Titles Tab");
        }

    }

    public void testFunction2() {
        System.out.println("This is a Test Variable: " + testVariable2);
    }

    public void testFunction3() {
        System.out.println("This is a Test Variable: " + testVariable3);
    }
}
