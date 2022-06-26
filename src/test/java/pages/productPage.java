package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class productPage {
    By category = By.cssSelector("#header__container > header > div.header__bottom > nav > ul > li:nth-child(1) > div > div.flex-row > div.flex-col.flex-col--zone-items > ul > li:nth-child(10) > a");
    By color = By.cssSelector("#root > div > div.product-list-container > div.product-list > div:nth-child(5) > div > div.desktop-filter-area > div > div:nth-child(2) > div > div.collapsible-filter-container__body > div.filter-option-search-box > input");
    By select = By.cssSelector("#root > div > div.product-list-container > div.product-list > div:nth-child(5) > div > div.desktop-filter-area > div > div:nth-child(2) > div > div.collapsible-filter-container__body > div.collapsible-filter-container__content-area.collapsible-filter-container__content-area--color-filter > div > span.color-filter-option__pattern > img");
    By product = By.cssSelector("#root > div > div.product-list-container > div.product-list > div:nth-child(5) > div > div.product-grid > div:nth-child(1) > a > div.product-image > img");
    By size = By.cssSelector("#option-size > a:nth-child(6)");

    WebDriver driver;
    WebDriverWait wait;
    public productPage(WebDriver driver) {
        this.driver=driver;
        this.wait = new WebDriverWait(driver, 10);
    }
    public void clickCategory() {
        driver.findElement(category).click();
    }

    public void filterProduct(String product) {
        driver.findElement(color).sendKeys(product);
        driver.findElement(select).click();
    }

    public void selectProduct() {
        driver.findElement(product).click();
    }

    public void selectSize() {
        driver.findElement(size).click();
    }

}
