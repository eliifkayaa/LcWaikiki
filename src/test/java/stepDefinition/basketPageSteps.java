package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.basketPage;
import util.driverFactory;

public class basketPageSteps {
    WebDriver driver = new driverFactory().getDriver();
    basketPage basketPage = new basketPage(driver);

    @When("click Add To Basket")
    public void click_add_to_basket() {
     basketPage.addCard();
    }
    @When("click Go To Basket")
    public void click_go_to_basket() {
        basketPage.goCard();
    }
    @Then("check it Basket")
    public void check_it_basket() {
        basketPage.checkCard();
    }
}