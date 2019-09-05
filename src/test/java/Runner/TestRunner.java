package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@CucumberOptions(features = {"src/test/java/Features"}, format = {"json:target/cucumber.json",
        "html:target/site/cucumber-pretty"},
        glue = "Steps", monochrome = true, tags = {
                " @A_LoginAsCompanyAdmin," +
                " @B_LocationTab, @L_AddScheduleViewer, @M_RemoveScheduleViewer, @N_AddScheduleViewerToMultipleLocations, @O_RemoveScheduleViewer, @P_EditAssignment, @Q_EditProfile, @R_EditAccrualAccounts" +
                " @C_JobTitleTab, " +
                " @D_ShiftRuleSet, @E_PTORuleSets, @F_UTORuleSet, @G_VTOSlotRuleSet, @X_CreateRoundingRuleSet, @Y_EditRoundingRuleSet, @Z_CreateDependabilityRuleSet, @ZA_EditDependabilityRuleSet," +
                " @Q_AddSkill, @R_EditSkill, @S_FilterSkills, @T_FilterSkills," +
                " @U_AddDepartment, @V_EditDepartment," +
                " @ZB_CreateQualifications, @ZC_EditQualifications, @ZD_EditQualificationsForLocation," +
                " @ZE_CreateCostCenters, @ZF_EditCostCenters," +
                " @H_Logout," +

                " @ZZA_LoginAsLocationAdmin, " +
                " @ZZB_CreateWorkGroup, @ZZC_EditWorkGroup, @ZZD_HideInactiveWorkGroups, " +
                " @ZZE_AddSkillsForEmployees, @ZZF_RemoveSkillsForEmployees, @ZZG_AddQualificationsForEmployees, @ZZH_AddTradeWorkGroupsForEmployees, @ZZI_RemoveTradeWorkGroupsForEmployees, @ZZJ_ResetOvertimeBank," +
                " @ZZK_AddSupervisor, @ZZL_RemoveSupervisor, @ZZM_AddSupervisorToMultipleLocations, @ZZN_RemoveSupervisor, @ZZO_EditAssignment, @ZZP_EditProfile," +
                " @ZZQ_EmployeeTab," +
                " @ZZR_FilterAllEmployees, @ZZS_FilterActiveEmployees, @ZZT_FilterInactiveEmployees, " +
                ""})


public class TestRunner extends AbstractTestNGCucumberTests {
}
//@RunWith(Cucumber.class)
