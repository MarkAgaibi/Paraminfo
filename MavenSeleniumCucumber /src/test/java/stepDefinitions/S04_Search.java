package stepDefinitions;

import PageElements.P01_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class S04_Search {

    P01_HomePage SearchFun = new P01_HomePage(Hooks.driver);

    String SearchedProduct;

    @Given("^User shall be able to search for the word: \"(.*)\"$")
    public void SearchProduct(String Product){

        SearchFun.Search.sendKeys(Product);
        SearchedProduct = Product;
    }

    @When("User shall click on Search Button")
    public void ClickSearchButton(){

        SearchFun.SearchButton.click();
    }

    @Then("All Apple Products shall appear in the search result area")
    public void AssertSearch(){
        SoftAssert AssertSearch = new SoftAssert();
        AssertSearch.assertEquals(SearchFun.SearchTextKeyword.getAttribute("value"),SearchedProduct);
        AssertSearch.assertAll();
    }


}
