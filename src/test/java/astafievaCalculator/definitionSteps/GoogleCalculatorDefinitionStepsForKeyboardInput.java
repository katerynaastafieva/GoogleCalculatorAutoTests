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
public class GoogleCalculatorDefinitionStepsForKeyboardInput extends CommonDefinitionSteps {

    @Steps
    GoogleCalculatorStepsForKeyboardInput googleCalculatorStepsForKeyboardInput;

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

}

