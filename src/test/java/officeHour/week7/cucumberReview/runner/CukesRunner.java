package officeHour.week7.cucumberReview.runner;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",

        },
        features = "src/test/resources/features",
        glue = "officeHour/week7/cucumberReview/step_definition",
        dryRun = false,
        tags = ""
)
public class CukesRunner {

}
