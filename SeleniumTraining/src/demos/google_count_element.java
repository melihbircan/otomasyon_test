package demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_count_element {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\test_selenium\\\\Software\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name ='q']")).click();
		driver.findElement(By.xpath("//input[@name ='q']")).clear();
		driver.findElement(By.xpath("//input[@name ='q']")).sendKeys("dji");
				
		List<WebElement> ListOfInputElements = driver.findElements(By.xpath("//input"));
		int count = ListOfInputElements.size();
		System.out.println("Counts of input elements: " + count);
		driver.close();
		
	}

}
