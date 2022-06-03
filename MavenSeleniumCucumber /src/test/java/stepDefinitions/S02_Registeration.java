package stepDefinitions;


import PageElements.P01_HomePage;
import PageElements.P03_Registeration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class S02_Registeration {

    P01_HomePage HomePage = new P01_HomePage(Hooks.driver);
    P03_Registeration RegisterationPage = new P03_Registeration();

    @Given("User tab on register tab")
    public void RegisterTab() {

        HomePage.RegisterationTab.click();
    }

    @When("Fill all the personal details fields")
    public void FillPersonalDetails() {

        String FirstName = "Mark";
        String LastName = "Agaibi";

        // Click on Gender Radio Button
        RegisterationPage.Gender.click();

        //Fill First Name and Last Name
        RegisterationPage.FirstName.sendKeys(FirstName);
        RegisterationPage.LastName.sendKeys(LastName);

        // Choose the Date of Birth in the format of [DD,MM,YYYY]. N.B:Date is setted in the selection of page Elements.
        RegisterationPage.Day.click();
        RegisterationPage.Month.click();
        RegisterationPage.Year.click();

    }


    @And("^User Enter Email: \"(.*)\"$")
    public void FillEmail (String Email) {

        //Enter Email
        RegisterationPage.Email.sendKeys(Email);
    }


    @And("User Enter Company Name")
    public void CompanyName(){

        String CompanyName = "Automation Solutions";

        // Enter Company Name
        RegisterationPage.Company.sendKeys(CompanyName);
    }

    @And("User Enter Password and Confirm it")
    public void EnterRegisterPassword (){

        String Password = "PassW0rd";
        String ConfirmPassword = "PassW0rd";

        // Enter Password and Confirm it
        RegisterationPage.PassWord.sendKeys(Password);
        RegisterationPage.ConfirmPassWord.sendKeys(ConfirmPassword);
    }

    @And("Click on Register Button")
    public void PressRegister (){

        // Click on the Register Button
        RegisterationPage.RegisterButton.click();
    }


    @Then("Success Register flash message shall appear")
    public void SuccessRegisterMessage () {

        SoftAssert SuccessMessage = new SoftAssert();

        // Use SoftAssertion to assert Success Registeration Message Text
        String RegisterationMessage = "Your registration completed";
        SuccessMessage.assertTrue(RegisterationPage.CompletedRegisteration.getText().contains(RegisterationMessage));

        //Use SoftAssertion to assert Success Registeration Message Color
        SuccessMessage.assertEquals(RegisterationPage.CompletedRegisteration.getCssValue("color"), "rgba(76, 177, 124, 1)");


        SuccessMessage.assertAll();

    }

    @And("Click Continue Button")
    public void ContinueButton(){

        //Click on Continue Button
        RegisterationPage.ContinueButton.click();
    }

}
