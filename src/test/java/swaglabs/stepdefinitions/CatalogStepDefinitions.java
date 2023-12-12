package swaglabs.stepdefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import swaglabs.actions.catalog.InventoryActions;
import swaglabs.actions.navigate.NavigateActions;

public class CatalogStepDefinitions {


    @Steps
    NavigateActions navigate;


    @When("Colin/he is browsing the product catalog")
    public void browsingTheCatalog() {
        navigate.toInventoryPage();
    }

    @When("Colin/he has opened the product details for {string}")
    public void opensProductDetails(String productName) {
        // TODO: Implement me
    }
}
