package testCases;

import org.testng.annotations.BeforeMethod;

import browsePages.SignIn;
import testBase.TestBase;

public class LoginPageTest extends TestBase {

	SignIn login ;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initiate();
		login = new SignIn();
		

 		
	}

}
