package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveProduct {
	
	WebDriver driver;
	
	By fleecejacket = By.id("remove-sauce-labs-fleece-jacket");
	By bikelight = By.id("remove-sauce-labs-bike-light");
	
	public RemoveProduct(WebDriver driver) {
        this.driver = driver;
    }
	
	public void removeItemsToCart() throws InterruptedException {
        driver.findElement(fleecejacket).click();
        Thread.sleep(3000);
        driver.findElement(bikelight).click();
        Thread.sleep(3000);
        
        
    }

}
