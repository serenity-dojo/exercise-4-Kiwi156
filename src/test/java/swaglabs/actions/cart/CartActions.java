package swaglabs.actions.cart;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.PageElement;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.find;

public class CartActions extends UIInteractions {

    @Step("Remove '{0}' from the cart")
    public void removeFromCart(String item) {
        find(Button.withText("Remove").inside(cartItemDescriptionFor(item))).click();
    }

    private SearchableTarget cartItemDescriptionFor(String item) {
        return PageElement.locatedBy(".cart_item").containingText(item);
    }


    @Step("Remove '{0}' from the cart summary")
    public void removeFromCartSummary(String item) {
        find(Button.withText("Remove").inside(cartItemWithName(item))).click();
    }


    @Step("Start the checkout")
    public void startCheckout() {
        $(Button.withText("Checkout")).click();

    }
    private SearchableTarget cartItemWithName(String item) {
        return PageElement.locatedBy(".cart_item").containingText(item);

    }
}




