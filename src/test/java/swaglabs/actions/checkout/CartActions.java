package swaglabs.actions.checkout;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.ui.Button;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.find;

public class CartActions extends UIInteractions {


    @Step("Start Checkout")
    public void startCheckout() {
        find("#checkout").click();

    }
}
