package astafievaCalculator.steps;

import astafievaCalculator.pages.GoogleCalculatorPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

/**
 * Created by Kateryna_Astafieva on 6/29/2017.
 */
public class GoogleCalculatorStepsForClick {

    GoogleCalculatorPage googleCalculatorPage;

    public void stepsFofClickTests(String num2){
        googleCalculatorPage.clickOnButtonByNumber(num2);
        googleCalculatorPage.evaluateExpression();
        String actualResultClick = googleCalculatorPage
                .getResultValueField()
                .getText();
        Serenity.setSessionVariable("actualNumberResultClick").to(actualResultClick);
    }

    @Step
    public void open_google_calculator_page_for_click_tests(){googleCalculatorPage.open();}

    @Step
    public void add_two_numbers_using_the_mouse(String num1, String num2){
        googleCalculatorPage.clickOnButtonByNumber(num1);
        googleCalculatorPage.clickOnActionButton("+");
        stepsFofClickTests(num2);
    }

    @Step
    public void subtract_two_numbers_using_the_mouse(String num1, String num2){
        googleCalculatorPage.clickOnButtonByNumber(num1);
        googleCalculatorPage.clickOnActionButton("−");
        stepsFofClickTests(num2);
    }
    @Step
    public void multiply_two_numbers_using_the_mouse(String num1, String num2){
        googleCalculatorPage.clickOnButtonByNumber(num1);
        googleCalculatorPage.clickOnActionButton("×");
        stepsFofClickTests(num2);
    }

    @Step
    public void divide_two_numbers_using_the_mouse(String num1, String num2){
        googleCalculatorPage.clickOnButtonByNumber(num1);
        googleCalculatorPage.clickOnActionButton("÷");
        stepsFofClickTests(num2);
    }

    @Step
    public void check_that_result_is_valid(String expectedResult, String actualResult){
        Assert.assertEquals(expectedResult, actualResult);
    }


}
