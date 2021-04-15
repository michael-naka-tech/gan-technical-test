package gan.technical.test.utils;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HeadlessChrome implements DriverSource {

    @Override
    public  WebDriver newDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/sbm/Desktop/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--no-first-run");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--window-size=1920,1080");

        return new ChromeDriver(chromeOptions);
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
