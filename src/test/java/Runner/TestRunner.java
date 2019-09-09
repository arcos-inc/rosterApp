package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/java/Features"}, format = {"json:target/cucumber.json",
        "html:target/site/cucumber-pretty"},
        glue = "Steps", monochrome = true, tags = {
                " @A_LoginAsCompanyAdmin," +
//                " @B_LocationTab, @C_AddScheduleViewer, @D_RemoveScheduleViewer, @E_AddScheduleViewerToMultipleLocations, @F_RemoveScheduleViewer, @G_EditAssignment, @H_EditProfile, @I_EditAccrualAccounts, " +
//                " @J_JobTitleTab, " +
//                " @K_ShiftRuleSet, @L_PTORuleSets, @M_UTORuleSet, @N_VTOSlotRuleSet, @O_CreateRoundingRuleSet, @P_EditRoundingRuleSet, @Q_CreateDependabilityRuleSet, @R_EditDependabilityRuleSet," +
//                " @S_AddSkill, @T_EditSkill, @U_FilterSkills, @V_FilterSkills," +
//                " @W_AddDepartment, @X_EditDepartment," +
//                " @Y_CreateQualifications, @Z_EditQualifications, @ZA_EditQualificationsForLocation," +
//                " @ZB_CreateCostCenters, @ZC_EditCostCenters," +
                        "" +
                " @H_Logout," +

//                " @ZZA_LoginAsLocationAdmin, " +
//                " @ZZB_CreateWorkGroup, @ZZC_EditWorkGroup, @ZZD_HideInactiveWorkGroups, " +
//                " @ZZE_AddSkillsForEmployees, @ZZF_RemoveSkillsForEmployees, @ZZG_AddQualificationsForEmployees, @ZZH_AddTradeWorkGroupsForEmployees, @ZZI_RemoveTradeWorkGroupsForEmployees, @ZZJ_ResetOvertimeBank," +
//                " @ZZK_AddSupervisor, @ZZL_RemoveSupervisor, @ZZM_AddSupervisorToMultipleLocations, @ZZN_RemoveSupervisor, @ZZO_EditAssignment, @ZZP_EditProfile," +
//                " @ZZQ_EmployeeTab," +
//                " @ZZR_FilterAllEmployees, @ZZS_FilterActiveEmployees, @ZZT_FilterInactiveEmployees, @ZZU_CreateNotes, @ZZV_AddNotes, @ZZW_EditOvertimeBank, @ZZX_EditSkills, @ZZY_EditQualifications, @ZZZ_EditNewQualifications, @ZZZA_EditTradeWorkGroups, @ZZZB_EditPayRate, @ZZZC_EditJobTitle, @ZZZD_EditEmployeeStatus, @ZZZE_EditEmployeeCostCenter, @ZZZF_EditCross-TrainedDepartments, @ZZZG_ViewDependabilityHistory, @ZZZH_EditEmployeeScheduleAvailability, @ZZZI_EditRuleSets, @ZZZJ_TerminateEmployee," +
                ""})


public class TestRunner extends AbstractTestNGCucumberTests {
}
//@RunWith(Cucumber.class)
