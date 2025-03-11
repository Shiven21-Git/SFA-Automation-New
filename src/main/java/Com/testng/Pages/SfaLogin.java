package Com.testng.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SfaLogin extends Utility {
    @FindBy(id = "tenantId")
    private WebElement tenantId;

    @FindBy(id ="userId")
    private WebElement userName;

    @FindBy(id ="passwordInput")
    private WebElement passWord;

    @FindBy(how = How.XPATH, using = "//p[text()='SIGN IN']")
    private WebElement signInButton;

    @FindBy(how = How.XPATH, using = "//button[text() = 'My Permissions']")
    private WebElement myPermission;



    public void loginPage(String tenantid,String Username,String password) {

        writeText(tenantId,tenantid);
        writeText(userName,Username);
        writeText(passWord,password);
        waitForFixedTime(1500);
        signInButton.click();
    }
    public void clickMyPermission(){
        click(myPermission);
    }
}
