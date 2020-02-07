package com.automationpractice;

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
import com.report.ExtentReport;
import com.util.HighLighter;
import com.util.TakescreenShot;

public class AutomationPractice extends ExtentReport {
	private WebDriver driver;
	private MasterPageFactory pf;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nefer\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
	 driver = new ChromeDriver(chromeOptions);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@Test
	public void login() throws Throwable {
	
        driver.getTitle();

		System.out.println("My Store");

		ObjectMap obj = new ObjectMap();
		driver.get(obj.getconfig("URL"));

		pf = PageFactory.initElements(driver, MasterPageFactory.class);

		HighLighter.colour(driver, pf.getSignin());

		pf.getSignin().click();
		Thread.sleep(2000);
		HighLighter.colour(driver, pf.getEmail());
		pf.getEmail().sendKeys(obj.getconfig("Name"));

		HighLighter.colour(driver, pf.getPassword());
		pf.getPassword().sendKeys(obj.getconfig("Password"));

		HighLighter.colour(driver, pf.getSubmit());

		Thread.sleep(2000);
		pf.getSubmit().click();

	}

	@Test(dependsOnMethods = "login")
	public void product() {

		pf.getDresses().click();
		
		
		
		

		List<String> allproduct = new ArrayList<>();
		for (int i = 0; i < pf.getProductRow().size(); i++) {
			allproduct.add(pf.getProductRow().get(i).getText());

		}
		
		
		
		System.out.println("All product from Automation Practice:" + allproduct);
		
		
		Set<String> noDuplicateProduct = new HashSet<>(allproduct);
		System.out.println("Without duplicate product from" + " Automation Practice:" + noDuplicateProduct);
		
		Map<String, Double> dresses=new HashMap<>();
		System.out.println("Initial list of elements: "+dresses);  
		dresses.put("Faded Short Sleeve T-shirts", 16.51);
		dresses.put("Blouse", 27.00);
		 dresses.put("Printed Dress", 26.00);
		
		
		 
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

		pf.getSeconddresses().click();
		pf.getPinkDress().click();
		
		
		Select drpdown = new Select(driver.findElement(By.name("group_1")));
		drpdown.selectByValue("2");

		pf.getIconPlus1().click();
		pf.getSelector().click();

		HighLighter.colour(driver, pf.getSecondDressSubmit());
		pf.getSecondDressSubmit().click();
	}

	@Test(dependsOnMethods = "product")
	public void addTocart() throws InterruptedException {
		Thread.sleep(1000);

		HighLighter.colour(driver, pf.getSecondDressCheckOut());

		TakescreenShot.captureScreenShot(driver, "Total Shipping");
		Thread.sleep(2000);

		pf.getSecondDressCheckOut().click();
		Thread.sleep(2000);

		HighLighter.colour(driver, pf.getCheckOut2());
		Thread.sleep(2000);

		pf.getCheckOut2().click();

		pf.getCheckOut3().click();
	}

	@Test(dependsOnMethods = "addTocart")
	public void termsOfService() throws InterruptedException {
		HighLighter.colour(driver, pf.getTermsOfService());
		pf.getTermsOfService();
		Thread.sleep(2000);
		pf.getTermsOfService().click();
	}

	@Test(dependsOnMethods = "termsOfService")
	public void checkOut() throws InterruptedException {

		pf.getLastCheckOut().click();
		Thread.sleep(2000);

		HighLighter.colour(driver, pf.getCheque());
		Thread.sleep(2000);
		pf.getCheque().click();

		HighLighter.colour(driver, pf.getConfirmOrder());
		TakescreenShot.captureScreenShot(driver, "Total Price");
		pf.getConfirmOrder().click();
		pf.getSignOut().click();

		TakescreenShot.captureScreenShot(driver, "Automation login page");

	}

	@AfterTest
	public void teardown() {

		driver.quit();

	}

}
