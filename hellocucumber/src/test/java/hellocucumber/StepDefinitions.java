package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    private String today;
    private String actualAnswer;

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    @Given("today is Sunday")
    public void today_is_sunday() {
        today = "Sunday";
    }

    @When("I ask if it's Friday")
    public void i_ask_whether_it_s_friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("the answer should be \"No\"")
    public void i_should_be_told_no() {
        assertEquals("No", actualAnswer);
    }

    @Given("today is Friday")
    public void today_is_friday() {
        today = "Friday";
    }

    @Then("I should be told \"TGIF\"")
    public void i_should_be_told_tgif() {
        assertEquals("TGIF", actualAnswer);
    }

}
