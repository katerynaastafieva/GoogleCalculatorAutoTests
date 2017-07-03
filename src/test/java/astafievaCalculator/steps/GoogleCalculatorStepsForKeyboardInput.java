package astafievaCalculator.steps;

import astafievaCalculator.DriverExtension;
import astafievaCalculator.pages.GoogleCalculatorPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

/**
 * Created by Kateryna_Astafieva on 7/1/2017.
 */
public class GoogleCalculatorStepsForKeyboardInput extends CommonSteps{

    GoogleCalculatorPage googleCalculatorPage;

    public void stepsForKeyboardInputTests() {
        String actualNumberResult = googleCalculatorPage
                .getResultValueField()
                .getText();
        Serenity.setSessionVariable("actualNumberResult").to(actualNumberResult);
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

}
