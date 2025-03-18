package Com.testng.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SfaCreateExpense extends Utility{
    @FindBy(how =How.XPATH,using = "//span[text()='Employee']")
    WebElement clickOnEmployeeButton;

    @FindBy(how = How.XPATH,using = "//a[text()='Expenses']")
    WebElement clickOnExpenses;
    @FindBy(how = How.XPATH,using = "//button[text()='Add My Expense']")
    WebElement clickAddMyExpenses;

    @FindBy(how = How.XPATH,using = "//input[@id='item']")
    WebElement enterSpentOn;
    @FindBy(how = How.XPATH,using = "//input[@id='abc']")
    WebElement enterDate;
    @FindBy(how = How.XPATH,using = "deptwo")
    WebElement enterAmount;
    @FindBy(how = How.XPATH,using = "//select[@class='form-select']")
    WebElement selectExpenseType;

    @FindBy(how = How.XPATH,using = "//input[@id='image']")
    WebElement selectIamgeFile;


    public void createExpenseForm(){

        click(clickOnEmployeeButton);
        click(clickOnExpenses);
        click(clickAddMyExpenses);
        writeText(enterSpentOn,"Travelling");
        writeText(enterDate,"20-03-2025");
        writeText(enterAmount,"1000");
        selectDropdownByValue(selectExpenseType,"0");
        CharSequence Filepath = "C:\\Users\\shive\\Downloads\\pexels-photo-927022 (1).jpeg";
       selectIamgeFile.sendKeys(Filepath);

    }

}
