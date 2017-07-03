package astafievaCalculator.steps;

import astafievaCalculator.pages.GoogleCalculatorPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

/**
 * Created by Kateryna_Astafieva on 7/3/2017.
 */
public class CommonSteps {

    GoogleCalculatorPage googleCalculatorPage;

    @Step
    public void open_google_calculator_page(){googleCalculatorPage.open();}

    @Step
    public void check_that_result_is_valid(String expectedResult, String actualResult) {
        Assert.assertEquals(expectedResult, actualResult);
    }
}
