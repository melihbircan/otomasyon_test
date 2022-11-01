package demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class vatan_dji_mini2 {

	public static void main(String[] args) throws InterruptedException {
		// 1. Define the web driver
		
				//Chrome
				System.setProperty("webdriver.chrome.driver", "C:\\\\test_selenium\\\\Software\\\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//FireFox
				//System.setProperty("webdriver.gecko.driver", "C:\\Users\\tr1b5223\\Desktop\\TEST SELENIUM\\Software\\geckodriver.exe");
				//WebDriver driver = new FirefoxDriver();

				
				// 2. Open web browser and navigate to page 
				
				// Vatan Bilgisayar -Login Page
				driver.get("https://www.vatanbilgisayar.com/login/?returnUrl=%2F&logtab=signin");
				driver.manage().window().maximize();
				
				// Finds Elements: Locate the element, Determine the action, Pass the parameters
				
				
				// 3. Enter email address

				driver.findElement(By.xpath("//input[@id='email']")).click();
				driver.findElement(By.xpath("//input[@id='email']")).clear();
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("b@gmail.com");
				
				// 4. Enter password
				driver.findElement(By.id("pass")).click();
				driver.findElement(By.id("pass")).clear();
				driver.findElement(By.id("pass")).sendKeys("aaa");
				
				// 5. Click login button
				driver.findElement(By.id("login-button")).click();
				
				WebDriverWait wait = new WebDriverWait(driver, 400);
				wait.until(ExpectedConditions.elementToBeClickable(By.id("btnMyBasket")));
				
				Thread.sleep(2000); // 2 sec. wait
				
				// 6. Search area click and send data 
				
				driver.findElement(By.id("navbar-search-input")).click();
				//driver.findElement(By.xpath("//*[@id='navbar-search-input']")).click(); Rel XPath example
				//driver.findElement(By.xpath("//body[1]/header[1]/nav[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")).click(); Abs XPath example
				driver.findElement(By.id("navbar-search-input")).clear();
				driver.findElement(By.id("navbar-search-input")).sendKeys("dji");
				Thread.sleep(1000);
				// buraya key enter girecek
				driver.findElement(By.id("navbar-search-input")).sendKeys(Keys.ENTER);
				
				wait.until(ExpectedConditions.elementToBeClickable(By.id("btnMyBasket")));
				Thread.sleep(5000);
				// 6. Get confirmation
				
				
				List<WebElement> ListOfInputElements = driver.findElements(By.xpath("//div[@id='productsLoad']/div"));
				int count = ListOfInputElements.size();
				System.out.println("Listelenen ürün sayısı: "+count);
				
				
				
				// 7. Close the browser
				driver.close();
				driver.quit();


	}

}
