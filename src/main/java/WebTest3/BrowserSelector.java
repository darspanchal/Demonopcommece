package WebTest3;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static WebTest3.BasePage.driver;

public class BrowserSelector extends Utils {


    //Creating method for openbrowser
    public void setUpBrowser() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/BrowserDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage(). timeouts(). implicitlyWait (20, TimeUnit.MILLISECONDS);
        driver.manage(). window().maximize();
        driver.get("https://demo.nopcommerce.com/");

    }
    // Main Method for Closebrowser
    public void closeBrowser(){ driver.close(); }

}
