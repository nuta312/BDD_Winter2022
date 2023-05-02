package step_defs;

import io.cucumber.java.en.Given;


public class Reuabsle_steps {

    @Given("enter {string}")
    public void enter(String string) {
        System.out.println(string);
    }



}
