package PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_HomePage {

    WebDriver driver;

    public P01_homePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(className = "ico-register")
    public WebElement RegisterationTab;

    @FindBy(className = "ico-login")
    public WebElement loginTab;

    @FindBy(className = "ico-account")
    public WebElement MyAccountTab;

    @FindBy(id = "customerCurrency")
    public WebElement MainCurrency;

    @FindBy(xpath = "//div[@class=\"prices\"] //span")
    public WebElement ProductCurrency;

    @FindBy(id = "small-searchterms")
    public WebElement Search;

    @FindBy(css = "button[type=\"submit\"]")
    public WebElement SearchButton;

    @FindBy(id = "q")
    public WebElement SearchTextKeyword;

    @FindBy(xpath = "//div [@class=\"header-menu\"]  //ul[@class]")
    public WebElement HeaderMenu;

    @FindBy(xpath = "//a[@href=\"/computers\"]")
    public WebElement ComputersMenu;

    @FindBy(xpath = "//a[@href=\"/software\"]")
    public WebElement SubMenu;

    @FindBy(xpath = "//*[@id=\"nivo-slider\"]/a[1]")
    public WebElement NokiaImage;

    @FindBy(xpath = "//div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]")
    public WebElement NokiaSlide;

    @FindBy(xpath = "//div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]")
    public WebElement IphoneSlide;

    @FindBy(xpath = "//*[@id=\"nivo-slider\"]/a[2]")
    public WebElement IphoneImage;

    @FindBy(linkText = "Facebook")
    public WebElement Facebook;

    @FindBy(linkText = "Twitter")
    public WebElement Twitter;

    @FindBy(linkText = "RSS")
    public WebElement RSS;

    @FindBy(linkText = "YouTube")
    public WebElement Youtube;

    @FindBy(xpath = "//div[@class=\"item-box\"][2]//div[@class=\"product-item\"]//div[@class=\"picture\"]")
    public WebElement macbookPicture;

    @FindBy(xpath = "//div[@id=\"bar-notification\"]//div")
    public WebElement SuccessNotification;

    @FindBy(xpath = "//div[@id=\"bar-notification\"]//p")
    public WebElement SuccessNotificationMessage;


}
