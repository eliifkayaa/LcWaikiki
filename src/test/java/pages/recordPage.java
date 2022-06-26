package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class recordPage {

    By signUp = By.cssSelector(".cart-action__btn.cart-action__btn--bg-white");
    By ePosta = By.cssSelector("#register > div > div > div > form > div:nth-child(1) > input");
    By password = By.cssSelector("#register > div > div > div > form > div.register__password > div > input");
    By phone = By.cssSelector("#register > div > div > div > form > div:nth-child(3) > input");
    By sms = By.cssSelector("#register > div > div > div > form > div.register__optin-checkboxes > label:nth-child(3) > span");
    By use = By.cssSelector("#member-privacy-approve-container > div.checkbox-container > input");
    By signUpClick = By.cssSelector("#register > div > div > div > form > button");

    WebDriver driver;
    WebDriverWait wait;
    public recordPage(WebDriver  driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }

    public void signUp() {
        driver.findElement(signUp).click();
    }

    public void clickEposta() {
        driver.findElement(ePosta).sendKeys("elifkayagokce@outlook.com");

    }

    public void clickPassword() {
        driver.findElement(password).sendKeys("elif123");
    }

    public void clickPhone() {
        driver.findElement(phone).sendKeys("367051923");
    }

    public void clickSignUp() {
        driver.findElement(sms).click();
        driver.findElement(use).click();
        driver.findElement(signUpClick).click();

    }

}
