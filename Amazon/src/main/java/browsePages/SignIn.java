package browsePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class SignIn extends TestBase {

	public SignIn() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(.,'Hello, Sign in')]")
	WebElement SignIn;

	@FindBy(name = "email")
	WebElement Email;

	@FindBy(xpath = "//input[@id='continue']")
	WebElement Continue;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(id = "signInSubmit")
	WebElement Submit;

	public void Login() {
		SignIn.click();
		Email.sendKeys();
		Continue.click();
		Password.sendKeys();
		Submit.click();

	}
}
