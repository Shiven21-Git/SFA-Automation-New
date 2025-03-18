package Com.testng.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateProduct extends Utility{

//    @FindBy(linkText="Inventory Management")
//    WebElement clickInventoryManagement;

//    @FindBy(xpath = "//div[@class=\"MuiTabs-flexContainer css-7sga7m\"]/a/button)[1]")
//    WebElement clickOnProducts;

    @FindBy(xpath = "//span[text()='Master']")
    WebElement clickMainMaster;
    @FindBy(xpath = "//a[text()='Product Master']")
    WebElement clickProductMaster;
    @FindBy(xpath = "//button[text()='Create Product']")
    WebElement clickOnAddProducts;

    @FindBy(xpath = "//input[@id='name']")
    WebElement enterName;

    @FindBy(xpath = "//input[@id='bundle_size']")
    WebElement enterBundleSize;

    @FindBy(xpath = "//input[@id='sku']")
    WebElement enterSKU;
    @FindBy(xpath = "//input[@id='productCode']")
    WebElement enterProductCode;

    @FindBy(xpath = "//input[@name='measurementValue']")
    WebElement enterMeasurementValue;
    @FindBy(xpath = "//select[@id='unit_of_measurement']")
    WebElement selectMeasurementUnit;

    @FindBy(xpath = "//input[@id='warehouse_price']")
    WebElement enterWarehousePrice;
    @FindBy(xpath = "//input[@id='stockListPrice']")
    WebElement enterStockistPrice;
    @FindBy(xpath = "//input[@id='retailer_price']")
    WebElement enterRetailerPrice;
    @FindBy(xpath = "//input[@id='gst_percentage']")
    WebElement enterGSTPer;

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
        @FindBy(xpath = "//input[@id='image']")
        WebElement clickSelectImage;

    @FindBy(xpath = "//button[text()='Add']")
    WebElement clickOnSaveButton;


//    public CreateProduct(WebDriver driver) {
//        super(driver);
//    }

    public void createProductForm() throws InterruptedException {
       Thread.sleep(2000);
        clickMainMaster.click();
        clickProductMaster.click();
        clickOnAddProducts.click();
        writeText(enterName,"Garnier Shampoo");
        writeText(enterBundleSize,"4");
        writeText(enterSKU,"Garnier Shampoo 200ml");
        writeText(enterProductCode,"02");
        writeText(enterMeasurementValue,"200");
        selectDropdownByValue(selectMeasurementUnit,"ml");
        writeText(enterBundleSize,"4");
        writeText(enterWarehousePrice,"200");
        writeText(enterStockistPrice,"220");
        writeText(enterRetailerPrice,"250");
        writeText(enterGSTPer,"18");

//        selectMililiter.click();
//        selectVendor.click();
//        selectDinesh.click();
//        selectRandomPage.click();
//        writeText(enterDescription,"Good Quality");
        CharSequence Filepath = "C:\\Users\\shive\\Downloads\\fa-deo.jpg";
        clickSelectImage.sendKeys(Filepath);
        clickOnSaveButton.click();
    }
}
