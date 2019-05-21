package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Features"}, format = {"json:target/cucumber.json",
        "html:target/site/cucumber-pretty"},
        glue = "Steps", monochrome = true, tags = {
        " @A_LoginAsCompanyAdmin," +
                " @B_LocationTab," +
                " @C_JobTitleTab, " +
                " @D_ShiftRuleSet," +
                " @E_PTORuleSets, " +
                " @F_UTORuleSet," +
                " @G_VTOSlotRuleSet," +
                " @H_Logout," +
                " @I_LoginAsLocationAdmin, " +
                " @J_WorkGroupTab, " +
                " @K_EmployeeTab"})

public class TestRunner extends AbstractTestNGCucumberTests {
}
