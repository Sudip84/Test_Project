
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/homePage.feature",
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
                "html:target/cucumber-reports/cucumber_report.html" },
        monochrome = true
)

public class TestRunner {

}
