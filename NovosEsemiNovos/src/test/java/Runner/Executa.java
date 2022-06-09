package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "./src/test/resources",
		glue = "Steps",
		tags = "@teste",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:target/reportTestNovos1.html", "json:target/reportTestNovos1.json"}
		
		
		
		
		)

public class Executa {

}
