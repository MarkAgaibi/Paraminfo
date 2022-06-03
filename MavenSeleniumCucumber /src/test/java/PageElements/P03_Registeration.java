package PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class P03_Registeration {

    WebDriver driver;

    public P03_RegisterPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "// input[@type=\"radio\"]")
    public WebElement Gender;

    @FindBy(id = "FirstName")
    public WebElement FirstName;

    @FindBy(id = "LastName")
    public WebElement LastName;

    @FindBy(xpath = "//select[@name=\"DateOfBirthDay\"]  //option [@value=\"2\"]")
    public WebElement Day;

    @FindBy(xpath = "//select[@name=\"DateOfBirthMonth\"]  //option [@value=\"6\"]")
    public WebElement Month;

    @FindBy(xpath = "//select[@name=\"DateOfBirthYear\"]  //option [@value=\"1993\"]")
    public WebElement Year;

    @FindBy(id = "Email")
    public WebElement Email;

    @FindBy(id = "Company")
    public WebElement Company;

    @FindBy(id = "Password")
    public WebElement PassWord;

    @FindBy(id = "ConfirmPassword")
    public WebElement ConfirmPassWord;

    @FindBy(id = "register-button")
    public WebElement RegisterButton;

    @FindBy(className = "result")
    public WebElement CompletedRegisteration;

    @FindBy(xpath = "//div [@class=\"buttons\"] //a[@href=\"/\"]")
    public WebElement ContinueButton;

}