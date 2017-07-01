package astafievaCalculator.definitionSteps;


import astafievaCalculator.steps.GoogleCalculatorStepsForKeyboardInput;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by Kateryna_Astafieva on 7/1/2017.
 */
public class GoogleCalculatorDefinitionStepsForKeyboardInput {

    @Steps
    GoogleCalculatorStepsForKeyboardInput googleCalculatorStepsForKeyboardInput;

    @Given("open google page with calculator on it for keyboard test")
    public void givenOpenGoogleCalculatorPageForKeyboardInputTests() {
        googleCalculatorStepsForKeyboardInput.open_google_calculator_page_for_keyboard_input_tests();
    }

    @When("add $num1 and $num2 using keyboard")
    public void whenAddTwoNumbersUsingTheKeyboard(String num1, String num2) {
        googleCalculatorStepsForKeyboardInput.add_two_numbers_using_the_keyboard(num1, num2);
    }

    @When("subtract $num2 from $num1 using keyboard")
    public void whenSubtractTwoNumbersUsingTheKeyboard(String num1, String num2) {
        googleCalculatorStepsForKeyboardInput.subtract_two_numbers_using_the_keyboard(num1, num2);
    }

    @When("multiply $num1 and $num2 using keyboard")
    public void whenMultiplyTwoNumbersUsingTheKeyboard(String num1, String num2) {
        googleCalculatorStepsForKeyboardInput.multiply_two_numbers_using_the_keyboard(num1, num2);
    }

    @When("divide $num1 by $num2 using keyboard")
    public void whenDivideTwoNumbersUsingTheKeyboard(String num1, String num2) {
        googleCalculatorStepsForKeyboardInput.divide_two_numbers_using_the_keyboard(num1, num2);
    }

    @When("divide $num by $zero using keyboard")
    public void whenDivideByZeroUsingTheKeyboard(String num1, String num2) {
        googleCalculatorStepsForKeyboardInput.divide_two_numbers_using_the_keyboard(num1, num2);
    }

    @Then("shown a valid $result for keyboard test")
    public void thenResultIsEqualToExpectedUsingTheKeyboard(String expectedResult) {
        googleCalculatorStepsForKeyboardInput.check_that_result_is_valid_for_keyboard_tests(expectedResult,Serenity.sessionVariableCalled("actualNumberResultKeyboardInput"));
    }
}

