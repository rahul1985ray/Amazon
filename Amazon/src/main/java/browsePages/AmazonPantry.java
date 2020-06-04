package browsePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class AmazonPantry extends TestBase {

	public AmazonPantry() {
		PageFactory.initElements(driver, this); // used to initialize page factory
	}

	@FindBy(linkText = "Pantry")
	WebElement pantryLink;

	@FindBy(css = ".nav-logo-link")
	WebElement logo;

//now defining actions on web elements

	public String PageTitle() {
		return driver.getTitle();

	}

	public boolean Image() {
		return logo.isDisplayed();
	}
	
	public void PantryPage() {
		pantryLink.click();
	}
}
