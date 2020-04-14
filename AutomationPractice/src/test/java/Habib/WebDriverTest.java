package Habib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class WebDriverTest {
	
		WebDriver driver;
		
		@BeforeTest
		public void setUp() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\nefer\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
		@Test 
		public void funWithYahooPage() throws Throwable {
			driver.get("https://www.yahoo.com/");
			Assert.assertEquals("Yahoo",driver.getTitle());
            System.out.println(driver.getTitle());
           
            List<WebElement> optionCount = driver.findElements(By.xpath("(//*[contains(@id,'header-nav-bar')])[2]"));
           

           if(driver.findElement(By.xpath("(//*[contains(@id,'header-nav-bar')])[2]")).isDisplayed() ) {                                                                                                        
          
        	   System.out.println(" Test Pass" + " " + optionCount.size());
         
           
		  }
		else {
	            System.out.println("Test Failed");
	        }
		
        WebElement submit=( driver.findElement(By.xpath("//*[contains(@id,'header-search-input')]")));
        submit.sendKeys("Nutrition");
        driver.findElement(By.xpath("//*[contains(@id,'header-desktop-search-button')]")).click();
        
        Thread.sleep(3); 
        driver.navigate().back();
        Thread.sleep(3); 
        
        driver.findElement(By.xpath("//*[contains(@id,'header-signin-link')]")).click();
      
           
           
           
               }
		@Test (dependsOnMethods = "funWithYahooPage")
		public void funWithPayPalSignUpPage()  {
			
			driver.get("https://www.paypal.com");
		
		}


		@AfterTest
		public void tearDown() {
			driver.quit();
		}	
	}
