package Steps;

import Base.BaseUtil;
import Utilities.ReadExcel;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before

    public void InitializeTest() {
        System.out.println("Opening the browser : Chrome Browser");
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        base.Web_Driver = new ChromeDriver();
        ReadExcel.readExcelFile();
    }

    @After
    public void TearDownTest(Scenario scenario) {

        if (scenario.isFailed()) {
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : Chrome Browser");
    }
}