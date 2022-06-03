package stepDefinitions;

import PageElements.P01_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class S03_Currency {

    P01_HomePage currency = new P01_HomePage(Hooks.driver);
    Select selector = new Select(currency.MainCurrency);

    String Currency;

    @Given("The user hover into the Home page and click on Currency")
    public void CheckProductsCurrency(){

        if (currency.ProductCurrency.getText().contains("$") == true)
            Currency = "US Dollar";
        else
            Currency = "Euro";
    }

    @When("User Change the products currency")
    public void ChangeProductCurrency(){

        if (Currency == "US Dollar") {
            selector.selectByVisibleText("Euro");
            Currency = "Euro";
        }else {
            selector.selectByVisibleText("US Dollar");
            Currency = "US Dollar";
        }

    }

    @Then("User Find the products currency")
    public void AssertCurrency(){

        SoftAssert currencyAssertion = new SoftAssert();
        currency.MainCurrency = selector.getFirstSelectedOption();
        currencyAssertion.assertTrue(currency.MainCurrency.getText().contains(Currency));
        currencyAssertion.assertAll();
    }

}
