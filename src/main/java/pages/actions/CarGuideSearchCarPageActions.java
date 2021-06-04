package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarGuideSearchCarPageLocator;
import utils.SeleniumDriver;

public class CarGuideSearchCarPageActions {
	
	CarGuideSearchCarPageLocator carguidesearchcarpagelocator;	
	
         public CarGuideSearchCarPageActions()
         {
        	 carguidesearchcarpagelocator = new CarGuideSearchCarPageLocator();
        	 PageFactory.initElements(SeleniumDriver.getDriver(), carguidesearchcarpagelocator);
         }
         
         public void SelectCarFromDropdown(String selectCar) throws Throwable
         {
        	 carguidesearchcarpagelocator.SelectCar.click();
        	 Select select = new Select(carguidesearchcarpagelocator.SelectCar);
        	 select.selectByVisibleText(selectCar);
        	 
        	
        }
         
        
         
         
         public void SelectCarModelFromDropdown(String selectCarModel)
         {
        	 
        	 carguidesearchcarpagelocator.SelectCarModel.click();
        	 Select select = new Select(carguidesearchcarpagelocator.SelectCarModel);
        	 select.selectByVisibleText(selectCarModel);
         }
         
         public void SelectCarLocationFromDropdown(String selectLocation)
         {
        	 carguidesearchcarpagelocator.SelectLocation.click();
        	 Select select = new Select(carguidesearchcarpagelocator.SelectLocation);
        	 select.selectByVisibleText(selectLocation);
         }
         
        
         
         public void SelectCarPriceFromDropdown(String selectPrice)
         {
        	 carguidesearchcarpagelocator.SelectPrice.click();
        	 Select select = new Select(carguidesearchcarpagelocator.SelectPrice);
        	 select.selectByVisibleText(selectPrice);
         }
         
         public void ClickonFindNewCarButton()
         {
        	 carguidesearchcarpagelocator.FindmynextcarButton.click();
         }
}
