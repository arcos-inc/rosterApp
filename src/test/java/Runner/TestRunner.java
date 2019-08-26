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
//        glue = "Steps", monochrome = true, tags = {
//        "@I_LoginAsLocationAdmin, @K_EmployeeTab"})
        glue = "Steps", monochrome = true, tags = {
            "@A_LoginAsCompanyAdmin," +

//          " @A_LoginAsCompanyAdmin," +
//                " @B_LocationTab," +
//                " @C_JobTitleTab, " +
//                " @D_ShiftRuleSet," +
//                " @E_PTORuleSets, " +
//                " @F_UTORuleSet," +
//                " @G_VTOSlotRuleSet," +
//                " @H_Logout," +
//                " @I_LoginAsLocationAdmin, " +
//                " @J_WorkGroupTab, " +
//                " @K_EmployeeTab," +
//                " @L_AddScheduleViewer, @M_RemoveScheduleViewer, @N_AddScheduleViewerToMultipleLocations, @O_EditAssignment, @P_EditProfile," +
//                " @Q_AddSkill, @R_EditSkill, @S_FilterSkills, @T_FilterSkills," +
//                " @U_AddDepartment, @V_EditDepartment," +
//                " @W_EditAccrualAccounts," +
//                " @X_CreateRoundingRuleSet, @Y_EditRoundingRuleSet," +
//                " @Z_CreateDependabilityRuleSet, @ZA_EditDependabilityRuleSet," +
                    "@ZB_CreateQualifications, @ZC_EditQualifications"})

public class TestRunner extends AbstractTestNGCucumberTests {
}
