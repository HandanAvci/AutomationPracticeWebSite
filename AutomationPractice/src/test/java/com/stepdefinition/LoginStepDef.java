
package com.stepdefinition;

import java.io.IOException;
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
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.config.ObjectMap;
import com.masterpagefactory.MasterPageFactory;
import com.util.HighLighter;
import com.util.TakescreenShot;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {
	static WebDriver driver;
	MasterPageFactory pf;
	ObjectMap obj;

	@Given("user opens browser")
	public void user_opens_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nefer\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("user launches the url")
	public void user_launches_the_url() throws Throwable {
		obj = new ObjectMap();
		driver.get(obj.getconfig("URL"));

	}

	@When("^user clicks on Sign in function$")
	public void user_clicks_on_Sign_in_function() throws Throwable {

		pf = PageFactory.initElements(driver, MasterPageFactory.class);
		HighLighter.colour(driver, pf.getSignin());

		pf.getSignin().click();
		Thread.sleep(2000);
	}

	@When("^user enters login id$")
	public void user_enters_login_id() throws IOException {
		HighLighter.colour(driver, pf.getEmail());
		pf.getEmail().sendKeys(obj.getconfig("Name"));
	}

	@And("^user enters password$")
	public void user_enters_password() throws Throwable {
		HighLighter.colour(driver, pf.getPassword());
		pf.getPassword().sendKeys(obj.getconfig("Password"));

		HighLighter.colour(driver, pf.getSubmit());
	}

	@And("^user click on sign in button$")
	public void user_click_on_sign_in_button() throws Throwable {
		Thread.sleep(2000);
		pf.getSubmit().click();
	}

	@When("^user verify to page title$")
	public void user_verify_to_page_title() {
		Assert.assertEquals("My account - My Store", driver.getTitle());

	}

	@When("^User click on the dresses$")
	public void user_click_on_the_dresses() {

		pf.getDresses().click();
	}

	@When("User able to see all the prices for dresses")
	public void user_able_to_see_all_the_prices_for_dresses() {

		List<String> allproduct = new ArrayList<>();
		for (int i = 0; i < pf.getProductRow().size(); i++) {
			allproduct.add(pf.getProductRow().get(i).getText());

		}

		System.out.println("All product from Automation Practice:" + allproduct);

		Set<String> noDuplicateProduct = new HashSet<>(allproduct);
		System.out.println("Without duplicate product from" + " Automation Practice:" + noDuplicateProduct);

		Map<String, Double> dresses = new HashMap<>();

		dresses.put("Faded Short Sleeve T-shirts", 16.51);
		dresses.put("Blouse", 27.00);
		dresses.put("Printed Chiffon Dress", 16.40);
		dresses.put("Printed Dress", 26.00);
		dresses.put("Printed Dress", 50.99);
		dresses.put("Printed Summer Dress", 30.50);
		dresses.put("Printed Summer Dress", 28.98);
		System.out.println("Initial list of elements: " + dresses);

		List<String> countItems = new ArrayList<>();

		for (String item : allproduct) {

			countItems.add(item + " count:" + Collections.frequency(allproduct, item));
		}

		Set<String> noDuplicateCount = new HashSet<>(countItems);
		System.out.println("Count of items from Automation Practice:" + noDuplicateCount);

		String[] allPrice = { "$28.98 ", "$26.00", "$50.99", "$30.50", "$16.40" };

		List<Double> allPriceList = new ArrayList<>();
		for (String price : allPrice) {
			String dollar = price.replace("$", "").replace(",", "");
			System.out.println(dollar);
			allPriceList.add(Double.parseDouble(dollar));
			Collections.sort(allPriceList);

		}

		System.out.println("All price List - Lowest first: " + allPriceList);
		System.out.println("All price List - Highest first: " + allPriceList);

		System.out.println("Max price: " + Collections.max(allPriceList));
		System.out.println("Min price: " + Collections.min(allPriceList));

		Set<Double> noDuplicatePrice = new HashSet<>(allPriceList);
		System.out.println("Without duplicate price:" + noDuplicatePrice);

	}

	@When("^User click on second dress$")
	public void user_click_on_second_dress() {
		pf.getSeconddresses().click();
	}

	@When("^User chose pink dresses$")
	public void user_chose_pink_dresses() {
		pf.getPinkDress().click();
	}

	@When("^User get Medium dresses$")
	public void user_get_Medium_dresses() {
		Select drpdown = new Select(driver.findElement(By.name("group_1")));
		drpdown.selectByValue("2");

	}

	@When("^User add two dresses to the shopping cart$")
	public void user_add_two_dresses_to_the_shopping_cart() {
		pf.getIconPlus1().click();
		pf.getSelector().click();
	}

	@When("^Dresses should be appear in the results$")
	public void dresses_should_be_appear_in_the_results() {
		HighLighter.colour(driver, pf.getSecondDressSubmit());
		pf.getSecondDressSubmit().click();
	}

	@Given("^User able to see shopping cart$")
	public void user_able_to_see_shopping_cart() throws Throwable {

		Thread.sleep(1000);

		HighLighter.colour(driver, pf.getSecondDressCheckOut());
	}

	@When("^Check the shipping details and proceed$")
	public void check_the_shipping_details_and_proceed() throws Throwable {

		TakescreenShot.captureScreenShot(driver, "Total Shipping");
		Thread.sleep(2000);
	}

	@When("^User click on checkout$")
	public void user_click_on_checkout() throws Throwable {
		pf.getSecondDressCheckOut().click();
		Thread.sleep(2000);
	}

	@When("^Go to the shopping cart summary page$")
	public void go_to_the_shopping_cart_summary_page() throws Throwable {
		HighLighter.colour(driver, pf.getCheckOut2());
		Thread.sleep(2000);
		pf.getCheckOut2().click();

	}

	@When("^User check the item in the shopping cart$")
	public void user_check_the_item_in_the_shopping_cart() {
		pf.getCheckOut3().click();
	}

	@When("^User verify terms of service$")
	public void User_verify_terms_of_service() throws Throwable {

		HighLighter.colour(driver, pf.getTermsOfService());
		pf.getTermsOfService();
		Thread.sleep(2000);
		pf.getTermsOfService().click();
	}

	@When("^Two dress should be in the shopping cart$")
	public void two_dress_should_be_in_the_shopping_cart() throws Throwable {
		pf.getLastCheckOut().click();
		Thread.sleep(2000);
	}

	@Given("^Select the check payment and proceed$")
	public void select_the_check_payment_and_proceed() throws Throwable {
		HighLighter.colour(driver, pf.getCheque());
		Thread.sleep(2000);
		pf.getCheque().click();

	}

	@When("^Confirm the order$")
	public void confirm_the_order() {
		HighLighter.colour(driver, pf.getConfirmOrder());
		TakescreenShot.captureScreenShot(driver, "Total Price");
		pf.getConfirmOrder().click();
	}

	@Then("^User sign out$")
	public void user_sign_out() {
		pf.getSignOut().click();
	}

}
