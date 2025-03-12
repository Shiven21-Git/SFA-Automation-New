package Com.testng.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SfaCreateMember extends Utility {

    @FindBy(how =How.XPATH,using = "//span[text()='Employee']")
    WebElement clickOnEmployeeButton;

    @FindBy(how = How.XPATH,using = "//a[text()='Members']")
    WebElement clickOnMembers;

    @FindBy(how = How.XPATH,using = "//button[text()='Add Employee']")
    WebElement clickAddEmployeeButton;

    @FindBy(id = "exampleFormControlInput877")
    WebElement clickEnterFirstName;

    @FindBy(id = "exampleFormControlInput878")
    WebElement ClickEnterLastName;

    @FindBy(id = "dobInput")
    WebElement clickDob;

    @FindBy(id = "img")
    WebElement clickSelectImage;

    @FindBy(id = "exampleFormControlInput2778")
    WebElement clickSelectJoiningData;

    @FindBy(xpath = "(//select[@class=\"form-select\"])[1]")
    WebElement clickSelectDesignation;

    @FindBy(xpath = "(//select[@class=\"form-select\"])/option[4]")
    WebElement selectSalesMen;


    @FindBy(xpath = "(//div[contains(@class,'indicatorContainer')])[1]")
    WebElement clickSelectPermission;
    @FindBy(xpath = "//div[text()='Create Manager']")
    WebElement getClickSelectPermission1;
//    @FindBy(xpath = "//div[text()='Edit Manager']")
//    WebElement getClickSelectPermission2;
//    @FindBy(xpath = "//div[text()='View Manager']")
//    WebElement getClickSelectPermission3;


//    @FindBy(id = "assignMember")
//    WebElement clickSelectRepotingManager;
//
//    @FindBy(xpath = "(//div[@id=\"assignMember\"or @class=\"dropdown-item\"])[2]")
//    WebElement selectVinaySingh;

    @FindBy(xpath = "(//select[@id=\"exampleFormControlInput478\"])[1]")
    WebElement selectRegion;

    @FindBy(xpath = "(//p[text()='Select State'])[2]")
    WebElement selectState;

    @FindBy(xpath = "//div[text()='Uttar Pradesh']")
    WebElement slectStateFromDropdown;

    @FindBy(xpath = "(//p[text()='Select City'])[2]")
    WebElement selectCity;

    @FindBy(xpath = "//div[text()='Kanpur']")
    WebElement selectCityFromMenu;

    @FindBy(css = "div.row.g-3.mb-3:nth-of-type(1) div.row.g-3.mb-3 div.css-1xc3v61-indicatorContainer")
    WebElement selectDivision;
    @FindBy(xpath = "//div[text()='Finance and accounting']")
    WebElement getClickSelectDivision1;

    @FindBy(id = "exampleFormControlInput177")
    WebElement clickEnterMobile;

    @FindBy(id = "exampleFormControlInput277")
    WebElement enterPassword;

    @FindBy(id = "exampleFormControlInput777")
    WebElement enterEmail;

    @FindBy(id = "exampleFormControlInput879")
    WebElement enterEmployeeID;

    @FindBy(xpath = "//button[text()='Add']")
    WebElement addButton;


    public void createMemberForm() {


       // clickOnEmployeeButton.click();
        click(clickOnEmployeeButton);
        click(clickOnMembers);
        click(clickAddEmployeeButton);
        writeText(clickEnterFirstName, "Nitesh");
        writeText(ClickEnterLastName, "Bharti");
        writeText(clickDob, "2001-12-24");

        CharSequence Filepath = "C:\\Users\\shive\\Downloads\\pexels-photo-927022 (1).jpeg";
        clickSelectImage.sendKeys(Filepath);
        writeText(clickSelectJoiningData, "24-12-2024");
       // click(clickSelectDesignation);
        selectDropdownByIndex(clickSelectDesignation,2);
        click(selectSalesMen);
        click(clickSelectPermission);
        click(getClickSelectPermission1);
//      click(getClickSelectPermission2);
//      click(getClickSelectPermission3);
//      click(selectVinaySingh);
//      click(selectRegion);
        selectDropdownByIndex(selectRegion,1);
        click(selectState);
        click(slectStateFromDropdown);
        click(selectCity);
        click(selectCityFromMenu);
        click(selectDivision);
        click(getClickSelectDivision1);
  //    click(selectFmcg);
        writeText(clickEnterMobile, "8736576578");
        writeText(enterPassword, "Test@123");
        writeText(enterEmail, "nitesh_kumar@gmail.com");
        writeText(enterEmployeeID, "EMP_872");
        addButton.click();

    }
}