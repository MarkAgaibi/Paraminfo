package PageElements;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_Login {

    WebDriver driver;

    public P02_login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    public WebElement Email;

    @FindBy(id = "Password")
    public WebElement Password;

    @FindBy(css = "div[class=\"buttons\"] button[type=\"submit\"]")
    public WebElement LoginButton;
}
