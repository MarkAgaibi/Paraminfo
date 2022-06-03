package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (

        // ba3ml right click on the needed feature, then copy Path/Refrence > Copy Path from Content Root
        features = "src/main/resources/features",

        // Ba7aded 2l Package 2le feh 2l step
        glue = "stepDefinitions",
        plugin = { "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit: target/cukes.xml",
                "rerun: target/rerun.txt"},

        tags = "@smoke"
)


public class TestRunner {
}

