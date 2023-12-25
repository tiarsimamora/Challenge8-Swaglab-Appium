package belajarAppium.stepdef;

import belajarAppium.BaseTest;
import belajarAppium.pages.HomePage;
import io.cucumber.java.en.Then;

public class HomeStepDefs extends BaseTest {

    HomePage homePage = new HomePage();

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage.validateOnPage();
    }
}
