package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basketPage {
    By addCard = By.cssSelector("#pd_add_to_cart");
    By goCard = By.cssSelector("#header__container > header > div.header__middle > div.header__middle__right > div > div:nth-child(3) > a > span.dropdown-label");
    By size = By.cssSelector("#ShoppingCartContent > div:nth-child(4) > div.col-md-8 > div.products-area > div.rd-cart-item.shoppingcart-item > div.row.mb-5 > div.col-md-8.col-xs-9.pr-0.text-left > div > div.bottom > span.rd-cart-item-size");
    By control = By.cssSelector("#ShoppingCartContent > div:nth-child(4) > div.col-md-8 > div:nth-child(2) > div > span");

    WebDriver driver;
    WebDriverWait wait;

    public basketPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }

    public void addCard() {
        driver.findElement(addCard).click();
    }

    public void goCard() {
        driver.findElement(goCard).click();
    }

    public void checkCard() {
        driver.findElement(size);
        driver.findElement(control);
    }
}
