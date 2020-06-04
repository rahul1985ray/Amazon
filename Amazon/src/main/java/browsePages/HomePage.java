package browsePages;


import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePage extends TestBase {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String PageTitle() {
		return driver.getTitle();
	}

}
