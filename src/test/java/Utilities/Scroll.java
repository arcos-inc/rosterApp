package Utilities;

import org.openqa.selenium.JavascriptExecutor;

import static Base.BaseUtil.Web_Driver;

public class Scroll {

    public static void scrollDown(){

        JavascriptExecutor js = ((JavascriptExecutor) Web_Driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
