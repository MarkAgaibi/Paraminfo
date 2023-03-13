package stepDefinitions;

import PageElements.P01_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class S01_SaudiArabia {

    WebDriver driver= null;
   P01_HomePage Home = new P01_HomePage(Hooks.driver);



@Given("User navigated to Home page of Saudi Arabia with the URL as: \"(.*)\$")
    public  void  Navigate_to_HomePage(String URL){

     window.location.assign(URL);
 
    }

@When ("User click on English Language button")
    public void Click_On_Language_Button (){

    // Click on Country Tab in the Home Page
    Home.LanguageButton.click();
    }


@Then("Site changes into the new English display.")
    public void User_Shall_be_Logged_In (){

        //Assert that the URL is correct and the (My Account) Button is displayed
    SoftAssert AssertLogin = new SoftAssert();
    AssertLogin.assertEquals(Hooks.driver.getCurrentUrl(), "https://subscribe.stctv.com/sa-en");
    AssertLogin.assertAll();
    }



}
