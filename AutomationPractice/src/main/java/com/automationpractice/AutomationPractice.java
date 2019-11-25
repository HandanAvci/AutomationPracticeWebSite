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
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nefer\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		
		ObjectMap obj= new ObjectMap();
		driver.get(obj.getconfig("URL"));
		

	
		MasterPageFactory pf=PageFactory.initElements(driver, MasterPageFactory.class);
		  
	      
		 
		HighLighter.colour(driver,pf.getSignin());
	
		pf.getSignin().click();
		 HighLighter.colour(driver,pf.getEmail());
         pf.getEmail().sendKeys(obj.getconfig("Name"));
		
		HighLighter.colour(driver,pf.getPassword());
       pf.getPassword().sendKeys(obj.getconfig("Password"));
		
       
       HighLighter.colour(driver,pf.getSubmit());
		
        pf.getSubmit().click();
        
        Thread.sleep(1000);
       
        pf.getDresses().click();
        
       
        HighLighter.colour(driver,pf.getFifthdress());
        pf.getFifthdress();
    
        HighLighter.colour(driver,pf.getFifthdress());
        pf.getFifthdress().click();
        HighLighter.colour(driver,pf.getAddToCart());
        HighLighter.colour(driver,pf.getAddToCart());
        pf.getAddToCart();
        pf.getAddToCart().submit();
        HighLighter.colour(driver,pf.getIconPlus());
        HighLighter.colour(driver,pf.getIconPlus());
        pf.getIconPlus();
        pf.getIconPlus().click();
        pf.getIconPlus().click();
        pf.getIconPlus().click();
        HighLighter.colour(driver,pf.getCheckOut2());
        pf.getCheckOut2().click();
        pf.getCheckOut3().click();
        HighLighter.colour(driver,pf.getTermsOfService());
        pf.getTermsOfService();
        
        pf.getTermsOfService().click();
        pf.getLastCheckOut().click();
        HighLighter.colour(driver,pf.getCheque());
        pf.getCheque().click();
        HighLighter.colour(driver,pf.getConfirmOrder());
        pf.getConfirmOrder().click();
        pf.getSignOut().click();
        TakescreenShot.captureScreenShot(driver, "My Account- My Store");
        driver.close();
        
      
        
	}

}
