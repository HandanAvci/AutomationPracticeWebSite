Feature: Search

  Scenario Outline: Verify the ability to search items

    Given I am on the home page
    When I search <Item>
    Then <Item> should be in the search results

  Examples:
  | Item                  |
  | Blouse                |
  | T-shirt               |
  | Printed Chiffon Dress |
  
  
  
  
  
  
  
  
  
  
  
  
	    And User get Medium dresses
	    	Select drpdown = new Select(driver.findElement(By.name("group_1")));
			drpdown.selectByValue("2");

			pf.getIconPlus1().click();
			pf.getSelector().click();
	    
	    And User get 2 dresses
	    
	    pf.getSeconddresses().click();
	    And user click on pink dresses
			pf.getPinkDress().click();
			 @Given("^User able to see all the  prices for dresses$")
	    public void User_able_to_see_all_the _prices_for_dresses() {
	   
	    }
	    
	    
	    @And ("^User click on second dress$")
	    public void User_click_on_second_dress() {
	    
	    }