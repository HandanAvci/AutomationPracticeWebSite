package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.config.ObjectMap;
import com.masterpagefactory.MasterPageFactory;
import com.util.HighLighter;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {
	 WebDriver driver;
	 MasterPageFactory pf;
	ObjectMap obj;
	@Before
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
	    
	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nefer\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
	}
	@Test
	@When("^user launches the url$")
	public void user_launches_the_url() throws Throwable {
		 
		obj = new ObjectMap();
		 
		driver.get(obj.getconfig("URL"));

	}
	@Test
		@Then ("^the title of the page is My Store$")
		public void Then_the_title_of_the_page_is_My_Store() {
		Assert.assertEquals("My Store", driver.getTitle());
	
	}
	
	
	
	
	@AfterTest
	public void TearDown() {
		
		driver.quit();
	}
		/*
		@Test
		@Given ("^user is on Automation Practice home page$")
		public void user_is_on_Automation_Practice_home_page() {
			
		}
		
		@When ("^user clicks on Sign in function$")
	public void user_clicks_on_Sign_in_function() {
		pf = PageFactory.initElements(driver, MasterPageFactory.class);

		HighLighter.colour(driver, pf.getSignin());

		pf.getSignin().click();
		
		
		@Then ("^user can see the login page$")
		public void user_can_see_the_login_page() {
			
   
	}
	
	
/*
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
	    
	    
		//driver.quit();
	*/
	}



/*

@Given("^User able to open any browser$") 
public void user_able_to_open_any_browser() {
* 
* System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
* driver = new ChromeDriver(); 
driver.manage().window().maximize(); 
}
* 
* @Given("^Put URL and go to login page$") 
public void put_URL_and_go_to_login_page(DataTable table)
{ List<List<String>> list =
* table.raw(); driver.get(list.get(0).get(0)); }

* @When("^User able to click my account$") 
public void user_able_to_click_my_account() { 
	pf = PageFactory.initElements(driver, MasterPageFactory.class); 
	pf.getMyaccount().click();
* 
* }
* 
* @When("^User able to use valid userName$") public void
* user_able_to_use_valid_userName(DataTable table) {
* 
* List<List<String>> list = table.raw();
* pf.getEmail().sendKeys(list.get(1).get(0));
* 
* }
* 
* @When("^User able to put valid password$") public void
* user_able_to_put_valid_password(DataTable table) {
* 
* List<List<String>> list = table.raw();
* pf.getPassword().sendKeys(list.get(1).get(0)); }
* 
* @When("^User able to click submit button$") public void
* user_able_to_click_submit_button() { pf.getPassword().submit(); }
* 
* @Then("^User able to validate Login status$") public void
* user_able_to_validate_Login_status() {
* 
* //Assert.assertTrue(pf.getGcrLogout().size() == 1); }
* 
* @Then("^close the browser$") public void close_the_browser() { driver.quit();
* 
* }

*/	


