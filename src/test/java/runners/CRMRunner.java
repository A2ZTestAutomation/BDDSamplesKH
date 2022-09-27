package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		features="src//test//resources//taggedFeatures//",
		glue={"stepDefNoImpl"},
		monochrome=true,
		dryRun=false,
		plugin={
				"html:target/Reports/HTMLReport.html"
		}
//		tags="@SmokeTest"
//		tags= "not @SmokeTest"
//		tags= "@RegressionTest"
//		tags="@SmokeTest and @RegressionTest"
//		tags="@SmokeTest or @RegressionTest"
//		tags="@SmokeTest or not @RegressionTest and not @E2ETest"
//		tags = "@PhaseTwo and @SmokeTest"
//		tags = "@PhaseOne and @RegressionTest or @PhaseTwo and @SmokeTest"
//		tags = "@PhaseOne"
//		tags = "@SmokeTest"
//		tags = "@RegressionTest"
		)

public class CRMRunner {

}
