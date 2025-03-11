//package Com.testng.Pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//public class AddVendor extends Utility{
//
//    @FindBy(linkText="Inventory Management")
//    WebElement clickInventoryManagement;
//
//    @FindBy(xpath = "(//button[@tabindex=\"-1\"])[2]")
//    WebElement clickOnVendors;
//
//    @FindBy(xpath = "//div[contains(@class,\"MuiGrid-root MuiGrid\")]//button[text()=\"Add Vendor\"]")
//    WebElement clickAddVendor;
//
//    @FindBy(xpath = "//input[@id=\"name\"]")
//    WebElement enterVendorName;
//
//    @FindBy(xpath = "//input[@id=\"combo-box-demo\"]")
//    WebElement enterAddress;
//
//    @FindBy(xpath = "//input[@id=\"email\"]")
//    WebElement enterEmail;
//
//    @FindBy(xpath = "//input[@id=\"city\"]")
//    WebElement enterCity;
//
//    @FindBy(xpath = "//input[@id=\"state\"]")
//    WebElement enterState;
//
//    @FindBy(xpath = "//button[@type=\"submit\"]")
//    WebElement clickOnSubmitButton;
//
//
//    public AddVendor(WebDriver driver) {
//        super(driver);
//    }
//
//    public void inventoryManagementClick(){click(clickInventoryManagement);}
//
//    public void vendorsClick(){click(clickOnVendors);}
//
//    public void addVendorClick(){click(clickAddVendor);}
//
//    public void writeVendorName(){
//        writeText(enterVendorName,"Kesav");
//    }
//
//    public void writeAddress(){
//        writeText(enterAddress,"JS Tower"+randomString(6));
//
//    }
//
//    public void writeEmail(){
//        writeText(enterEmail,"naman@gmail.com");
//    }
//
//    public void mentionCity(){
//        writeText(enterCity,"Kanpur");
//    }
//
//    public void mentionState(){
//        writeText(enterState,"Uttar Pradesh");
//    }
//
//    public void saveButtonClick(){click(clickOnSubmitButton);}
//
//
//}
