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
//                " @B_LocationTab," +
//                " @C_JobTitleTab, " +
//                " @D_ShiftRuleSet," +
//                " @E_PTORuleSets, " +
//                " @F_UTORuleSet," +
//                " @G_VTOSlotRuleSet," +
//                " @L_AddScheduleViewer, @M_RemoveScheduleViewer, @N_AddScheduleViewerToMultipleLocations, @O_EditAssignment, @P_EditProfile," +
//                " @Q_AddSkill, @R_EditSkill, @S_FilterSkills, @T_FilterSkills," +
                " @H_Logout," +

//                " @I_LoginAsLocationAdmin, " +
//                " @ZJ_CreateWorkGroup, @ZK_EditWorkGroup, @ZL_HideInactiveWorkGroups, " +
//                " @ZP_AddSkillsForEmployees, @ZQ_RemoveSkillsForEmployees, @ZR_AddQualificationsForEmployees, @ZS_AddTradeWorkGroupsForEmployees, @ZT_RemoveTradeWorkGroupsForEmployees, @ZU_ResetOvertimeBank," +
//                " @K_EmployeeTab," +


//                " @U_AddDepartment, @V_EditDepartment," +
//                " @W_EditAccrualAccounts," +
//                " @X_CreateRoundingRuleSet, @Y_EditRoundingRuleSet," +
//                " @Z_CreateDependabilityRuleSet, @ZA_EditDependabilityRuleSet," +
//                " @ZB_CreateQualifications, @ZC_EditQualifications, @ZD_EditQualificationsForLocation," +
//                " @ZE_CreateCostCenters, @ZF_EditCostCenters," +
//                " @ZG_FilterAllEmployees, @ZH_FilterActiveEmployees, @ZI_FilterInactiveEmployees, @ZL_HideInactiveWorkGroups" +
//                " @ZK_AddSupervisor, @ZL_RemoveSupervisor, @ZM_AddSupervisorToMultipleLocations, @ZN_EditAssignment, @ZO_EditProfile," +

                  ""})


public class TestRunner extends AbstractTestNGCucumberTests {
}
