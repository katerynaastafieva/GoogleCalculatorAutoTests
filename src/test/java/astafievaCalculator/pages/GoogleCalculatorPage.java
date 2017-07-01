package astafievaCalculator.pages;

import astafievaCalculator.DriverExtension;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by Kateryna_Astafieva on 6/29/2017.
 */

    @DefaultUrl("https://www.google.com.ua/search?q=%D0%BA%D0%B0%D0%BB%D1%8C%D0%BA%D1%83%D0%BB%D1%8F%D1%82%D0%BE%D1%80&oq=%D0%BA%D0%B0%D0%BB%D1%8C&aqs=chrome.1.69i59l2j0l4.1671j0j7&sourceid=chrome&ie=UTF-8")
    public class GoogleCalculatorPage extends PageObject {

    @FindBy(id = "cwbt45")
    private WebElement equalButton;

    @FindBy(id = "cwmcwd")
    private WebElement Calculator;

    @FindBy(css = "#cwos")
    private WebElement resultValueField;

    @FindBy(css = "div.cwbbc4")
    private List<WebElement> actionButtons;

    private List<String> locatorsForNumbers = Arrays.
            asList("cwbt43", "cwbt33", "cwbt34", "cwbt35", "cwbt23", "cwbt24", "cwbt25", "cwbt13", "cwbt14", "cwbt15");

    public WebElement getEqualButton() {
        return equalButton;
    }

    public WebElement getResultValueField() {
        return resultValueField;
    }

    public List<WebElement> getActionButton() {
        return actionButtons;
    }

    public List<WebElement> getNumberButtons() {
        List<WebElement> listOfNumberButtons = new ArrayList<>();
        for (String locator : locatorsForNumbers) {
            WebElement numberButton = getDriver().findElement(By.id(locator));
            listOfNumberButtons.add(numberButton);
        }
        return listOfNumberButtons;
    }

    public void clickOnButtonByNumber(String number) {
        for (char ch : number.toCharArray()) {
            if (ch == '-') {
                clickOnActionButton("−");
            } else {
                getNumberButtons().get(Character.getNumericValue(ch)).click();
            }
        }
    }

    public void clickOnActionButton(String action) {
        for (WebElement element : getActionButton()) {
            if (action.equals(element.getText())) {
                element.click();
            }
        }
    }

    public void evaluateExpression() {
        getEqualButton().click();
    }

    public String expressionBuilder(String num1, String num2, String action) {
        StringBuilder result = new StringBuilder()
                .append(num1)
                .append(action)
                .append(num2)
                .append("=");
        return result.toString();
    }

}
