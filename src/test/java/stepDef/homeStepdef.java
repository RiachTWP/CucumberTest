package stepDef;

import page.homePage;
import io.cucumber.java.en.Then;
import static base.baseTest.driver;

public class homeStepdef {

    homePage HomePage;
    @Then("user is on homepage")
    public void userIsOnHomepage() {
    HomePage = new homePage(driver);
    HomePage.validateOnHomePage();
    }
}
