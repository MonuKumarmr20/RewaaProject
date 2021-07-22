package testBase;

import com.cucumber.enums.Browsers;
import com.cucumber.enums.OS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    public static WebDriver driver;

    public WebDriver selectBrowser(String browser) {
        if (System.getProperty("os.name").toLowerCase().contains(OS.WINDOW.name().toLowerCase())) {
            if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/drivers/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            }
        }
        return driver;
    }
}
