package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = "src/test/java/search_soccer/stepdefinitions/SoccerSearchStepDefinitions.java",
        publish = true
)
public class CucumberTestSuite {}
