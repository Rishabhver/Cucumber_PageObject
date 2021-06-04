package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;



import pages.locators.CarsGuideHomePageLocator;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {
	
	CarsGuideHomePageLocator carsguidehomepagelocator;
	
	public CarsGuideHomePageActions()
	{
		 carsguidehomepagelocator = new CarsGuideHomePageLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsguidehomepagelocator);
	}
	
	
	public void moveToBuyAndSell()
	{
		
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsguidehomepagelocator.CarbuysellLink).perform();
		
	}
	
	public void clickOnSearchCarFromMenu()
	{
		
		carsguidehomepagelocator.SearchCarLink.click();
		
	}
	
	public void clickOnUsedCarFromMenu()
	{
		carsguidehomepagelocator.UsedCarLink.click();
	}
	
	public void moveToReview()
	{
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsguidehomepagelocator.CarReviewsLink).perform();
		
	}

}
