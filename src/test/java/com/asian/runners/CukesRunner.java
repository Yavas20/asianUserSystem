package com.asian.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {//"pretty",
                "json:target/cucumber.json",
                "junit:target/junit/junit-report.xml",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"},
        features = "src/test/resources/features",
        glue = "com/asian/step_definitions",
        dryRun = false,
        tags = "@Tasks",
        publish = true



)
public class CukesRunner {
}
