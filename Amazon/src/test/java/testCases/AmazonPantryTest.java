package testCases;

import org.testng.annotations.BeforeMethod;

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

}
