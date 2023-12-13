package swaglabs.actions.catalog;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.ui.Button;


import net.serenitybdd.screenplay.ui.PageElement;
import org.openqa.selenium.By;


public class InventoryActions extends UIInteractionSteps {

    @Step("Add '{0}' to the cart")
    public void addToCart(String item) {
       find(("#add-to-cart-sauce-labs-backpack"));
       find(Button.withText("Add to cart")).click();
    }

}


