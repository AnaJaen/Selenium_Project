package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage google = new GooglePage();

    @Given("^navego a Google$")
    public void navigateToGoogle() {
        google.navigateToGogle();

    }

    @When("^busco con un criterio de busqueda$")
    public void enterSearchCriteria() {

    }

    @And("^hago click en el boton buscar$")
    public void clickSearchButton() {

    }

    @Then("^Obtengo resultado$")
    public void validateResults() {

    }
}
