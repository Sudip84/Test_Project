
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/homePage.feature",
        plugin = { "pretty", "html:target/cucumber-reports/cucumber_report.html" },
        monochrome = true
)

public class TestRunner {

}
