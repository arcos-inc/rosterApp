package Steps;

import Base.BaseUtil;
import Pages.LogoutPage;
import cucumber.api.java.en.And;

public class LogoutSD extends BaseUtil {

    private BaseUtil base;
    LogoutPage page;

    public LogoutSD(BaseUtil base) {
        page = new LogoutPage(Web_Driver);
        this.base = base;
    }

    @And("^User should click on Logout link$")
    public void userShouldClickOnLogoutLink() {
        System.out.println("Clicking on Logout Hyper Link");
        page.clickOnLogoutLink();
    }
}
