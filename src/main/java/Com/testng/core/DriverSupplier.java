package Com.testng.core;

import Com.testng.constants.BrowserTypes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.HashMap;
import java.util.Map;

public class DriverSupplier {

    private static DriverSupplier instance;
    private WebDriver driver;

    // Public method to provide access to the single instance of DriverSupplier
    public static DriverSupplier getInstance() {
        if (instance == null) {
            synchronized (DriverSupplier.class) {
                if (instance == null) {
                    instance = new DriverSupplier();
                }
            }
        }
        return instance;
    }

    private void initializeDriver(String browserName) {
        if (driver == null) {
            try {
                switch (BrowserTypes.valueOf(browserName.toUpperCase())) {
                    case CHROME:
                        chrome();
                        break;

                    case EDGE:
                        edge();
                        break;

                    case FIREFOX:
                        fireFox();
                        break;

                    default:
                        throw new IllegalArgumentException("Unsupported browser type: " + browserName);
                }
            } catch (IllegalArgumentException e) {
                throw new WebDriverException("Invalid browser name provided: " + browserName, e);
            } catch (WebDriverException e) {
                throw new WebDriverException("Failed to initialize browser", e);
            }
        }
    }

    public void openBrowser(String browserName, String URL) {
        initializeDriver(browserName);
        driver.get(URL);
    }

    private void chrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-save-password");
        options.addArguments("--disable-notifications");
        // Disable password save and prompts
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        driver = new ChromeDriver(options);
    }

    private void edge() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        driver = new EdgeDriver(options);
    }

    private void fireFox() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        driver = new FirefoxDriver(options);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}


