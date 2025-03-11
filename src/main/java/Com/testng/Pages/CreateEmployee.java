//package Com.testng.Pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//import java.sql.Driver;
//
//public class CreateEmployee extends Utility{
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/main/div/main/div/header/header/div/div/div[4]/button")
//    private WebElement clickAddEmployeeButton;
//
//    @FindBy(xpath = "//input[@placeholder=\"Enter your name\"]")
//    private WebElement enterName;
//
//    @FindBy(xpath = "//input[@id=\"mobileNo\"]")
//    private  WebElement writeMobileNumber;
//
//    @FindBy(xpath = "//input[@id=\"address\"]")
//    private WebElement enterAddress;
//
//    @FindBy(xpath = "//input[@id=\"password\"]")
//    private WebElement enterPassword;
//
//    @FindBy(xpath = "//div[contains(@id,\"select-gender\")]")
//    private WebElement selectGender;
//
//    @FindBy(xpath = "//li[@id=\"0\"]//span[text()='Male']")
//    private WebElement selectMale;
//
//    @FindBy(xpath = "//div[contains(@id,\"select-overAllRating\")]")
//    private WebElement selectRating;
//
//    @FindBy(xpath = "//li[@id=\"4\"]//span[contains(@class,\"css-1ikde92\")]")
//    private WebElement selectRating5;
//
//    @FindBy(xpath = "//div[contains(@id,\"mui-component-select-serviceIdList\")]")
//    private WebElement selectSpeciality;
//
//    @FindBy(xpath = "//li[@id=\"2\"]//span[2]")
//    private WebElement selectBodySpaService;
//
//    @FindBy(xpath = "//div[@id=\"menu-serviceIdList\"]")
//    private WebElement pageSelect;
//
//    @FindBy(xpath = "//input[@id=\"imgUpload\"]")
//    private WebElement uploadImage;
//
//    @FindBy(xpath = "//div[contains(@class,\"MuiStack-root\")]//button[@type=\"submit\"]")
//    private WebElement clickOnSaveButton;
//
//
//    public CreateEmployee(WebDriver driver) {super(driver);}
//
//
//    public void clickOnAddEmployee(){click(clickAddEmployeeButton);}
//
//    public void enterEmpName(String empName){
//        enterName.sendKeys(empName);
//        //writeText(enterName,empName);
//    }
//
//    public void enterMobileNumber(String mobileNum){
//
//        writeMobileNumber.sendKeys(mobileNum);
//        //writeText(writeMobileNumber,mobileNum);
//    }
//
//    public void writeAdd(String empAdd){
//
//        enterAddress.sendKeys(empAdd);
//        //writeText(enterAddress,empAdd);
//    }
//
//    public void writePassword(String empPass){
//
//        enterPassword.sendKeys(empPass);
//        //writeText(enterPassword,empPass);
//    }
//
//    public void empGender(){click(selectGender);}
//
//    public void setSelectMale(){click(selectMale);}
//
//    public void empRating(){click(selectRating);}
//
//    public void rating5(){click(selectRating5);}
//
//    public void empSpeciality(){click(selectSpeciality);}
//
//    public void serviceSelect(){click(selectBodySpaService);}
//
//    public void selectPage(){click(pageSelect);}
//
//    public void imageUpload(String filepath){
//        uploadImage.sendKeys(filepath);
//
//    }
//
//
//
//    public void clickSaveButton(){click(clickOnSaveButton);}
//
//    }
