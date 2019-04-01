package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RuleSetsPagePTO {

    public RuleSetsPagePTO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.LINK_TEXT, using = "RULE SETS")
    //@CacheLookup
    public WebElement ruleSetTab;

    @FindBy(how = How.ID, using = "lnkNewPtoRuleSet")
    public WebElement lnkNewPtoRuleSet;

    @FindBy(how = How.ID, using = "lblPageHeading")
    public WebElement lblPageHeading;

    public void clickOnRuleSetsTab() {
        System.out.println("Clicking on Rule Sets Tab ");
        ruleSetTab.click();
    }

    public void clickingOnNewPTORuleSet() {
        System.out.println("Clicking on Create New Paid Time Off Rule Set");
        lnkNewPtoRuleSet.click();
    }

    public void getNewPaidTimeOffRuleSetWindow() {
        if(lblPageHeading.getText().contains("New Paid Time Off Rule Set")){
            System.out.println("User is in on Create New Rule Sets Window");
        }
    }
}
