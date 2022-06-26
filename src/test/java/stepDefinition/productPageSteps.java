package stepDefinition;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.productPage;
import util.driverFactory;

public class productPageSteps {
    WebDriver driver = new driverFactory().getDriver();
    productPage productPage = new productPage(driver);

    @When("click Category")
    public void clickCategory() {
        productPage.clickCategory();
    }

    @When("click Category Color {string}")
    public void clickCategoryColor(String product) {
        productPage.filterProduct(product);
    }

    @When("click Product")
    public void click_product() {
        productPage.selectProduct();
    }

    @When("click Product Size M")
    public void clickProductSizeM() {
        productPage.selectSize();
    }



}