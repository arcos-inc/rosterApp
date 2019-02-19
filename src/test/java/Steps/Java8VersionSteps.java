package Steps;

import Utilities.ReadExcel;
import cucumber.api.java8.En;

public class Java8VersionSteps implements En {
    public Java8VersionSteps() {
        And("^I just need to see how step looks for Cucumber-Java(\\d+)$", (Integer arg0) -> {
            //ReadExcel re = new ReadExcel();
            try {
                //re.readExcelFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}