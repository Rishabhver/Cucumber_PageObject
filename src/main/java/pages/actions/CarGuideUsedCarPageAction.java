package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarGuideUsedCarPageLocator;
import utils.SeleniumDriver;

public class CarGuideUsedCarPageAction {
	
	CarGuideUsedCarPageLocator carGuideUsedCarPageLocator;
	
	public CarGuideUsedCarPageAction()
	{
		carGuideUsedCarPageLocator = new CarGuideUsedCarPageLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), carGuideUsedCarPageLocator);
	}
	
	
	public void SelectUsedCar(String carname)
	{
		carGuideUsedCarPageLocator.UsedCarName.click();
		Select select = new Select(carGuideUsedCarPageLocator.UsedCarName);
		select.selectByVisibleText(carname);
	}
	
	public void SelectUsedCarModel(String model)
	{
		carGuideUsedCarPageLocator.UsedCarSelectModel.click();
		Select select = new Select(carGuideUsedCarPageLocator.UsedCarSelectModel);
		select.selectByVisibleText(model);
	}
	
	
	public void SelectUsedCarLocation(String location)
	{
		carGuideUsedCarPageLocator.UsedCarSelectLocation.click();
		Select select = new Select(carGuideUsedCarPageLocator.UsedCarSelectLocation);
		select.selectByVisibleText(location);
	}
	
	public void SelectUsedCarprice(String price)
	{
		carGuideUsedCarPageLocator.UsedCarSelectPrice.click();
		Select select = new Select(carGuideUsedCarPageLocator.UsedCarSelectPrice);
		select.selectByVisibleText(price);
	}
	
	public void clickOnFindMyCarOnUsedCarPage()
	{
		carGuideUsedCarPageLocator.UsedCarFindMyCarButton.click();
	}

}
