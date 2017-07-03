package astafievaCalculator.definitionSteps;

import astafievaCalculator.steps.CommonSteps;
import astafievaCalculator.steps.GoogleCalculatorStepsForClick;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by Kateryna_Astafieva on 7/3/2017.
 */
public class CommonDefinitionSteps {

    @Steps
    CommonSteps googleCalculatorCommonSteps;

    @Given("open google page with calculator on it")
    public void givenOpenGoogleForClickTests(){googleCalculatorCommonSteps.open_google_calculator_page();}

    @Then("shown a valid $result")
    public void thenResultIsEqualToExpectedUsingTheMouse(String expectedResult){
        googleCalculatorCommonSteps.check_that_result_is_valid(Serenity.sessionVariableCalled("actualNumberResult"),expectedResult);}
}
