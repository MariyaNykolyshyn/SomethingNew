package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features",
                glue = "step_definition", tags = {"@test"}, dryRun = false)
public class CukesRunner {
}
