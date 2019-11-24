package com.automationpractice;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.masterpagefactory.MasterPageFactory;

public class AutomationPractice {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nefer\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php?");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
	
		
		MasterPageFactory pf=PageFactory.initElements(driver, MasterPageFactory.class);
		pf.getSignin();
		pf.getSignin().click();
		pf.getEmail();
		pf.getEmail().sendKeys("masalkale@gmail.com");
		pf.getPassword();
		pf.getPassword().sendKeys("12345");
        pf.getSubmit();
        pf.getSubmit().click();
        pf.getDresses();
        pf.getDresses().click();
        pf.getFifthdress();
    	jse.executeScript("arguments[0].style.border='3px solid red'", pf.getFifthdress());
       
        pf.getFifthdress().click();
        pf.getAddToCart();
        pf.getAddToCart().submit();
        jse.executeScript("arguments[0].style.border='3px solid red'", pf.getIconPlus());
        pf.getIconPlus();
        pf.getIconPlus().click();
        pf.getIconPlus().click();
        pf.getIconPlus().click();
        
        
        pf.getCheckOut2().click();
        pf.getCheckOut3().click();
        
        pf.getTermsOfService();
        jse.executeScript("arguments[0].style.border='3px solid red'", pf.getTermsOfService());
        
        pf.getTermsOfService().click();
        pf.getLastCheckOut().click();
        pf.getCheque().click();
        pf.getConfirmOrder().click();
        pf.getSignOut().click();
        
        
        
	}

}
