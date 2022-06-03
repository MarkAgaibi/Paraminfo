package stepDefinitions;

import PageElements.P01_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class S05_Categories {

    P01_HomePage category = new P01_HomePage(Hooks.driver);
    Actions hover = new Actions(Hooks.driver);

    @Given("User hover category")
    public void HoveringHeaderMenu() throws InterruptedException {
        hover.moveToElement(category.HeaderMenu).perform();
        Thread.sleep(3000);
        hover.moveToElement(category.ComputersMenu).perform();
        Thread.sleep(3000);
    }

    @When("Select Subcategory")
    public void ClickingSubCategory() throws InterruptedException {
        hover.moveToElement(category.SubMenu);
        Thread.sleep(3000);
        hover.click().build().perform();
        Thread.sleep(3000);
    }

    @Then("Check that the subCategory URL will be opened")
    public void AssertHoveringEffect(){
        SoftAssert AssertHover = new SoftAssert();
        AssertHover.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/software");
        AssertHover.assertAll();

    }
}
