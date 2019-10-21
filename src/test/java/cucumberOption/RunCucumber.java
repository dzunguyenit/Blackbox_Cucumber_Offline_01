package cucumberOption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions", monochrome = true, plugin = { "pretty",
		"html:target/site/cucumber-reports",
		"json:target/site/cucumber.json" }, snippets = SnippetType.CAMELCASE, tags = {
				"@LogInGuruBank,@CreateCustomer,@EditCustomer" })
// mvn install
// mvn -Dbrowser=chrome -Dversion=76.0.3809.68 -Durl=http://demo.guru99.com/v4/ test verify
//mvn -Dbrowser=firefox -Dversion=0.19.0 -Durl=http://demo.guru99.com/v4/ test verify
public class RunCucumber {

}