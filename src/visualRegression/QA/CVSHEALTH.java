package visualRegression.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CVSHEALTH {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Eyes eyes = new Eyes();
		eyes.setApiKey("UFnibMBf5106107SunPp98oA3nC7WYox3qiX68oZQsVMdDdc110");
		try {
			eyes.open(driver, "CVS-HEALTH[4.0.95.1a]", "[4.0.95.1a]-CVS HEALTH");
			driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
			//driver.get("https://cvsdemo.stacksplatform.com/");
			driver.get("https://uat-nvcvooy-yegpx7i6b33x2.us-3.platformsh.site/");
			Thread.sleep(3000);
			//1st
			eyes.checkWindow("UAT SITE home page [4.0.95.1a]");
			driver.findElement(By.xpath("//a[contains(text(),'Stress Management Collection')]")).click();
			Thread.sleep(3000);
			//2nd
			eyes.checkWindow("UAT SITE Stress Result Page [4.0.95.1a]");
			driver.findElement(By.xpath("//input[@id='edit-search-form-eit-search-bar-container-query']")).sendKeys("Medicine");
			driver.findElement(By.xpath("//input[@id='edit-search-form-eit-search-bar-container-actions-submit']")).click();
			Thread.sleep(3000);
			//3rd
			eyes.checkWindow("UAT SITE Medicine result [4.0.95.1a]");
			driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
			Thread.sleep(3000);
			//4th
			eyes.checkWindow("UAT SITE grid view [4.0.95.1a]");
			WebElement lastPage = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			lastPage.click();
			Thread.sleep(2000);
			//5th
			eyes.checkWindow("UAT SITE Last page [4.0.95.1a]");
			
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			WebElement eleYellowLast;
			eleYellowLast = driver.findElement(By.xpath("//body/div[1]/div[2]/div[5]/div[1]/div[3]/div[1]/div[1]/footer[1]/div[1]/div[1]/nav[1]/div[1]/ul[4]/li[3]/a[1]"));
			executor.executeScript("arguments[0].click();", eleYellowLast);		
			Thread.sleep(3000);
			//6th
			eyes.checkWindow("UAT SITE - Health page [4.0.95.1a]");
		
		}
		 finally {
				driver.quit();
				eyes.abortIfNotClosed();
			}
		
		
		
	}

}
