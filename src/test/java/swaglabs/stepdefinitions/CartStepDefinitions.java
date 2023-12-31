package swaglabs.stepdefinitions;

import com.google.common.base.Splitter;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;
import swaglabs.actions.cart.CartActions;
import swaglabs.actions.cart.CartItems;
import swaglabs.actions.catalog.CatalogItems;
import swaglabs.actions.catalog.InventoryActions;

import swaglabs.actions.cart.CheckoutActions;
import swaglabs.actions.catalog.ProductDetailsActions;
import swaglabs.actions.navigate.NavigateActions;
import swaglabs.model.CustomerDetails;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


public class CartStepDefinitions extends UIInteractions {

    @Steps
    InventoryActions inventoryActions;

    @Steps
    CartActions cartActions;


    CartItems cartItems;

    @Steps
    ProductDetailsActions productDetailsActions;

    @Steps
    CatalogItems catalogItems;

    @Steps
    NavigateActions navigateActions;

    @Steps
    CheckoutActions checkoutActions;


    /**
     * Add an item on the catalog page to the cart
     */
    @When("Colin/he adds {string} to the cart")
    public void colinAddsToTheCart(String item) {
        inventoryActions.addToCart(item);
    }

    @ParameterType(".*")
    public List<String> items(String itemList) {
        return Splitter.on(",").trimResults().splitToList(itemList);
    }
    @Given("Colin/he has the following item(s) in his/her cart:")
    @When("Colin adds the following items to the cart: {items}")
    public void colinAddsToTheCart(List<String> items) {
        for (String item : items) {
            inventoryActions.addToCart(item);
        }
    }


    @When("Colin/he adds this item to the cart")
    public void colinAddsTheCurrentItemTheCart() {
        productDetailsActions.addToCart();
    }

    @Then("the cart item count should be {int}")
    public void theCartItemCountShouldBe(int itemCount) {
        assertThat(catalogItems.shoppingCartBadge()).contains(Integer.toString(itemCount));
    }

 //   @And("Colin/he has the following item(s) in his/her cart:")
   // public void addedTheFollowingItemsToTheCart(List<String> items) {
    //    // TODO: Implement me
   // }

    @And("Colin/he has no items in his/her cart")
    public void addedTheFollowingItemsToTheCart() {
        // TODO: Implement me
    }

    @Then("Colin/he should see the item/items he/she selected in the cart")
    public void shouldSeeItemsHeSelected() {
        // TODO: Implement me

    }

    @When("Colin/he removes {string} from the cart")
    public void heRemovesFromTheCart(String item) {
      inventoryActions.removeFromCart(item);
   }
    @When("Colin/he removes {string} from the cart summary")
    public void heRemovesFromTheCartSummary(String item) {
        cartActions.removeFromCartSummary(item);
    }

    /**
     * Different ways to open the shopping cart
     */
    @Given("Colin/he has opened the shopping cart")
    @Given("Colin/he views his shopping cart")
    @When("Colin/he opens the shopping cart")
    public void opensCartPage() {
        navigateActions.toTheShoppingCart();}

    @When("Colin/he reviews his order")
    public void reviewOrder(){
        navigateActions.toTheShoppingCart();
        cartActions.startCheckout();
        checkoutActions.enterCustomerDetails(CustomerDetails.about("Colin"));
    }
     @When("Colin/he continues shopping")
     public void continuesShopping() {
            navigateActions.toTheShoppingCart();
            cartActions.startCheckout();
            checkoutActions.enterCustomerDetails(CustomerDetails.about("Colin"));
        }
        @Then("Colin/he should see the following items:")
        public void shouldSeeTheFollowingItems(List<String> expectedItems) {
            assertThat(cartItems.itemNames()).containsExactlyElementsOf(expectedItems);
        }

        @DataTableType
        public CustomerDetails customer(Map<String, String> customer) {
            return new CustomerDetails(customer.get("First Name"), customer.get("Last Name"), customer.get("Zip/Post Code"));
        }

        @When("Colin/he provides the following personal details:")
        public void heProvidesTheFollowingDetails(CustomerDetails customerDetails) {
            checkoutActions.enterCustomerDetails(customerDetails);
        }
}
