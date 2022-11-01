package demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FireFoxDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// 1. Create WebDriver
		System.setProperty("webdriver.gecko.driver", "C:\\\\test_selenium\\\\Software\\\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// 2. Navigate to Account Management Page --> Click on Create Account
		driver.get("https://www.vatanbilgisayar.com/login/?returnUrl=%2F&logtab=signup");
		
		// 3. Fill out the form
		
		// 4. Get confirmation
		
		// 5. Close the browser

	}

}
