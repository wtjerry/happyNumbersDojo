package cucumber;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dojo.happynumbers.DigitSplitter;
import dojo.happynumbers.Happy;
import dojo.happynumbers.LoopDetector;
import dojo.happynumbers.SquareAndSum;

import static org.assertj.core.api.Assertions.assertThat;


public class StepDefinitions {
    private boolean isHappy;

    @When("^I check if the number (\\d+) is happy$")
    public void iCheckIfTheNumberIsHappy(int number){
        var happy = new Happy(new DigitSplitter(), new SquareAndSum(), new LoopDetector());
        isHappy = happy.validate(number);
    }

    @Then("^the answer is yes$")
    public void theAnswerIsYes(){
        assertThat(isHappy).isTrue();
    }

    @Then("^the answer is no$")
    public void theAnswerIsNo(){
        assertThat(isHappy).isFalse();
    }

    @When("^I check if the number -(\\d+) is happy$")
    public void iCheckIfTheNegativeNumberIsHappy(int number) {
        var negative_number = -number;
        var happy = new Happy(new DigitSplitter(), new SquareAndSum(), new LoopDetector());
        isHappy = happy.validate(negative_number);
    }
}
