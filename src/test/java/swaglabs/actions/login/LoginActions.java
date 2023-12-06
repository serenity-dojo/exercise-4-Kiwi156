package swaglabs.actions.login;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;



public class LoginActions extends UIInteractionSteps {
    @Step
    public void openTheLoginPage() {
        openUrl("https://www.saucedemo.com/");
    }

    @Step("Login with valid credentials")
    public void withValidCredentials() {
        $(LoginForm.USERNAME).sendKeys("standard_user");
        $(LoginForm.PASSWORD).sendKeys("secret_sauce");
        $(LoginForm.LOGIN).click();
    }
}
