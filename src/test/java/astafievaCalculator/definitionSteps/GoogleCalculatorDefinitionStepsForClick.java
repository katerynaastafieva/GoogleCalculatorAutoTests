package astafievaCalculator.definitionSteps;

import astafievaCalculator.steps.GoogleCalculatorStepsForClick;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


/**
 * Created by Kateryna_Astafieva on 6/29/2017.
 */

public class GoogleCalculatorDefinitionStepsForClick {

    @Steps
    GoogleCalculatorStepsForClick googleCalculatorStepsForClick;

    @Given("open google page with calculator on it for click test")
    public void givenOpenGoogleForClickTests(){googleCalculatorStepsForClick.open_google_calculator_page_for_click_tests();}

    @When("add $num1 and $num2 using mouse")
    public void whenAddTwoNumbersUsingTheMouse(String num1, String num2){googleCalculatorStepsForClick.add_two_numbers_using_the_mouse(num1,num2);}

    @When("subtract $num2 from $num1 using mouse")
    public void whenSubtractTwoNumbersUsingTheMouse(String num1, String num2){googleCalculatorStepsForClick.subtract_two_numbers_using_the_mouse(num1,num2);}

    @When("multiply $num1 and $num2 using mouse")
    public void whenMultiplyTwoNumbersUsingTheMouse(String num1, String num2){googleCalculatorStepsForClick.multiply_two_numbers_using_the_mouse(num1,num2);}

    @When("divide $num1 by $num2 using mouse")
    public void whenDivideTwoNumbersUsingTheMouse(String num1, String num2){googleCalculatorStepsForClick.divide_two_numbers_using_the_mouse(num1,num2);}

    @When("divide $num by $zero using mouse")
    public void whenDivideByZeroUsingTheMouse(String num1, String num2){googleCalculatorStepsForClick.divide_two_numbers_using_the_mouse(num1,num2);}

    @Then("shown a valid $result for click test")
    public void thenResultIsEqualToExpectedUsingTheMouse(String expectedResult){
        googleCalculatorStepsForClick.check_that_result_is_valid(Serenity.sessionVariableCalled("actualNumberResultClick"),expectedResult);}
}
