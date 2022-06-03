package stepDefinitions;

import PageElements.P01_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class S07_SocialMedia {

    P01_HomePage Social = new P01_HomePage(Hooks.driver);
    Actions ActionKeys = new Actions(Hooks.driver);
    SoftAssert URLAssert = new SoftAssert();


        //Facebook Scenario
    @Given("Scroll down to the bottom of the Page till facebook icon")
    public void ScrollingDownFacebook() throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) Hooks.driver;
        executor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(3000);

    }

    @When("Click on facebook icon")
    public void ClickingFacebook() throws InterruptedException {
        Social.Facebook.click();
        Thread.sleep(3000);
        ActionKeys.sendKeys(Keys.chord(Keys.LEFT_CONTROL, Keys.TAB));
    }

    @Then("User could open facebook page")
    public void facebookAssertion(){
        URLAssert.assertEquals(Social.Facebook.getAttribute("href"),"http://www.facebook.com/nopCommerce");
        URLAssert.assertAll();
    }






        //Twitter Scenario
    @Given("Scroll down to the bottom of the Page till twitter icon")
    public void ScrollingDownTwitter() throws InterruptedException {

        JavascriptExecutor executor = (JavascriptExecutor) Hooks.driver;
        executor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(3000);

    }

    @When("User opens Twitter Link")
    public void clickTwitter() throws InterruptedException {
        Social.Twitter.click();
        Thread.sleep(3000);
        ActionKeys.sendKeys(Keys.chord(Keys.LEFT_CONTROL, Keys.TAB));
    }

    @Then("Twitter page shall be opened in new tab")
    public void AssertingTwitter(){
        URLAssert.assertEquals(Social.Twitter.getAttribute("href"),"https://twitter.com/nopCommerce");
        URLAssert.assertAll();
    }







         //RSS Scenario
    @Given("Scroll down to the bottom of the Page till RSS icon")
    public void ScrollingDownRSS() throws InterruptedException {

        JavascriptExecutor executor = (JavascriptExecutor) Hooks.driver;
        executor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(3000);

    }

    @When("User click on RSS icon")
    public void ClickingRSS() throws InterruptedException {

        ActionKeys.keyDown(Keys.LEFT_CONTROL).click(Social.RSS).keyUp(Keys.LEFT_CONTROL).build().perform();
        Thread.sleep(3000);
        ActionKeys.sendKeys(Keys.chord(Keys.LEFT_CONTROL, Keys.TAB));
    }

    @Then("User could open RSS Feed page")
    public void AssertingRSS(){

        URLAssert.assertEquals(Social.RSS.getAttribute("href"),"https://demo.nopcommerce.com/news/rss/1");
        URLAssert.assertAll();
    }




        //Youtube Scenario
    @Given("Scroll down to the bottom of the Page till Youtube icon")
    public void ScrollingDownYoutube() throws InterruptedException {

        JavascriptExecutor executor = (JavascriptExecutor) Hooks.driver;
        executor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(3000);

    }

    @When("User click on Youtube icon")
    public void ClickingYoutube() throws InterruptedException {

        Social.Youtube.click();
        Thread.sleep(3000);
        ActionKeys.sendKeys(Keys.chord(Keys.LEFT_CONTROL, Keys.TAB));
    }

    @Then("User could open Youtube page")
    public void AssertingYoutube(){

        URLAssert.assertEquals(Social.Youtube.getAttribute("href"),"http://www.youtube.com/user/nopCommerce");
        URLAssert.assertAll();
    }

}
