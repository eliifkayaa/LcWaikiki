package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.payPage;
import util.driverFactory;

public class payPageSteps {
    WebDriver driver = new driverFactory().getDriver();
    payPage payPage = new payPage(driver);

    @When("click Pay")
    public void click_pay() {
        payPage.goPay();
    }
    @Then("check it Pay")
    public void check_it_pay() {
        payPage.checkPay();
    }
}
