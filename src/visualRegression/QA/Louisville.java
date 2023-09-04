package visualRegression.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Louisville {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Eyes eyes = new Eyes();
		// Azeez
		eyes.setApiKey("76jdjWTXH106Aw9XSAsZg2A7X39YDYFUsg9x101Hyjq106lCk110");
		
		driver.manage().timeouts().pageLoadTimeout(140, TimeUnit.SECONDS);
		
		try {
			eyes.open(driver, "Loiusvillie Library - [4.0.90c]", "Loiusvillie-[4.0.90c]");
		driver.get("https://s9094793.stacksdiscovery.com/");
		//driver.get("https://uat-nvcvooy-alvj26exuqbh6.us-4.platformsh.site/");
		
		// For Production site only
		driver.findElement(By.xpath("//input[@id='edit-search-form-search-type-radios-stacks-external-catalogs-custompf']")).click();
		
		eyes.checkWindow("MASTER Louis Page1 4.0.90");
		
		driver.findElement(By.xpath("//input[@id='edit-search-form-stacks-external-catalogs-custompf-search-bar-container-query']")).sendKeys("Adventure Books");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='edit-search-form-stacks-external-catalogs-custompf-search-bar-container-actions-submit']")).click();
		Thread.sleep(5000);
		
		eyes.checkWindow("MASTER Louis Page2 4.0.90");
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@aria-label='catalog']")).click();
		Thread.sleep(9000);
		
		eyes.checkWindow("MASTER Louis Page3 4.0.90");
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@aria-label='my-account']")).click();
		Thread.sleep(9000);
		
		eyes.checkWindow("MASTER Louis Page4 4.0.90");
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@aria-label='branches']")).click();
		Thread.sleep(9000);
		
		eyes.checkWindow("MASTER Louis Page5 4.0.90");
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@aria-label='get-involved']")).click();
		Thread.sleep(9000);
		
		eyes.checkWindow("MASTER Louis Page6 4.0.90");
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@aria-label='get-a-library-card']")).click();
		Thread.sleep(9000);
		eyes.checkWindow("MASTER Louis Page7 4.0.90");
		
		}
		finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}
	}

}
