package astafievaCalculator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

/**
 * Created by Kateryna_Astafieva on 7/1/2017.
 */
public final class DriverExtension {

    public static void SetValueForElement(WebElement element, String value) {
        new Actions(getDriver()).sendKeys(element,value).perform();
    }
}
