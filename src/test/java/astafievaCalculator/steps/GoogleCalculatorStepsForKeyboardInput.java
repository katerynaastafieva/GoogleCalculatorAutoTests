package astafievaCalculator.steps;

import astafievaCalculator.DriverExtension;
import astafievaCalculator.pages.GoogleCalculatorPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

/**
 * Created by Kateryna_Astafieva on 7/1/2017.
 */
public class GoogleCalculatorStepsForKeyboardInput {

    GoogleCalculatorPage googleCalculatorPage;

    public void stepsForKeyboardInputTests() {
        String actualNumberResultKeyboardInput = googleCalculatorPage
                .getResultValueField()
                .getText();
        Serenity.setSessionVariable("actualNumberResultKeyboardInput").to(actualNumberResultKeyboardInput);
    }

    @Step
    public void open_google_calculator_page_for_keyboard_input_tests() {
        googleCalculatorPage.open();
    }

    @Step
    public void add_two_numbers_using_the_keyboard(String num1, String num2) {
        String expression = googleCalculatorPage.expressionBuilder(num1, num2, "+");
        DriverExtension.SetValueForElement(googleCalculatorPage.getResultValueField(), expression);
        stepsForKeyboardInputTests();
    }

    @Step
    public void subtract_two_numbers_using_the_keyboard(String num1, String num2) {
        String expression = googleCalculatorPage.expressionBuilder(num1, num2, "-");
        DriverExtension.SetValueForElement(googleCalculatorPage.getResultValueField(), expression);
        stepsForKeyboardInputTests();
    }

    @Step
    public void multiply_two_numbers_using_the_keyboard(String num1, String num2) {
        String expression = googleCalculatorPage.expressionBuilder(num1, num2, "*");
        DriverExtension.SetValueForElement(googleCalculatorPage.getResultValueField(), expression);
        stepsForKeyboardInputTests();
    }

    @Step
    public void divide_two_numbers_using_the_keyboard(String num1, String num2) {
        String expression = googleCalculatorPage.expressionBuilder(num1, num2, "/");
        DriverExtension.SetValueForElement(googleCalculatorPage.getResultValueField(), expression);
        stepsForKeyboardInputTests();
    }

    @Step
    public void check_that_result_is_valid_for_keyboard_tests(String expectedResult, String actualResult) {
        Assert.assertEquals(expectedResult, actualResult);
    }
}
