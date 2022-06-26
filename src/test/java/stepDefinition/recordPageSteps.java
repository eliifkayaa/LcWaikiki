package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.recordPage;
import util.driverFactory;

public class recordPageSteps {

    WebDriver driver = new driverFactory().getDriver();
    recordPage recordPage = new recordPage(driver);

    @Then("should see New Record")
    public void should_see_new_record() {
        recordPage.signUp();
    }

    @Then("should see E-posta")
    public void shouldSeeEPosta() {
        recordPage.clickEposta();
    }

    @Then("should see Password")
    public void shouldSeePassword() {
        recordPage.clickPassword();
    }

    @Then("should see Phone")
    public void shouldSeePhone() {
        recordPage.clickPhone();
    }

    @When("click Sign Up")
    public void clickSignUp() {
        recordPage.clickSignUp();
    }


}
