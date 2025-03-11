//package Com.testng.Pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//public class CreateProduct extends Utility{
//
//    @FindBy(linkText="Inventory Management")
//    WebElement clickInventoryManagement;
//
////    @FindBy(xpath = "//div[@class=\"MuiTabs-flexContainer css-7sga7m\"]/a/button)[1]")
////    WebElement clickOnProducts;
//
//    @FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-item css-1wxaqej\"]/button)[4]")
//    WebElement clickOnAddProducts;
//
//    @FindBy(xpath = "//input[@name=\"name\"]")
//    WebElement enterName;
//
//    @FindBy(xpath = "//input[@name=\"brandName\"]")
//    WebElement enterBrandName;
//
//    @FindBy(xpath = "//input[@name=\"avgUsageQuantity\"]")
//    WebElement addUsageQuantity;
//
//    @FindBy(xpath = "//div[@class=\"MuiStack-root css-j7qwjs\"]/span")
//    WebElement selectMeasurementUnit;
//
//    @FindBy(xpath = "//li[@data-value=\"MILLILITER\"]")
//    WebElement selectMililiter;
//
//    @FindBy(xpath = "//div[@id=\"mui-component-select-vendorIdList\"]")
//    WebElement selectVendor;
//
//    @FindBy(xpath = "//li[@id=\"4\"]")
//    WebElement selectDinesh;
//
//    @FindBy(xpath = "//div[@id=\"menu-vendorIdList\"]")
//    WebElement selectRandomPage;
//
//    @FindBy(xpath = "//textarea[@name=\"description\"]")
//    WebElement enterDescription;
//
//    @FindBy(xpath = "//div[@class=\"MuiStack-root css-1skovjx\"]/button")
//    WebElement clickOnSaveButton;
//
//
//    public CreateProduct(WebDriver driver) {
//        super(driver);
//    }
//
//    public void createProductForm() throws InterruptedException {
//       Thread.sleep(2000);
//        clickInventoryManagement.click();
//        clickOnAddProducts.click();
//        writeText(enterName,"Garnier Shampoo");
//        writeText(enterBrandName,"Garnier");
//        writeText(addUsageQuantity,"20");
//        selectMeasurementUnit.click();
//        selectMililiter.click();
//        selectVendor.click();
//        selectDinesh.click();
//        selectRandomPage.click();
//        writeText(enterDescription,"Good Quality");
//        clickOnSaveButton.click();
//    }
//}
