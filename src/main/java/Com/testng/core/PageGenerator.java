package Com.testng.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PageGenerator {

    private static final Logger logger = LoggerFactory.getLogger(PageGenerator.class);
    public WebDriver driver;

    public PageGenerator() {
        this.driver = DriverSupplier.getInstance().getDriver();
        if (this.driver == null) {
            throw new IllegalStateException("WebDriver is not initialized. Please ensure the driver is set up correctly in DriverSupplier.");
        }
        logger.info("WebDriver initialized in PageGenerator: {}", this.driver);
    }

    public <TPage> TPage getPageInstance(Class<TPage> pageClass) {
        return PageFactory.initElements(driver, pageClass);
    }
}