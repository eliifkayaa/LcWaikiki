package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.homePage;
import util.driverFactory;

public class homePageSteps {
    homePage homePage = new homePage(driverFactory.getDriver());

    @Given("LcWaikiki is on Home Page")
    public void lc_waikiki_is_on_home_page() {
     homePage.checkHomePage();
    }

    @Then("should see Banner")
    public void should_see_banner() {
        homePage.checkLogo();
    }

}
