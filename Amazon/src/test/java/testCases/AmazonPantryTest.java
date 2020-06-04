package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browsePages.AmazonPantry;
import testBase.TestBase;

public class AmazonPantryTest extends TestBase {
	AmazonPantry clickobject;

	public AmazonPantryTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initiate();
		clickobject = new AmazonPantry();
	}

	@Test(priority = 1)
	public void PantryPageTitleTest() {
		String title = clickobject.PageTitle();
		Assert.assertEquals(title,
				"Amazon Pantry: The Online Grocery Shopping Store- Shop Daily Grocery Items and Get delivered in Next Day- Amazon.in");
	}

	@Test(priority = 2)
	public void PantryLinkTest() {
		clickobject.PantryPage();
		Assert.assertEquals(true, clickobject.Image());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}
}
