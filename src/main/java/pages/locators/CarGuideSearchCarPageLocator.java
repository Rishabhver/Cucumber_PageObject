package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarGuideSearchCarPageLocator {
	
	@FindBy(xpath="//*[@id=\"makes\"]")
	public WebElement SelectCar ;
	
	@FindBy(css= "#models")
	public WebElement SelectCarModel ;
	
	@FindBy(xpath= "//*[@id=\"locations\"]")
	public WebElement SelectLocation ;
	
	@FindBy(xpath= "//*[@id=\"priceTo\"]")
	public WebElement SelectPrice ;

	@FindBy(xpath= "//*[@id=\"search-submit\"]")
	public WebElement FindmynextcarButton ;
	

	
}
