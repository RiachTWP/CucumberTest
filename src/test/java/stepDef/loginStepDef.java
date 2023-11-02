package stepDef;

import page.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDef {


    loginPage LoginPage;

    public loginStepDef() {
        this.LoginPage = new loginPage();
    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        LoginPage.goToLoginPage();

    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) { LoginPage.inputUsername(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) { LoginPage.inputPassword(password);
    }

    @When("user click login button")
    public void userClickLoginButton() { LoginPage.clickLoginButton();
    }

    @Then("user able to see error message {string}")
    public void userAbleToSeeErrorMessage(String errorMessage) { LoginPage.validateErrorAppear(errorMessage);
    }
}

