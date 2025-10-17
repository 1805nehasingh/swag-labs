package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
    WebDriver driver;

    // Dropdown menu locator (top-right corner)
    By dropdownMenu = By.xpath("//button[@id='react-burger-menu-btn']");
    By logoutOption = By.id("logout_sidebar_link");

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void logoutFromDropdown() throws InterruptedException {
        driver.findElement(dropdownMenu).click();
        Thread.sleep(1000);  // wait for dropdown to expand
        driver.findElement(logoutOption).click();
    }
}
