package swaglabs.actions.navigate;

import net.serenitybdd.core.steps.UIInteractions;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;



public class NavigateActions extends UIInteractions {

    public void toInventoryPage() {
        openUrl("https://www.saucedemo.com/inventory.html");
    }


    public void toTheShoppingCart() {
        find(By.id("#shopping_cart_container.shopping_cart_container")).click();
    }
}
