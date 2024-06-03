package com.euroTech.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/default-html-reports.html",
                  "pretty",
                "rerun:target/rerun.txt"

        },
        features = "src/test/resources/features",
        glue = "com/euroTech/step_definitions",
        dryRun = false,
        tags = "@wip"

)
public class CukesRunner {
}
