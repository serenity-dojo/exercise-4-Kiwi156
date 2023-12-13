package swaglabs.actions.navigate;

import net.serenitybdd.core.steps.UIInteractions;

public class NavigateActions extends UIInteractions {

    public void toInventoryPage() {
        openUrl("https://www.saucedemo.com/inventory.html");
    }

    public void toTheShoppingCart() {
        find(".shopping_cart_link").click();
    }
}
