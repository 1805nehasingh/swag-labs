package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By continueBtn = By.id("continue");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterDetails(String fName, String lName, String pCode)  throws InterruptedException{
        driver.findElement(firstName).sendKeys(fName);
        Thread.sleep(3000);
        driver.findElement(lastName).sendKeys(lName);
        Thread.sleep(3000);
        driver.findElement(postalCode).sendKeys(pCode);
        Thread.sleep(3000);
        driver.findElement(continueBtn).click();
    }
}
