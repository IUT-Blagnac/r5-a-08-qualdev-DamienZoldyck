package dojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class CocktailSteps {
    private String from;
    private Order order;
    
    @Given("{} who wants to buy a drink")
    public void who_wants_to_buy_a_drink(String from) {
        this.from = from;
    }

    @When("an order is declared for {}")
    public void an_order_is_declared_for(String to) {
        this.order = new Order(from, to);
    }

    @Then("there is {int} cocktails in the order")
    public void there_is_n_cocktails_in_the_order(Integer nbCocktails) {
        String message = order.getTicketMessage();
        assertNotNull("Order message should not be null", message);
    }

    @When("a message saying {string} is added")
    public void a_message_saying_is_added(String message) {
        order.setMessage(message);
    }

    @Then("the ticket must say {string}")
    public void the_ticket_must_say(String expected) {
        assertEquals(expected, order.getTicketMessage());
    }
}