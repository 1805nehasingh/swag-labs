package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    public static WebDriver driver;

    
    public static void launchBrowser() {
        WebDriverManager.chromedriver().setup();
        
        ChromeOptions options = new ChromeOptions();

        // 🔹 Run in Incognito
        options.addArguments("--incognito");

        // 🔹 Disable password save popups & breach alerts
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-password-generation");
        options.addArguments("--disable-features=PasswordLeakDetection");

        
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        
        
    }
    
    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
