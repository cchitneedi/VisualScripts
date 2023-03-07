package visualRegression.QA;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

public class CDN_Clone_Medpm_Demo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//Eyes eyes = new Eyes();
		//eyes.setApiKey("79CYkxosb3KQJmYhkQhA4CLfGDeI9a62992l60V8LmyU110");
			driver.manage().timeouts().pageLoadTimeout(110, TimeUnit.SECONDS);
			try {
				//eyes.open(driver, "CDN Clone Medpm Demo-40731", "Batch ID-2jhh744dtwbgi");
			driver.get("https://uat-nvcvooy-2jhh744dtwbgi.us-3.platformsh.site/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			// 1st checkpoint
			//eyes.checkWindow("CDN Clone Medpm Demo-40731 Home Page");
			WebElement ele;
			ele = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			JavascriptExecutor js11 = (JavascriptExecutor) driver;
			js11.executeScript("arguments[0].click();", ele);
			Thread.sleep(5000);
			// 2nd checkpoint
			//eyes.checkWindow("CDN Clone LAST PAGE");
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).sendKeys("APIC Masthead");
			Thread.sleep(10000);
			WebElement clickfunction;
			clickfunction = driver.findElement(By.cssSelector("#edit-search-form-bento-search-bar-container-actions-submit"));
			JavascriptExecutor js22 = (JavascriptExecutor) driver;
			js22.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(10000);
			//3rd checkpoint
			//eyes.checkWindow("Search APIC Masthead Equatorial Article Result");
			driver.findElement(By.xpath("//a[contains(text(),'See 50 More')]")).click();
			Thread.sleep(5000);
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollBy(0,1000)");
			// 4th checkpoint
			//eyes.checkWindow("check/open CDN Clone Medpm - Results page for APIC Masthead article");
			WebElement eleYellowLast;
			eleYellowLast = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("arguments[0].click();", eleYellowLast);
			Thread.sleep(5000);
			//5th checkpoint
			//eyes.checkWindow("check CDN Clone MedpmL APIC Masthead article PubMed Results in Last page");
			driver.findElement(By.xpath("//a[@id='al']")).click();
			Thread.sleep(2000);
			}
			finally {
				//driver.quit();
				//eyes.abortIfNotClosed();
			}
		
	
		
		
	}

}
