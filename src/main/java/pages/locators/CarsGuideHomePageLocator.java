package pages.locators;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class CarsGuideHomePageLocator {
	
	@FindBy(linkText="buy + sell")
	public WebElement CarbuysellLink ;
	
	@FindBy(linkText="reviews")
	public WebElement CarReviewsLink ;
	
	
	@FindBy(linkText="Search Cars")
	public WebElement SearchCarLink ;
	
	@FindBy(linkText="Used")
	public WebElement UsedCarLink ;
	
	
	
	

}
