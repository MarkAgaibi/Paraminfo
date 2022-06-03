package stepDefinitions;

import PageElements.P01_HomePage;
import PageElements.P04_Product;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class S09_ShoppingCart {

    @When("User click on Add to Cart Button")
    public void AddingProductToCart() throws InterruptedException {

        P04_Product Cart = new P04_Product(Hooks.driver);
        Cart.addCart.click();

        Thread.sleep(1000);
    }

    @Then("The selected product shall be added to the Shopping Cart and a success message shall appear as: The product has been added to your shopping cart")
    public void AssertingCart(){

        P01_HomePage CartAssert = new P01_HomePage(Hooks.driver);
        SoftAssert Asserting = new SoftAssert();
        Asserting.assertEquals(CartAssert.SuccessNotificationMessage.getText(),"The product has been added to your shopping cart");
        Asserting.assertEquals(CartAssert.SuccessNotification.getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        Asserting.assertAll();
    }

}
