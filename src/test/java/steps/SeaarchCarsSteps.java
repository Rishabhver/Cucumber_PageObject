package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.actions.CarGuideSearchCarPageActions;
import pages.actions.CarsGuideHomePageActions;
import utils.SeleniumDriver;

public class SeaarchCarsSteps {
	
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarGuideSearchCarPageActions carGuideSearchCarPageActions = new CarGuideSearchCarPageActions();
	
	@Given("^I am on the home page \"([^\"]*)\" of Cars guide page$")
	public void i_am_on_the_home_page_of_Cars_guide_page(String WebsiteUrl) throws Throwable {
	    
	    SeleniumDriver.openPage(WebsiteUrl	);
	}

	@And("^I move to  menu$")
	public void i_move_to_menu(List<String> list) throws Throwable {
	    
		String menu = list.get(1);
		
		System.out.println(" menu selected us -> " +menu);
		
		carsGuideHomePageActions.moveToBuyAndSell();
	
	}

	@And("^I clicked on \"([^\"]*)\" link$")
	public void i_clicked_on_Search_Cars_link(String SearchCar) throws Throwable {
	    
		carsGuideHomePageActions.clickOnSearchCarFromMenu();
	}

	@And("^select car brand as \"([^\"]*)\" from Anymake drop down$")
	public void select_car_brand_as_from_Anymake_drop_down(String CarBrand) throws Throwable {
	    
		carGuideSearchCarPageActions.SelectCarFromDropdown(CarBrand);
	}

	@And("^select model as \"([^\"]*)\" from Any model dropdown$")
	public void select_model_as_from_Any_model_dropdown(String carModel) throws Throwable {
	    
		carGuideSearchCarPageActions.SelectCarModelFromDropdown(carModel);
	}

	@And("^select location as \"([^\"]*)\" from Location dropdown$")
	public void select_location_as_from_Location_dropdown(String carLocation) throws Throwable {

		carGuideSearchCarPageActions.SelectCarLocationFromDropdown(carLocation);
		
	}

	@And("^select price as \"([^\"]*)\" from price dropdown$")
	public void select_price_as_from_price_dropdown(String CarPrice) throws Throwable {
	    
		carGuideSearchCarPageActions.SelectCarPriceFromDropdown(CarPrice);
	    
	}

	@And("^click on Find_My_Next_Car button$")
	public void click_on_Find_My_Next_Car_button() throws Throwable {
	    
		carGuideSearchCarPageActions.ClickonFindNewCarButton();
	}

	@Then("^I should see the list of seached cars$")
	public void i_should_see_the_list_of_seached_cars() throws Throwable {
	    
	    System.out.println("List displaed");
	}
	
	@And("^The page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String ExpectedTitle) throws Throwable {
	   
		String Actualtitle = SeleniumDriver.getDriver().getTitle();
		
		Assert.assertEquals(ExpectedTitle, Actualtitle);
	}

}
