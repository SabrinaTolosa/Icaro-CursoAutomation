package com.ST.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.ST.stepDefinitions", "com.ST.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@critical"
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}