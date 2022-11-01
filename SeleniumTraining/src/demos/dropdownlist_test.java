package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdownlist_test {

	public static void main(String[] args) {
		// 1. Define the web driver
		
		//Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\\\test_selenium\\\\Software\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// 2. Open web browser and navigate to page 
		
		// Vatan Bilgisayar -Login Page
		driver.get("https://www.vatanbilgisayar.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/span[2]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,400);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnMyBasket")));
	}

}
