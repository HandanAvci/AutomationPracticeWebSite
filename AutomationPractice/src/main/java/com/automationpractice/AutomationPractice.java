

package com.automationpractice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.config.ObjectMap;
import com.masterpagefactory.MasterPageFactory;
import com.util.HighLighter;
import com.util.TakescreenShot;

public class AutomationPractice {
	
	@Test
	public void Setup() throws InterruptedException, IOException  {

	//public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nefer\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting polly
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// wait for HTML
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //wait for your page load GUI
		String title = driver.getTitle();

		System.out.println("My Store");
		  
		ObjectMap obj = new ObjectMap();
		driver.get(obj.getconfig("URL"));

		MasterPageFactory pf = PageFactory.initElements(driver, MasterPageFactory.class);
      
 
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

		Thread.sleep(1000);

		pf.getDresses().click();

		
		pf.getSeconddresses().click();
		pf.getPinkDress().click();
		pf.getIconPlus1().click();
		pf.getSelector().click();
		
		HighLighter.colour(driver, pf.getSecondDressSubmit());
		pf.getSecondDressSubmit().click();
	
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
		
		HighLighter.colour(driver, pf.getTermsOfService());
		pf.getTermsOfService();
		Thread.sleep(2000);
		pf.getTermsOfService().click();

		pf.getLastCheckOut().click();
		Thread.sleep(2000);

		HighLighter.colour(driver, pf.getCheque());
		Thread.sleep(2000);
		pf.getCheque().click();

		HighLighter.colour(driver, pf.getConfirmOrder());
		TakescreenShot.captureScreenShot(driver, "Total Price");
		pf.getConfirmOrder().click();
		//pf.getSignOut().click();

		TakescreenShot.captureScreenShot(driver, "Automation login page");
	//	 driver.close();

	}

}
