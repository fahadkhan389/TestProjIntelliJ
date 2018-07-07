package stepDefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefs {
    @When("^i am on this page$")
    public void i_am_on_this_page() {
System.out.println("I am on this page");
     }

    @Then("^do this$")
    public void do_this() {
        System.out.println("Do this");
    }

}
