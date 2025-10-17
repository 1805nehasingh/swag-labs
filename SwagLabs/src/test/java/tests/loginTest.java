package tests;

import base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

public class loginTest extends BaseClass {

    @BeforeClass
    public void setup() {
       launchBrowser();
  }

    @Test
    public void logintest() throws InterruptedException {
        // Step 1: Login
        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");
    }

       

   /* @AfterClass
    public void tearDown() {
        closeBrowser();
    }
    */
}
