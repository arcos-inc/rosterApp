package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class RDTLocationsTab {
    //region This Method is used to click on Edit Link From Dynamic Data Grid
    public WebElement getLocationTabEditLink(WebDriver driver) throws Exception {
        try {
            WebElement table_element = driver.findElement(By.id("grdLocations"));
            List<WebElement> tr_collection = table_element.findElements(By.xpath("id('grdLocations')/tbody/tr"));

            System.out.println("NUMBER OF ROWS IN THIS TABLE = " + tr_collection.size());

            return tr_collection.get(1).findElements(By.xpath("td")).get(3);
        } catch (Exception ex) {
            System.out.println("You got the Exception: " + ex);
            return null;
        }
    }
    //endregion
    
    //This method is used to get table of Edit Location Administrator - Profile info and Permissions
    public List<WebElement> getTableEditProfInfo(WebDriver driver) throws Exception {
        try {
            WebElement tableElement = driver.findElement(By.xpath("//*[@id=\"PostForm\"]/div[3]/div/table/tbody/tr"));
            List<WebElement> tr_collection = tableElement.findElements(By.xpath("//*[@id=\"PostForm\"]/div[3]/div/table/tbody/tr"));

            System.out.println("Num of rows in this table is " + tr_collection.size());
            return tr_collection;
        } catch (Exception ex) {
            System.out.println("you got " + ex);
            return null;
        }
    }

    //This method is used to click on "Edit profile" from Dynamic Data Grid
    public WebElement getLAEditProfile(WebDriver driver) throws Exception {
        try {
            WebElement tableElement = driver.findElement(By.id("gridBody"));
            List<WebElement> tr_collection = tableElement.findElements(By.xpath("id('gridBody')/tbody/tr"));

            System.out.println("Num of rows in this table is " + tr_collection.size());
            return tr_collection.get(1).findElements(By.xpath("td")).get(2);
        } catch (Exception ex) {
            System.out.println("you got" + ex);
            return null;
        }
    }

    //This Method is used to click on Administrators Link From Dynamic Data Grid
    public WebElement getLocationTabAdministratorsLink(WebDriver driver) throws Exception {
        try {
            WebElement table_element = driver.findElement(By.id("grdLocations"));
            List<WebElement> tr_collection = table_element.findElements(By.xpath("id('grdLocations')/tbody/tr"));

            System.out.println("NUMBER OF ROWS IN THIS TABLE = " + tr_collection.size());

            return tr_collection.get(1).findElements(By.xpath("td")).get(4);
        } catch (Exception ex) {
            System.out.println("You got: " + ex);
            return null;
        }
    }
    //endregion

    //region This method is used to get all check boxes of active Locations under Add Administrator to Multiple Locations section
    public WebElement getAllLocationCheckbox(WebDriver driver) throws Exception {
        try {
            WebElement span_element = driver.findElement(By.id("ucLocationPicker_lstLocations"));
            List<WebElement> span_collection = span_element.findElements(By.xpath("id('ucLocationPicker_lstLocations')/span"));

            System.out.println("NUMBER OF CHECK BOXES ARE = " + span_collection.size());

            return span_collection.get(1);
        } catch (Exception ex) {
            System.out.println("You got: " + ex);
            return null;
        }
    }
    //endregion

    //region This method is used to generate random characters between a to z for searching locations
    public char generateRandomCharacter(WebDriver driver) throws Exception {
        try {
            Random ran = new Random();
            char c = (char) (ran.nextInt(26) + 'a');
            return c;
        } catch (Exception ex) {
            System.out.println("You got: " + ex);
            return 'a';
        }
    }
    //endregion
}