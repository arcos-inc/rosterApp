package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RDTRuleSetsTab {

    //region This Method is used to fetch the complete table of Create New Paid Time Off Rule Set
    /*
    public List<WebElement> getNewPaidTimeOffRuleSetTable(WebDriver driver) {
        try {
            WebElement table_element = driver.findElement(By.xpath("/html/body/form/div[3]/table"));
            List<WebElement> tr_collection = table_element.findElements(By.xpath("/html/body/form/div[3]/table/tbody/tr"));

            //System.out.println("NUMBER OF ROWS IN THIS TABLE = " + tr_collection.size());

            //return tr_collection.get(0).findElements(By.xpath("td/input")).get(0);
            return tr_collection;
        } catch (Exception ex) {
            System.out.println("You got the Exception: " + ex);
            return null;
        }
    }
     */
    //endregion

    //region This Method is used to fetch the complete table of Create New Shift Rule Set
    /*
    public List<WebElement> getNewShiftRuleSets(WebDriver driver) {
        try {
            WebElement table_element = driver.findElement(By.id("tblShiftRuleSet"));
            List<WebElement> tr_collection = table_element.findElements(By.xpath("/html/body/form/div[3]/table/tbody/tr"));
            return  tr_collection;
        } catch (Exception ex) {
            System.out.println("You got the Exception: " + ex);
            return null;
        }
    }
     */
    //endregion
}
