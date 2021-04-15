package gan.technical.test.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = {"@ui"},
        plugin = {"pretty"},
        features = "src/test/resources/features/ui",
        glue = "gan.technical.test.steps"
)

public class TestSuiteUi {


}
