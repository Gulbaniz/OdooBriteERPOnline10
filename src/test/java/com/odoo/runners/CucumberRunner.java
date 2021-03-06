package com.odoo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/odoo/step_definitions",
        dryRun = false,
        tags = "@CreateOpportunity"
    

)
public class CucumberRunner {
}
