package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {
    WebDriver driver;

    By finishBtn = By.id("finish");

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void finishOrder() throws InterruptedException {
    	Thread.sleep(2000);
        driver.findElement(finishBtn).click();
    }
}
