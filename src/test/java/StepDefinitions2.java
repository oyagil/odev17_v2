package stepDefinitions;

import io.cucumber.java.en.*;

public class StepDefinitions2 {

    @Given("I open the webtables page")
    public void iOpenTheWebtablesPage() {
        // Burada webtables sayfasını açacak kodu ekleyin
    }

    @When("I click on the {string} button")
    public void iClickOnTheButton(String buttonName) {
        // Belirtilen butona tıklamak için gerekli kodu ekleyin
    }

    @And("I fill in the form with new record details")
    public void iFillInTheFormWithNewRecordDetails() {
        // Yeni kayıt detaylarını doldurmak için gerekli kodu ekleyin
    }

    @And("I click the {string} button")
    public void iClickTheButton(String buttonName) {
        // Belirtilen butona tıklamak için gerekli kodu ekleyin
    }

    @Then("the new record should be added successfully")
    public void theNewRecordShouldBeAddedSuccessfully() {
        // Yeni kaydın başarıyla eklendiğini doğrulayan kodu ekleyin
    }

    @When("I edit the newly added record")
    public void iEditTheNewlyAddedRecord() {
        // Yeni eklenen kaydı düzenlemek için gerekli kodu ekleyin
    }

    @And("I update the record details")
    public void iUpdateTheRecordDetails() {
        // Kayıt detaylarını güncellemek için gerekli kodu ekleyin
    }

    @Then("the record should be updated successfully")
    public void theRecordShouldBeUpdatedSuccessfully() {
        // Kaydın başarıyla güncellendiğini doğrulayan kodu ekleyin
    }
}
