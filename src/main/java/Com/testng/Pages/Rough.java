//package Com.testng.Pages;
//
//import Com.testng.core.PageGenerator;
//import org.apache.commons.io.FileUtils;
//import org.apache.commons.lang3.RandomStringUtils;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.*;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Select;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Utility extends PageGenerator {
//    private static final Duration DEFAULT_TIMEOUT = Duration.ofSeconds(20);
//    private static final Duration POLLING_INTERVAL = Duration.ofSeconds(1);
//
//    public WebDriver driver;
//
//    public Utility(WebDriver driver) {
//        super(driver);
//    }
//
//    public static void highlightElement(WebDriver driver, WebElement element, String borderColor, String textColor) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].setAttribute('style', 'border: 8px solid " + borderColor + "; color: " + textColor + ";');", element);
//    }
//
//    // Method to read usernames and passwords from an Excel file
//    public static List<List<String>> readUserCredentialsFromExcel(String filePath, String sheetName) throws IOException {
//        List<List<String>> credentials = new ArrayList<>();
//        FileInputStream fileInputStream = new FileInputStream(filePath);
//        Workbook workbook = new XSSFWorkbook(fileInputStream);
//        Sheet sheet = workbook.getSheet(sheetName);
//
//        for (Row row : sheet) {
//            List<String> rowData = new ArrayList<>();
//            row.forEach(cell -> rowData.add(cell.toString()));
//            credentials.add(rowData);
//        }
//        workbook.close();
//        fileInputStream.close();
//        return credentials;
//    }
//
//    public static List<List<String>> printTableContents(WebDriver driver, By tableLocator, boolean printTable) {
//        WebElement table = driver.findElement(tableLocator);
//        List<WebElement> rows = table.findElements(By.tagName("tr"));
//        List<List<String>> tableData = new ArrayList<>();
//
//        for (WebElement row : rows) {
//            List<WebElement> cells = row.findElements(By.tagName("td"));
//            List<String> rowData = new ArrayList<>();
//            for (WebElement cell : cells) {
//                String cellText = cell.getText();
//                rowData.add(cellText);
//                if (printTable) {
//                    System.out.print(cellText + "\t");  // Tab space between columns for printing
//                }
//            }
//            tableData.add(rowData);
//            if (printTable) {
//                System.out.println();  // Print a new line after each row
//            }
//        }
//        return tableData;
//    }
//
//    public static boolean isValueListedInTable(WebDriver driver, By tableLocator, String value) {
//        WebElement table = driver.findElement(tableLocator);
//        List<WebElement> rows = table.findElements(By.tagName("tr"));
//        for (WebElement row : rows) {
//            List<WebElement> cells = row.findElements(By.tagName("td"));
//            for (WebElement cell : cells) {
//                if (cell.getText().equals(value)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    protected FluentWait<WebDriver> createFluentWait(Duration timeout, Duration polling) {
//        return new FluentWait<>(driver).withTimeout(timeout).pollingEvery(polling).ignoring(NoSuchElementException.class);
//    }
//
//    protected FluentWait<WebDriver> createDefaultFluentWait() {
//        return createFluentWait(DEFAULT_TIMEOUT, POLLING_INTERVAL);
//    }
//
//    protected void clearText(WebElement element) {
//        createDefaultFluentWait().until(ExpectedConditions.visibilityOf(element));
//        element.clear();
//    }
//
//    public void scrollElementIntoView(WebElement element) {
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//    }
//
//    public void click(WebElement element, boolean scrollIntoView) {
//        try {
//            createDefaultFluentWait().until(ExpectedConditions.visibilityOf(element));
//            createDefaultFluentWait().until(ExpectedConditions.elementToBeClickable(element));
//            if (scrollIntoView) {
//                scrollElementIntoView(element);
//            }
//            element.click();
//        } catch (TimeoutException e) {
//            System.out.println("Timeout waiting for element to be clickable: " + e.getMessage());
//        } catch (WebDriverException e) {
//            System.out.println("Element Not Clickable: " + e.getMessage());
//            try {
//                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
//            } catch (WebDriverException jsEx) {
//                System.out.println("JavaScript click also failed: " + jsEx.getMessage());
//            }
//        }
//    }
//
//    public void click(WebElement element) {
//        click(element, true); // Default to scrolling into view
//    }
//
//    protected void writeText(WebElement element, String text, boolean pressEnter) {
//        try {
//            WebElement visibleElement = createDefaultFluentWait().until(ExpectedConditions.visibilityOf(element));
//            visibleElement.clear();
//            visibleElement.sendKeys(text);
//            if (pressEnter) {
//                visibleElement.sendKeys(Keys.ENTER);
//            }
//        } catch (TimeoutException e) {
//            throw new RuntimeException("Failed to locate element within the specified timeout. Element: " + element.toString());
//        } catch (WebDriverException e) {
//            throw new RuntimeException("Error occurred while interacting with the element: " + element.toString() + ". Error: " + e.getMessage());
//        }
//    }
//
//    protected void writeText(WebElement element, String text) {
//        writeText(element, text, false); // Default to not pressing Enter
//    }
//
//    protected String getText(WebElement element) {
//        try {
//            return createDefaultFluentWait().until(ExpectedConditions.visibilityOf(element)).getText();
//        } catch (TimeoutException e) {
//            System.out.println("Element is not visible within the specified timeout.");
//            return null;
//        }
//    }
//
//    public void waitForElementToBeVisible(WebElement element) {
//        createDefaultFluentWait().until(ExpectedConditions.visibilityOf(element));
//    }
//
//    public void waitForElementToBeClickable(WebElement element) {
//        createDefaultFluentWait().until(ExpectedConditions.elementToBeClickable(element));
//    }
//
//    public void waitForFixedTime(long milliseconds) {
//        try {
//            Thread.sleep(milliseconds);
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//    }
//
//    public String randomString(int length) {
//        String letters = RandomStringUtils.randomAlphabetic(length);
//        return "New" + letters;
//    }
//
//    public String randomNumber(int length) {
//        return RandomStringUtils.randomNumeric(length);
//    }
//
//    public String randomAlphanumeric(int lettersLength, int numbersLength) {
//        String letters = RandomStringUtils.randomAlphabetic(lettersLength);
//        String numbers = RandomStringUtils.randomNumeric(numbersLength);
//        return letters + "@" + numbers;
//    }
//
//    public void switchToWindow(WebDriver driver, String windowHandle) {
//        driver.switchTo().window(windowHandle);
//    }
//
//    public void captureScreenshot(WebDriver driver, String screenshotName) throws IOException {
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(source, new File("./screenshots/" + screenshotName + ".png"));
//    }
//
//    public void dragAndDrop(WebElement source, WebElement target) {
//        createDefaultFluentWait().until(ExpectedConditions.visibilityOf(source));
//        createDefaultFluentWait().until(ExpectedConditions.visibilityOf(target));
//        Actions actions = new Actions(driver);
//        actions.dragAndDrop(source, target).build().perform();
//    }
//
//    public void hoverOverElement(WebElement element) {
//        createDefaultFluentWait().until(ExpectedConditions.visibilityOf(element));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).build().perform();
//    }
//
//    protected void selectDropdownByText(WebElement dropdownElement, String visibleText) {
//        createDefaultFluentWait().until(ExpectedConditions.visibilityOf(dropdownElement));
//        Select dropdown = new Select(dropdownElement);
//        dropdown.selectByVisibleText(visibleText);
//    }
//
//    protected void selectDropdownByValue(WebElement dropdownElement, String value) {
//        createDefaultFluentWait().until(ExpectedConditions.visibilityOf(dropdownElement));
//        Select dropdown = new Select(dropdownElement);
//        dropdown.selectByValue(value);
//    }
//
//    protected void selectDropdownByIndex(WebElement dropdownElement, int index) {
//        createDefaultFluentWait().until(ExpectedConditions.visibilityOf(dropdownElement));
//        Select dropdown = new Select(dropdownElement);
//        dropdown.selectByIndex(index);
//    }
//
//    public void selectOptionFromDropdown(WebElement dropdown, WebElement option) {
//        try {
//            WebElement dropdownElement = createDefaultFluentWait().until(ExpectedConditions.elementToBeClickable(dropdown));
//            dropdownElement.click();
//            WebElement optionElement = createDefaultFluentWait().until(ExpectedConditions.elementToBeClickable(option));
//            optionElement.click();
//        } catch (TimeoutException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//}
