package testBase;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	static WebDriver driver;
	static Properties prop;

	TestBase() {

		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\Asit Ray\\eclipse-workspace\\Amazon\\src\\main\\java\\config");
			prop.load(ip);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void inititate() {
     String browserName = prop.getProperty("browser");
     if(browserName.equals("chrome")) {
    	 System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32");
    	 driver = new ChromeDriver();
     }
     
	}
}
