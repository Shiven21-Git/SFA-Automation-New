package com.tests.BaseClass;

import Com.testng.Pages.SfaLogin;
import Com.testng.Pages.Utility;
import Com.testng.core.DriverSupplier;
import Com.testng.core.PageGenerator;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.tests.listeners.TestListener;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.util.ResourceBundle;

import static org.testng.AssertJUnit.assertEquals;

@Listeners(TestListener.class)
public class TestBaseClass extends Utility {

    public static final ResourceBundle rb = ResourceBundle.getBundle("config");
    private static final Logger logger = LoggerFactory.getLogger(TestBaseClass.class);
    private final String browser = rb.getString("BrowserName");
    private final String url = rb.getString("URL");
    private final String tenant_ID = rb.getString("TenantId");
    private final String user_ID = rb.getString("UserID");
    private final String password = rb.getString("Password");

    public PageGenerator pageGenerator;
    protected ExtentTest test;
    private ExtentReports extent;

    @BeforeSuite
    public void setUpSuite() {
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("test-ExtendReports/Spark.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    @BeforeMethod
    public void setUp() {
        try {
            test = extent.createTest("Driver Setup and Login Test");
            DriverSupplier.getInstance().openBrowser(browser, url);
            pageGenerator = new PageGenerator();
            logger.info("PageGenerator initialized: {}", pageGenerator);
            SfaLogin loginSfa = pageGenerator.getPageInstance(SfaLogin.class);
            loginSfa.loginPage(tenant_ID,user_ID,password);
            test.pass("Login was successful"); // Now test is initialized
        } catch (Exception e) {
            logger.error("Failed to set up WebDriver and PageGenerator", e);
            if (test != null) {
                test.fail("Failed to set up: " + e.getMessage());
            }
            throw new RuntimeException("Failed to set up: " + e.getMessage(), e);
        }
    }

    @AfterMethod
    public void tearDown() {
        try {
            if (DriverSupplier.getInstance().getDriver() != null) {
//                DriverSupplier.getInstance().quitDriver();
                if (test != null) {
                    test.pass("Browser closed.");
                }
            }
        } catch (Exception e) {
            logger.error("Error during teardown: {}", e.getMessage()); // Use logger
            if (test != null) {
                test.fail("Error during teardown: " + e.getMessage());
            }
        }
    }

    @AfterSuite
    public void tearDownSuite() {
        if (extent != null) {
            extent.flush();
        }
    }

    //  Assertions methods for elements and titles
    public void assertElementDisplayed(WebElement element) {
        createDefaultFluentWait().until(ExpectedConditions.elementToBeClickable(element));
        System.out.println(element);
    }

    public void assertTextEquals(WebElement element, Object expected) {
        String actualText = this.getText(element);
        String expectedText;

        if (expected instanceof WebElement) {
            expectedText = this.getText((WebElement) expected);
        } else if (expected instanceof String) {
            expectedText = (String) expected;
        } else {
            throw new IllegalArgumentException("Expected text should be either WebElement or String");
        }

        assertEquals(actualText, expectedText, "Text does not match");
        System.out.println(actualText);
    }

    public void assertTitleEquals(String expectedTitle) {
        String actualTitle = driver.getTitle();
        assertEquals("Page title does not match", expectedTitle, actualTitle);
        System.out.println(actualTitle);
    }

    public void assertUrlEquals(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        assertEquals("URL does not match", expectedUrl, actualUrl);
        System.out.println(actualUrl);

    }
}