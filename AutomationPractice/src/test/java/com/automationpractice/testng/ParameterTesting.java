package com.automationpractice.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTesting {

	
	@Parameters("browser") // browser =fire,chrom,safari
	@Test
	public void getbrowser(String browserValue) {
		
		
		System.out.println(browserValue);

	}

}
