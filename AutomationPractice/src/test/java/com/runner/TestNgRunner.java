package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions

(plugin = { "pretty", 
		"html:target/site/cucumber-pretty", 
		"rerun:target/rerun.txt",
		"json:target/cucumber1.json" } ,
     

     snippets=SnippetType.UNDERSCORE,

		features = {"src/test/resources/LoginPage.feature" },
			

		glue = { "com.stepdefinition" },

		monochrome = true, strict = true)

public class TestNgRunner extends AbstractTestNGCucumberTests {
	

}
