package Com.testng.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SfaCreateMember extends Utility {

    @FindBy(how =How.XPATH,using = "//span[text()='Employee']")
    WebElement clickOnEmployeeButton;

    @FindBy(how = How.XPATH,using = "//a[text()='Members']")
    WebElement clickOnMembers;

    @FindBy(how = How.XPATH,using = "//*[@id=\"mytask-layout\"]/div[2]/div[2]/div[1]/div/div/div/div/button[3]")
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

    @FindBy(xpath = "//div[@id=\"react-select-4-placeholder\"]")
    WebElement clickSelectPermission;

    @FindBy(id = "react-select-4-live-region")
    WebElement clickSelectCreateManager;

    @FindBy(id = "assignMember")
    WebElement clickSelectRepotingManager;

    @FindBy(xpath = "(//div[@id=\"assignMember\"or @class=\"dropdown-item\"])[2]")
    WebElement selectVinaySingh;

    @FindBy(id = "exampleFormControlInput478")
    WebElement selectRegion;

    @FindBy(xpath = "(//select//option[@value=\"1\"])[2]")
    WebElement selectNorth;

    @FindBy(id = "exampleFormControlInput578")
    WebElement selectState;

    @FindBy(xpath = "(//select//option[@value=\"1\"])[3]")
    WebElement slectUttarPradesh;

    @FindBy(id = "assignClient")
    WebElement selectCity;

    @FindBy(xpath = "//div[@id=\"assignClient\"]//following::div[2]")
    WebElement selectKanpur;

    @FindBy(xpath = "//div[@id=\"react-select-7-placeholder\"]")
    WebElement selectDivision;

    @FindBy(xpath = "(//input[@id=\"exampleFormControlInput684\"])[2]")
    WebElement selectFmcg;

    @FindBy(id = "exampleFormControlInput177")
    WebElement clickEnterMobile;

    @FindBy(id = "exampleFormControlInput277")
    WebElement enterPassword;

    @FindBy(id = "exampleFormControlInput777")
    WebElement enterEmail;

    @FindBy(id = "exampleFormControlInput879")
    WebElement enterEmployeeID;


    public void createMemberForm() {


        clickOnEmployeeButton.click();
        clickOnMembers.click();
        clickAddEmployeeButton.click();
        writeText(clickEnterFirstName, "Nitesh");
        writeText(ClickEnterLastName, "Bharti");
        writeText(clickDob, "2001-12-24");
        CharSequence Filepath = "/Users/sharadmishra/Downloads/googlechrome.dmg";
        clickSelectImage.sendKeys(Filepath);
        writeText(clickSelectJoiningData, "2024-12-24");
        clickSelectDesignation.click();
        selectSalesMen.click();
        clickSelectPermission.click();
        clickSelectCreateManager.click();
        clickSelectRepotingManager.click();
        selectVinaySingh.click();
        selectRegion.click();
        selectNorth.click();
        selectState.click();
        slectUttarPradesh.click();
        selectCity.click();
        selectKanpur.click();
        selectDivision.click();
        selectFmcg.click();
        writeText(clickEnterMobile, "8736576574");
        writeText(enterPassword, "Test@123");
        writeText(enterEmail, "nitesh@gmail.com");
        writeText(enterEmployeeID, "EMP_879");

    }
}