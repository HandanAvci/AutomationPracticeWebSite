package com.masterpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterPageFactory {
	WebDriver driver;
	public void MasterPageFactory(WebDriver driver) {
		this.driver=driver;
	}
		@FindBy
		(xpath = ("(//*[contains(@class,'login')])"))
		private WebElement signin;
		
		@FindBy
		(xpath=("(//*[contains(@id,'email')])[2]"))
		private WebElement email;
		
		@FindBy
		(xpath=("//*[contains(@name,'passwd')]"))
		private WebElement password;
		
		@FindBy
		(xpath=("//*[contains(@id,'SubmitLogin')]"))
		private WebElement submit;
		
		
		@FindBy
		(xpath=("(//*[contains(@class,'product-name')])[7]"))
		private WebElement fifthdress;
		
		@FindBy
		(xpath=("//*[contains(@id,'add_to_cart')]"))
		private WebElement addToCart;
	//	@FindBy
		//(xpath=("//*[contains(@class,'btn btn-default button button-medium')]"))
		//private WebElement checkOut;
		@FindBy
		(xpath=("//*[contains(@class,'icon-plus')]"))
		private WebElement iconPlus;
		@FindBy
		(xpath=("//*[contains(@name,'processAddress')]"))
		private WebElement checkOut3;
		
		@FindBy
		(xpath=("//*[contains(@name,'processCarrier')]"))
		private WebElement lastCheckOut;
		
		@FindBy
		(xpath=("//*[contains(@class, 'cheque')]"))
		private WebElement cheque;
		
		@FindBy 
		(xpath=("//*[contains(@class,'button btn btn-default button-medium')]"))
		private WebElement confirmOrder;
		
		@FindBy
		(xpath=("//*[contains(@class,'logout')]"))
		private WebElement signOut;

		
		public WebElement getSignOut() {
			return signOut;
		}

		public WebElement getConfirmOrder() {
			return confirmOrder;
		}

		public WebElement getCheque() {
			return cheque;
		}

		public WebElement getLastCheckOut() {
			return lastCheckOut;
		}

		public WebElement getTermsOfService() {
			return termsOfService;
		}
		@FindBy
		(xpath=("//*[contains(@name,'cgv')]"))
		private WebElement termsOfService;
		
		public WebElement getCheckOut3() {
			return checkOut3;
		}

		public void setCheckOut3(WebElement checkOut3) {
			this.checkOut3 = checkOut3;
		}

		public WebElement getIconPlus() {
			return iconPlus;
		}

		public void setIconPlus(WebElement iconPlus) {
			this.iconPlus = iconPlus;
		}
		
		@FindBy
		(xpath=("//*[contains(@class,'button btn btn-default standard-checkout button-medium')]"))
		private WebElement checkOut2;

	 
	

		public WebElement getCheckOut2() {
			return checkOut2;
		}

		

		public WebElement getAddToCart() {
			return addToCart;
		}

		public void setAddToCart(WebElement addToCart) {
			this.addToCart = addToCart;
		}

		public WebElement getFifthdress() {
			return fifthdress;
		}

		public void setFifthdress(WebElement fifthdress) {
			this.fifthdress = fifthdress;
		}

	
	public WebElement getSubmit() {
			return submit;
		}

		public void setSubmit(WebElement submit) {
			this.submit = submit;
		}

	public WebElement getPassword() {
			return password;
		}

	public WebElement getEmail() {
			return email;
		}

		public void setEmail(WebElement email) {
			this.email = email;
		}

	public WebElement getSignin() {
			return signin;
		}

	public WebDriver getDriver() {
		return driver;
	
	
	}
	

}
