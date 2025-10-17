package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage {
    WebDriver driver;

    By backHomeBtn = By.id("back-to-products");

    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goBackHome() throws InterruptedException{
    	Thread.sleep(2000);
        driver.findElement(backHomeBtn).click();
    }
}
