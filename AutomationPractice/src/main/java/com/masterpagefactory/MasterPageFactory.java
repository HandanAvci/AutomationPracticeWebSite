package com.masterpagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MasterPageFactory {
	WebDriver driver;
public  MasterPageFactory( WebDriver driver) {
	
	this.driver=driver;
}
	@FindBy
	(xpath = ("(//*[contains(@class,'login')])"))
	private WebElement signin;

	@FindBy(xpath = ("(//*[contains(@id,'email')])[2]"))
	private WebElement email;

	@FindBy(xpath = ("//*[contains(@name,'passwd')]"))
	private WebElement password;

	@FindBy(xpath = ("//*[contains(@id,'SubmitLogin')]"))
	private WebElement submit;

	@FindBy(xpath = ("//*[@id='selectProductSort']"))
	private List<WebElement> dropdown;
	public List<WebElement> getDropdown() {
		return dropdown;
	}

	public void setDropdown(List<WebElement> dropdown) {
		this.dropdown = dropdown;
	}

	@FindBy(xpath = ("(//*[contains(@class,'sf-with-ul')])[4]"))
	private WebElement dresses;
	public WebElement getDresses() {
		return dresses;
	}

	public void setDresses(WebElement dresses) {
		this.dresses = dresses;
	}

	@FindBy(xpath=("//*[@id=\"selectProductSort\"]"))
	private List<WebElement>shortby;
	
	@FindBy(xpath=("//*[@id=\"center_column\"]/ul/li[4]/div[2]/h5/a"))
	private List<WebElement>select;
	@FindBy(xpath=("//*[@id='total_price_container']"))
	private List<WebElement>totalPrice;
	
	
	
public List<WebElement> getShortby() {
		return shortby;
	}

	public List<WebElement> getSelect() {
		return select;
	}

	public List<WebElement> getTotalPrice() {
		return totalPrice;
	}



@FindBy
(xpath=("//*[contains(@id,'category')])[3]"))
private WebElement category;
	
	public WebElement getCategory() {
	return category;
}
@FindBy 
(xpath=("//*[contains(@class,'product_list grid row')]"))
private List<WebElement> productRow;
	public List<WebElement> getProductRow() {
	return productRow;
}

	@FindBy(xpath=("(//*[contains(@id,'selectProductSort')])[2]"))
	private WebElement selectProductSort;
	@FindBy(xpath=("//*[contains(text(),'Price: Lowest first')]"))
	private WebElement priceLowestFirst;
	
    public WebElement getSelectProductSort() {
		return selectProductSort;
	}

	public WebElement getPriceLowestFirst() {
		return priceLowestFirst;
	}

	public List<WebElement> getProductList() {
		return productList;
	}

	@FindBy(xpath="//ul[@class='product_list row grid//li//a']")
    private List<WebElement> productList;
    
	
    
    
    
    @FindBy(xpath=("(//*[contains(@class,'product-name')])[4]"))
	private WebElement seconddresses;
	
	
	
	
	
	
	
	
	
	
	
	@FindBy
	(xpath=("//*[contains(@name,'Pink')]"))
	private WebElement pinkDress;
	
	@FindBy
	(xpath=("//*[contains(@class,'icon-plus')]"))
	private WebElement iconPlus1;
	
	
	@FindBy 
	(xpath=("//*[contains(@class,'selector')]"))
	private WebElement selector;
 
	
	@FindBy
	(xpath=("//*[contains(@name,'Submit')]"))
	private WebElement secondDressSubmit;
	
	@FindBy
	(xpath=("//*[contains(@class,'btn btn-default button button-medium')]"))
	private WebElement secondDressCheckOut;
	
	@FindBy
    (xpath=("//*[contains(@class,'button-exclusive btn btn-default')]"))
     private WebElement continueShopping;

	@FindBy
	(xpath=("(//*[contains(@class,'sf-with-ul')])[4]"))
	private WebElement dressesOne;

	@FindBy(xpath = ("(//*[contains(@class,'product-name')])[7]"))
	private WebElement fifthdress;

	@FindBy(xpath = ("//*[contains(@id,'add_to_cart')]"))
	private WebElement addToCart;

	@FindBy(xpath = ("//*[contains(@class,'icon-plus')]"))
	private WebElement iconPlus;
	@FindBy(xpath = ("//*[contains(@class,'button btn btn-default standard-checkout button-medium')]"))
	private WebElement checkOut2;
	@FindBy(xpath = ("//*[contains(@name,'processAddress')]"))
	private WebElement checkOut3;

	@FindBy(xpath = ("//*[contains(@name,'processCarrier')]"))
	private WebElement lastCheckOut;

	@FindBy(xpath = ("//*[contains(@class, 'cheque')]"))
	private WebElement cheque;

	@FindBy(xpath = ("//*[contains(@class,'button btn btn-default button-medium')]"))
	private WebElement confirmOrder;

	@FindBy(xpath = ("//*[contains(@name,'cgv')]"))
	private WebElement termsOfService;

	@FindBy(xpath = ("(//*[contains(@id,'order')])[4]"))
	private WebElement payment;

	@FindBy(xpath = ("//*[contains(@class,'logout')]"))
	private WebElement signOut;

	public WebElement getPayment() {
		return payment;
	}

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


	public WebElement getSeconddresses() {
		return seconddresses;
	}

	public WebElement getPinkDress() {
		return pinkDress;
	}

	public WebElement getIconPlus1() {
		return iconPlus1;
	}

	public WebElement getSelector() {
		return selector;
	}

	public WebElement getSecondDressSubmit() {
		return secondDressSubmit;
	}
	public WebElement getSecondDressCheckOut() {
		return secondDressCheckOut;
	}
	  public WebElement getContinueShopping() {
			return continueShopping;
		}
	  public WebElement getDressesOne() {
			return dressesOne;
		}



	  public List<WebElement> getListDresses() {
			return productList;
		}





}

