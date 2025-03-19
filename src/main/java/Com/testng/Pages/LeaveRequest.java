package Com.testng.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LeaveRequest extends Utility{

    @FindBy(how =How.XPATH,using = "//span[text()='Employee']")
    WebElement clickOnEmployeeButton;
    @FindBy(how = How.XPATH,using = "//a[text()='Leave Requests']")
    WebElement clickOnLeaveRequest;
    @FindBy(how = How.XPATH,using = "//button[text()='Request Leave']")
    WebElement clickAddLeaveRequest;


    @FindBy(how = How.XPATH,using = "//select[@class='form-select']")
    private WebElement selectLeaveType;
    @FindBy(how = How.XPATH,using = "//input[@id='datepickerdedass']")
    private WebElement selectStartDate;
    @FindBy(how = How.XPATH,using = "//input[@id='datepickerdedoneddsd']")
    private WebElement selectEndDate;
//    @FindBy(how = How.CSS,using = "div.mb-3:nth-of-type(4) p.form-control")
//    private WebElement enterLeaveDuration;
    @FindBy(how = How.XPATH,using = "//textarea[@class='form-control']")
    private WebElement enterLeaveReason;
    @FindBy(how = How.XPATH,using = "//button[text()='Request']")
    private WebElement clickAddRequest;


    public void leaveRequestForm(){

        click(clickOnEmployeeButton);
        click(clickOnLeaveRequest);
        click(clickAddLeaveRequest);
        selectDropdownByValue(selectLeaveType,"2");
        writeText(selectStartDate,"20-03-2025");
        writeText(selectEndDate,"25-03-2025");
 //       writeText(enterLeaveDuration,"7");
        writeText(enterLeaveReason,"Personal matter");
        click(clickAddRequest);


    }
}
