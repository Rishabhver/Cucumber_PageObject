package steps;

import org.testng.Assert;

import com.sun.tools.javac.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarGuideUsedCarPageAction;
import pages.actions.CarsGuideHomePageActions;
import utils.SeleniumDriver;

public class UsedCarsSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarGuideUsedCarPageAction carGuideUsedCarPageAction = new CarGuideUsedCarPageAction();
	
	

	
	@And("^I clicked on used car \"([^\"]*)\" link$")
	public void i_clicked_on_used_car_link(String link) throws Throwable {
		
		
	    
		carsGuideHomePageActions.clickOnUsedCarFromMenu();
	}

	@And("^select Used car brand as \"([^\"]*)\" from Anymake drop down$")
	public void select_Used_car_brand_as_from_Anymake_drop_down(String selectUsedCar) throws Throwable {
	    
	    carGuideUsedCarPageAction.SelectUsedCar(selectUsedCar);
	}

	@And("^select used car model as \"([^\"]*)\" from Any model dropdown$")
	public void select_used_car_model_as_from_Any_model_dropdown(String selectUsedCarModel) throws Throwable {
	    
		carGuideUsedCarPageAction.SelectUsedCarModel(selectUsedCarModel);
	}

	@And("^select used car location as \"([^\"]*)\" from Location dropdown$")
	public void select_used_car_location_as_from_Location_dropdown(String usedCarLocation) throws Throwable {
	    
		carGuideUsedCarPageAction.SelectUsedCarLocation(usedCarLocation);
	}

	@And("^select used car price as \"([^\"]*)\" from price dropdown$")
	public void select_used_car_price_as_from_price_dropdown(String price) throws Throwable {
	    
		carGuideUsedCarPageAction.SelectUsedCarprice(price);
	}

	@And("^click on used car Find_My_Next_Car button$")
	public void click_on_used_car_Find_My_Next_Car_button() throws Throwable {
	    
		carGuideUsedCarPageAction.clickOnFindMyCarOnUsedCarPage();
	}

	@Then("^I should see the list of Used cars$")
	public void i_should_see_the_list_of_Used_cars() throws Throwable {
	    
	}

	@And("^The page title of used cars be \"([^\"]*)\"$")
	public void the_page_title_of_used_cars_be(String title) throws Throwable {
	   
		String Actualtitle = SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(Actualtitle, title);
	}
}
