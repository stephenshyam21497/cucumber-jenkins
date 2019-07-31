package stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/samplefolder/scenario3.feature",
				//glue="stepdef",
				//plugin="html:target\\htmlreport",
				//plugin="jason:target\\jasonreport.jason",
				plugin="junit:target\\xmlreport.xml")
public class RunnerClass {

}
