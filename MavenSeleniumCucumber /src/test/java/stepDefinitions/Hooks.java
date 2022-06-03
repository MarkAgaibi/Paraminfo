package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver= null;

    @Before   // The Before Annotation is Cucumber
    public static void OpenBrowser () {

        //WebDriver Config
        String ChromePath = System.getProperty("user.dir") + "/src/main/resources/chromedriver";
        System.setProperty("webdriver.chrome.driver",ChromePath);
        driver= new org.openqa.selenium.chrome.ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);


        //Navigate to needed URL
        driver.navigate().to("https://demo.nopcommerce.com/");

    }


    @After  // The After Annotation is Cucumber
    public static void QuitDriver () {

        driver.quit();
    }


}
