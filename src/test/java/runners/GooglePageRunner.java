package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		features="src//test//resources//parallelFeatures//",
		glue={"stepDefs"},
		monochrome=true,
		dryRun=false,
		plugin={"pretty",
				"html:target/Reports/HTMLReport.html",
//				"rerun:target/failedScenaios.txt"
//				"usage:target/Reports/UsageReport",
				"json:target/Reports/JSONReport.json",
				"junit:target/Reports/JunitReport.xml"
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		)

public class GooglePageRunner {

}
