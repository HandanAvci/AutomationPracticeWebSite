package com.automationpractice;





import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.config.ObjectMap;
import com.masterpagefactory.MasterPageFactory;
import com.util.HighLighter;
import com.util.TakescreenShot;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException, IOException {
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

		HighLighter.colour(driver, pf.getFifthdress());
		pf.getFifthdress();

		Thread.sleep(2000);
		HighLighter.colour(driver, pf.getFifthdress());
		Thread.sleep(2000);

		pf.getFifthdress().click();
		Thread.sleep(2000);
		HighLighter.colour(driver, pf.getAddToCart());
		HighLighter.colour(driver, pf.getAddToCart());
		Thread.sleep(2000);

		pf.getAddToCart();
		pf.getAddToCart().submit();
		HighLighter.colour(driver, pf.getIconPlus());
		Thread.sleep(2000);
		HighLighter.colour(driver, pf.getIconPlus());
		pf.getIconPlus();

		pf.getIconPlus().click();
		pf.getIconPlus().click();
		Thread.sleep(2000);
		pf.getIconPlus().click();

		pf.getIconPlus().click();

		pf.getIconPlus().click();
		Thread.sleep(2000);

		
		
		HighLighter.colour(driver, pf.getCheckOut2());
		pf.getCheckOut2().click();
		TakescreenShot.captureScreenShot(driver, "Total Price");
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
		pf.getConfirmOrder().click();
		pf.getSignOut().click();

		TakescreenShot.captureScreenShot(driver, "Automation login page");
		// driver.close();

	}

}
