package swaglabs.actions.catalog;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.ui.Button;


import net.serenitybdd.screenplay.ui.Link;
import net.serenitybdd.screenplay.ui.PageElement;
import org.openqa.selenium.By;


public class InventoryActions extends UIInteractionSteps {

    @Step("Add '{0}' to the cart")
    public void addToCart(String item) {
        find(("#add-to-cart-sauce-labs-backpack"));
        find(Button.withText("Add to cart")).click();
    }

    private SearchableTarget inventoryItemWithName(String item) {
        return PageElement.locatedBy(".inventory_item").containingText(item);
    }

    @Step("View product details for '{0}'")
    public void viewDetailsFor(String item) {
        find(Link.withText(item)).click();
    }

    @Step("Remove '{0}' from the cart")
    public void removeFromCart(String item) {
        find(Button.withText("Remove").inside(inventoryItemWithName(item))).click();
    }
}
