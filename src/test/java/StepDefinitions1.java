
package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions1 {
    @Given("I am on the elements page")
    public void i_am_on_the_elements_page() {
        // WebDriver ile demoqa.com/elements sayfasını açma işlemi
    }

    @When("I click on the Buttons element")
    public void i_click_on_the_buttons_element() {
        // Buttons elementine tıklama işlemi
    }

    @When("I click on the Click Me button")
    public void i_click_on_the_click_me_button() {
        // Click Me düğmesine tıklama işlemi
    }

    @Then("I should see the message")
    public void i_should_see_the_message() {
        // Görünen mesajı doğrulama işlemi
    }
}
