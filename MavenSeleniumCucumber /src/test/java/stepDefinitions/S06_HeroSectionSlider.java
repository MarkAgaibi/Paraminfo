package stepDefinitions;

import PageElements.P01_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class S06_HeroSectionSlider {

    P01_HomePage Hero = new P01_HomePage(Hooks.driver);

    @Given("User clicks on first slide")
    public void ClickingNokiaSlide(){

        Hero.NokiaSlide.click();
    }

    @When("User Clicks on Nokia Slider")
    public void ClickingNokiaImage() throws InterruptedException {

        Hero.NokiaImage.click();
        Thread.sleep(2000);
    }

    @Then("Nokia product shall be filtered and opened in a new tab")
    public void AssertNokiaSlide(){

        SoftAssert slidersAssertion = new SoftAssert();
        slidersAssertion.assertEquals(Hero.NokiaImage.getAttribute("href"), "http://demo.nopcommerce.com/");
        slidersAssertion.assertAll();
    }



        //Second Scenario
    @Given("User clicks on Second slide")
    public void ClickingiPhoneSlide(){

        Hero.IphoneSlide.click();
    }

    @When("User Clicks on iPhone image Slider")
    public void ClickingiPhoneImage() throws InterruptedException {

        Hero.IphoneImage.click();
        Thread.sleep(2000);
    }

    @Then("iPhone 6 product shall be filtered and opened in a new tab")
    public void AssertiPhoneSlide(){

        SoftAssert slidersAssertion = new SoftAssert();
        slidersAssertion.assertEquals(Hero.IphoneImage.getAttribute("href"), "http://demo.nopcommerce.com/");
        slidersAssertion.assertAll();
    }

}
