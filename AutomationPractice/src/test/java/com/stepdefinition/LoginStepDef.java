package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.config.ObjectMap;
import com.masterpagefactory.MasterPageFactory;
import com.util.HighLighter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {
	 WebDriver driver;
	 MasterPageFactory pf;
	 int a;
	ObjectMap obj;
	String name;
	@BeforeTest
	@Given("^User need to open a browser$")
	public void user_need_to_open_a_browser() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nefer\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 pf= PageFactory.initElements(driver, MasterPageFactory.class);
		 a=10;
	}
	@Test
	@Given("^Put Automation Practice URL$")
	public void put_automation_practice_URL() throws Throwable {
		 obj = new ObjectMap();
		driver.get(obj.getconfig("URL"));
	    
	}

	@When("^Click signin$")
	public void click_signin() throws Throwable {
		name="Kara";
		System.out.println(name);
		HighLighter.colour(driver,	pf.getSignin());
		pf.getSignin().click();
	    
	}

	@When("^put email$")
	public void put_email() throws Throwable {
		pf.getEmail().sendKeys(obj.getconfig("Name"));
		HighLighter.colour(driver, pf.getEmail());
	}

	@When("^put password$")
	public void put_password() throws Throwable {
		pf.getPassword().sendKeys(obj.getconfig("Password"));
		HighLighter.colour(driver, pf.getPassword());
	    
	}

	@When("^click sign in button$")
	public void click_sign_in_button() throws Throwable {
		pf.getPassword().submit();

	    
	}

	@Then("^login will be successful$")
	public void login_will_be_successful() throws Throwable {
	    
	    
		driver.quit();
	}

	

}
