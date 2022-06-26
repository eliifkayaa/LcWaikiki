package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class payPage {
    By goPay = By.cssSelector("#ShoppingCartContent > div:nth-child(4) > div.col-md-4.desktop-price-info > div.col-md-12.pl-20.pr-20 > a");
    By checkPay = By.cssSelector("#app > div.container.pb-3 > div > div.col-md-7.col-sm-12.col-xs-12.mt70 > div > div:nth-child(1) > div > div > span");
     WebDriver driver;
     WebDriverWait wait;

    public payPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void goPay() {
        driver.findElement(goPay).click();
    }

    public void checkPay() {
        driver.findElement(checkPay);
    }
}
