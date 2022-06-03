package stepDefinitions;

import PageElements.P01_HomePage;
import PageElements.P02_Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class S01_Login {

    WebDriver driver= null;
   P02_Login login = new P02_Login(Hooks.driver);
   P01_HomePage Home = new P01_HomePage(Hooks.driver);



@Given("User shall be navigated to login page")
    public  void  Navigate_to_Login(){

    //Click on Login Tab in the Home Page
    Home.loginTab.click();
    }

@When ("user entre a valid Email and valid Password: \"(.*)\" and \"(.*)\"$")
    public void User_enter_Valid_Username (String Email, String Password){

    // Enter Valid Email and Password
    login.Email.sendKeys(Email,Password);
    }


@And("user click on login button")
    public void User_click_Login_Button (){

    //Click on Login Button
       login.LoginButton.click();
    }

    
@Then("User shall login in to the system successfully")
    public void User_Shall_be_Logged_In (){

        //Assert that the URL is correct and the (My Account) Button is displayed
    SoftAssert AssertLogin = new SoftAssert();
    AssertLogin.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
    AssertLogin.assertTrue(Home.MyAccountTab.isDisplayed());
    AssertLogin.assertAll();
    }



}