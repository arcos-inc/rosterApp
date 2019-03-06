package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RDTRuleSetsTab {

    public List<WebElement> getNewPaidTimeOffRuleSetTable(WebDriver driver) throws Exception {
        try {
            WebElement table_element = driver.findElement(By.xpath("//*[@id=\"PostForm\"]/div[3]/table"));
            List<WebElement> tr_collection = table_element.findElements(By.xpath("//*[@id=\"PostForm\"]/div[3]/table/tbody/tr"));

            //System.out.println("NUMBER OF ROWS IN THIS TABLE = " + tr_collection.size());

            //return tr_collection.get(0).findElements(By.xpath("td/input")).get(0);
            return tr_collection;
        } catch (Exception ex) {
            System.out.println("You got the Exception: " + ex);
            return null;
        }
    }
}
