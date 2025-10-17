package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    WebDriver driver;

    By backpack = By.id("add-to-cart-sauce-labs-backpack");
    By bikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    By bolttshirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By fleecejacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By cartIcon = By.className("shopping_cart_link");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addItemsToCart() throws InterruptedException {
        driver.findElement(backpack).click();
        Thread.sleep(3000);
        driver.findElement(bikeLight).click();
        Thread.sleep(3000);
        driver.findElement(bolttshirt).click();
        Thread.sleep(3000);
        driver.findElement(fleecejacket).click();
        Thread.sleep(3000);
        
    }

    public void goToCart() throws InterruptedException {
    	  Thread.sleep(3000);
        driver.findElement(cartIcon).click();
    }
}
