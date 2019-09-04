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
//                " @A_LoginAsCompanyAdmin," +
//                " @B_LocationTab," +
//                " @C_JobTitleTab, " +
//                " @D_ShiftRuleSet," +
//                " @E_PTORuleSets, " +
//                " @F_UTORuleSet," +
//                " @G_VTOSlotRuleSet," +
//                " @X_CreateRoundingRuleSet, @Y_EditRoundingRuleSet," +
//                " @Z_CreateDependabilityRuleSet, @ZA_EditDependabilityRuleSet," +
//                " @W_EditAccrualAccounts," +
//                " @L_AddScheduleViewer, @M_RemoveScheduleViewer, @N_AddScheduleViewerToMultipleLocations, @O_EditAssignment, @P_EditProfile," +
//                " @Q_AddSkill, @R_EditSkill, @S_FilterSkills, @T_FilterSkills," +
//                " @U_AddDepartment, @V_EditDepartment," +
//                " @ZB_CreateQualifications, @ZC_EditQualifications, @ZD_EditQualificationsForLocation," +
//                " @ZE_CreateCostCenters, @ZF_EditCostCenters," +
//                " @H_Logout," +

        " @I_LoginAsLocationAdmin, " +
                " @ZJ_CreateWorkGroup, @ZK_EditWorkGroup, @ZL_HideInactiveWorkGroups, " +
                " @ZP_AddSkillsForEmployees, @ZQ_RemoveSkillsForEmployees, @ZR_AddQualificationsForEmployees, @ZS_AddTradeWorkGroupsForEmployees, @ZT_RemoveTradeWorkGroupsForEmployees, @ZU_ResetOvertimeBank," +
                " @K_EmployeeTab," +
                " @ZG_FilterAllEmployees, @ZH_FilterActiveEmployees, @ZI_FilterInactiveEmployees, " +
                " @ZK_AddSupervisor, @ZL_RemoveSupervisor, @ZM_AddSupervisorToMultipleLocations, @ZN_EditAssignment, @ZO_EditProfile," +
                ""})


public class TestRunner extends AbstractTestNGCucumberTests {
}
//@RunWith(Cucumber.class)
