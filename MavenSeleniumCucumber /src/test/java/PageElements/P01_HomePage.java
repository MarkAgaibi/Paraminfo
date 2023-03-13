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


    @FindBy(className = "country-current")
    public WebElement CountryTab;

    @FindBy(id = "translation-btn")
    public WebElement LanguageButton;

    @FindBy(id = "currency-lite")
    public WebElement LitePackageEnglishTitle;
    
    @FindBy(id = "currency-classic")
    public WebElement ClassicPackageEnglishTitle;
    
     @FindBy(id = "currency-premium")
    public WebElement PremiumPackageEnglishTitle;
    
    @FindBy(id = "currency-premium")
    public WebElement PremiumPackageEnglishTitle;
    

}
