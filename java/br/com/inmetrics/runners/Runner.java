package br.com.inmetrics.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		 tags = "@positive or @negative",
		 dryRun = false,
		 snippets = SnippetType.CAMELCASE,
		 monochrome = true,
		 plugin = "pretty",
		 features = "src/main/resources/features/Log.feature",
		 glue = {"br.com.inmetrics.steps"}
		)
public class Runner {

}
