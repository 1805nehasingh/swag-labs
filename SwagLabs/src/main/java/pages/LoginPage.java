package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String pass) throws InterruptedException {
        driver.findElement(username).sendKeys(user);
        Thread.sleep(5000);
        driver.findElement(password).sendKeys(pass);
        Thread.sleep(5000);
        driver.findElement(loginBtn).click();
    }
}
