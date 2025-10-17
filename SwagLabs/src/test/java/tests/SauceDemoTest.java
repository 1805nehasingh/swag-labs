package tests;

import base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

public class SauceDemoTest extends BaseClass {

  /*  @BeforeClass
    public void setup() {
        launchBrowser();
    }
    */

    @Test
    public void testSauceDemoEndToEnd() throws InterruptedException {
        // Step 1: Login
        //LoginPage login = new LoginPage(driver);
        //login.login("standard_user", "secret_sauce");

        // Step 2: Add Items
        ProductsPage products = new ProductsPage(driver);
        products.addItemsToCart();
        products.goToCart();
        
        RemoveProduct removeproduct = new RemoveProduct(driver);
        removeproduct.removeItemsToCart();

        // Step 3: Checkout
        CartPage cart = new CartPage(driver);
        cart.clickCheckout();

        // Step 4: Fill checkout details
        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.enterDetails("Shahrukh", "khan", "401420");

        // Step 5: Complete order
        CheckoutOverviewPage overview = new CheckoutOverviewPage(driver);
        overview.finishOrder();

        // Step 6: Back home
        CheckoutCompletePage complete = new CheckoutCompletePage(driver);
        complete.goBackHome();

        // Step 7: Logout using dropdown
        LogoutPage logout = new LogoutPage(driver);
        logout.logoutFromDropdown();
    }

    @AfterClass
    public void tearDown() {
        closeBrowser();
    }
    
}
