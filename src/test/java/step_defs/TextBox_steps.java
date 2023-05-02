package step_defs;

import com.spacex.driverFactory.ChromeWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBox_steps {

    WebDriver driver = ChromeWebDriver.loadChromeDriver();


    @Given("User should fill up Full Name field with test data")
    public void user_should_fill_up_full_name_field_with_test_data() {
        driver.findElement(By.id("userName")).sendKeys("Johny");
        Assert.fail();
    }

    @Given("User should fill up Email field with test data")
    public void user_should_fill_up_email_field_with_test_data() {
        driver.findElement(By.id("userEmail")).sendKeys("johny@gmail.com");
    }

    @Given("User should fill up Current address field with test data")
    public void user_should_fill_up_current_address_field_with_test_data() {
        driver.findElement(By.id("currentAddress")).sendKeys("Wall Street 123");
    }

    @Given("User should fill up Permenant address field with test data")
    public void user_should_fill_up_permenant_address_field_with_test_data() {
        driver.findElement(By.id("permanentAddress")).sendKeys("Wall Street 123");
    }

    @When("User click Submit button")
    public void user_click_submit_button() {
        driver.findElement(By.id("submit")).click();
    }

    @Then("User should see entered data")
    public void user_should_see_entered_data() {
        //TODO create assertions
        Assert.assertTrue(true);
        Assert.assertTrue(true);
        Assert.assertTrue(true);
        Assert.assertTrue(true);

        driver.close();
        driver.quit();

    }

    @Given("User is on Text box page")
    public void user_is_on_text_box_page() {
        driver.get("https://demoqa.com/text-box");
    }

    @Given("User should fill up Full Name field {string}")
    public void user_should_fill_up_full_name_field(String fullName) {

        driver.findElement(By.id("userName")).sendKeys(fullName);
        
    }
    @Given("User should fill up Email field {string}")
    public void user_should_fill_up_email_field(String email) {
        driver.findElement(By.id("userEmail")).sendKeys(email);
        
    }
    @Given("User should fill up Current address field {int}")
    public void user_should_fill_up_current_address_field(Integer address) {
        driver.findElement(By.id("currentAddress")).sendKeys(String.valueOf(address));
        
    }
    @Given("User should fill up Permenant address field {double}")
    public void user_should_fill_up_permenant_address_field(Double double1) {
        driver.findElement(By.id("permanentAddress")).sendKeys(String.valueOf(double1));
        
    }
}
