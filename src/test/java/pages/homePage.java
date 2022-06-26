package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage {
    By logo = By.cssSelector("#header__container > header > div.header__middle > div.header__middle__left > a");
    By cookie = By.cssSelector("#cookieseal-banner > div > button:nth-child(3)");

    WebDriver driver;
    WebDriverWait wait;

    public homePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }
    public void checkHomePage() {
        driver.findElement(cookie).click();
    }
    public void checkLogo() {
        driver.findElement(logo);

    }
}
