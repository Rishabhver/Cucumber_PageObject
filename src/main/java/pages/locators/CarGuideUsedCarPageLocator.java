package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarGuideUsedCarPageLocator {
	
	@FindBy(xpath="//*[@id=\"makes\"]")
	public WebElement UsedCarName;

	@FindBy(xpath="//*[@id=\"models\"]")
	public WebElement UsedCarSelectModel;
	
	@FindBy(xpath="//*[@id=\"locations\"]")
	public WebElement UsedCarSelectLocation;
	
	@FindBy(xpath="//*[@id=\"priceTo\"]")
	public WebElement UsedCarSelectPrice;
	
	@FindBy(css="#search-submit")
	public WebElement UsedCarFindMyCarButton;
	
}
