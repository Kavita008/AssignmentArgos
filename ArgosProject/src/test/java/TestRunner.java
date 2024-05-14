import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html"}

        , features="/Users/kavitapatial/Desktop/PROJECTS/AssignmentArgos/ArgosProject"
        , glue = {"browsercontrol", "stepdefinitions"},
        tags = "@Smoketest")


public class TestRunner {






    }



