package visualRegression.QA;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

public class HBMagruderMemorial {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//cchitneedi@nes.co.in
		Eyes eyes = new Eyes();
		eyes.setApiKey("U7sd0gV48usZ4bzkwcPsAs104X10619109icnq7fzBdCqvABU110");
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		try {
			
			eyes.open(driver, "H B MAGRUDER MEMORIAL-4.0.89a", "[4.0.89a]-MAGRUDER VR TEST");
			//Master URL
			//driver.get("https://ns006371.ebscomedical.com");
			//UAT URL
			driver.get("https://uat-nvcvooy-t2cbe5jpm3uo2.us-3.platformsh.site/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			// 1st checkpoint
			eyes.checkWindow("UAT Site Home Page [4.0.89a]");
			
			WebElement ele;
			ele = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			ele.click();
			Thread.sleep(3000);
			// 2nd checkpoint
			eyes.checkWindow("UAT Last Page [4.0.89a]");
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']"))
					.sendKeys("Yellow fever – Gabon");
			Thread.sleep(1000);
			WebElement clickfunction;
			clickfunction = driver
					.findElement(By.cssSelector(".submit.expanded.button.js-form-submit.form-submit.focus-input"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("UAT Search Yellow Fever Result Page 4.0.89a");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2000)");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(text(),'See 19 more')]")).click();
			Thread.sleep(6000);
			// 4th checkpoint
			eyes.checkWindow("UAT Pubmed Results page [4.0.89a]");
			driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
			Thread.sleep(2000);
			// 5th
			eyes.checkWindow("UAT Grid View Results Page [4.0.89a]");

			driver.findElement(By.xpath("//a[contains(text(),'Equatorial Guinea.')]")).click();
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			Thread.sleep(3000);
			// 6th checkpoint
			eyes.checkWindow("UAT Equatorial Results Page [4.0.89a]");
			driver.switchTo().window(tabs2.get(0));
			Thread.sleep(3000);
			WebElement eleYellowLast;
			eleYellowLast = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			executor.executeScript("arguments[0].click();", eleYellowLast);
			Thread.sleep(4000);
			// 7th
			eyes.checkWindow("UAT Last Results Page [4.0.89a]");	
					
		}
		finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}
		
	}

}
