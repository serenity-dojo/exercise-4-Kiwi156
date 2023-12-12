package swaglabs.actions.catalog;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.ui.Button;


import net.serenitybdd.screenplay.ui.PageElement;


public class InventoryActions extends UIInteractionSteps {

    @Step("Add '{0}' to the cart")
    public void addToCart(String item) {
        find(Button.withText("Add to cart").inside(inventoryItemWithName(item))).click();
    }

    private SearchableTarget inventoryItemWithName(String item) {
        return PageElement.locatedBy("inventory_item").containingText(item);
    }



}


