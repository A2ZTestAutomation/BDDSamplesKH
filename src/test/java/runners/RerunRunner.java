package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		features="@target/failedScenaios.txt",
		glue={"stepDefs"},
		monochrome=true,
		dryRun=false,
		plugin={"pretty",
				"html:target/Reports/HTMLReport.html"
		})
public class RerunRunner {

}
