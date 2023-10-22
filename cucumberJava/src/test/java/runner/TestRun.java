package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/main/java/features/filterProduct.features",
        glue={"stepDefinition"},
        plugin={"pretty","html:target/HtmlReports"}
)


public class TestRun {
}
