package stepDefinitions;

import PageElements.P01_HomePage;
import PageElements.P04_Product;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class S08_Whishlist {

    @When("User can press to add an item to the WishList")
    public void addProduct() throws InterruptedException {
        P04_Product Product = new P04_Product(Hooks.driver);
        Product.WhishlistIcon.click();
        Thread.sleep(2000);
    }

    @Then("The selected product shall be added to the User's Whishlist")
    public void wishlistAssertion(){

        P01_HomePage Whishlist = new P01_HomePage(Hooks.driver);
        SoftAssert WhishlistAsserting = new SoftAssert();
        WhishlistAsserting.assertEquals(Whishlist.SuccessNotificationMessage.getText(),"The product has been added to your wishlist");
        WhishlistAsserting.assertEquals(Whishlist.SuccessNotification.getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        WhishlistAsserting.assertAll();
    }
}
