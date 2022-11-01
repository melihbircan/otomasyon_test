package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// 1. Define the web driver
		
		//Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\test_selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//FireFox
		//System.setProperty("webdriver.gecko.driver", "C:\test_selenium\Software\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//Edge
		//System.setProperty("webrdiver.edge.driver", "C:\test_selenium\Software\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		
		// 2. Open web browser and navigate to page 
		
		// Vatan Bilgisayar -Login Page
		driver.get("https://www.vatanbilgisayar.com/login/?returnUrl=%2F&logtab=signin");
		driver.manage().window().maximize();
		
		// Finds Elements: Locate the element, Determine the action, Pass the parameters
		
		
		// 3. Enter email address
		/*driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("bircanmelih@gmail.com");*/
		driver.findElement(By.xpath("//input[@id='email']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bircanmelih@gmail.com");
		driver.findElement(By.cssSelector("input[id='email'")).sendKeys("bircanmelih@gmail.com");
		
		// 4. Enter password
		driver.findElement(By.id("pass")).click();
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("cglmlh27");
		
		Thread.sleep(3000); //3 sn bekle
		
		// 5. Click login button
		driver.findElement(By.id("login-button")).click();

		// 6. Get confirmation
		String message = driver.findElement(By.id("btnMyAccount")).getText();
		System.out.println("CONFIRMATION: " + message); // HESABIM görülmesi yeterli.
		
		if(message == "HESABIM");
		System.out.println("RESULT: " + message);
		System.out.println("LOGIN TEST PASSED ");
		
		
		/*String pageTitle = driver.getTitle();
		if (pageTitle == "VATAN BİLGİSAYAR - Teknoloji & Bilgisayar Hiperstore'u");
		System.out.println("PAGE TITLE TEST PASSED"); */

		// 7. Close the browser
		driver.close();
		driver.quit();
	}

}
