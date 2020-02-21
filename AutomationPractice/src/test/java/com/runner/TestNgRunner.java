package com.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.config.ObjectMap;
import com.masterpagefactory.MasterPageFactory;
import com.util.HighLighter;
import com.util.TakescreenShot;

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
