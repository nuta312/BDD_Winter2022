package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ScenarioOutline_steps {

    @Given("user should login with {string}")
    public void user_should_login_with(String email) {
        System.out.println(email);
    }
    @Given("user should see {string}")
    public void user_should_see(String message) {
        System.out.println(message);
    }
    @Then("user should get {int}")
    public void user_should_get(Integer numbers) {
        System.out.println(numbers);
    }
}
