package com.UI_Automation.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature/login.feature",
        glue = "com/UI_Automation/StepDefinition",
        tags = "@login",
        plugin = {"html:target/cucumber-report.html",
                "rerun:target/rerun.txt"
        }
)

public class cukesRunner {


}
