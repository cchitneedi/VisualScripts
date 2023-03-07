package visualRegression.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

public class CVSPHARMACY {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//cchitneedi@nes.co.in
		Eyes eyes = new Eyes();
		eyes.setApiKey("U7sd0gV48usZ4bzkwcPsAs104X10619109icnq7fzBdCqvABU110");
		try {
			eyes.open(driver, "CVS_PHARMACY[4.0.89a]", "[4.0.89a]-SITE ID yegpx7i6b33x2");
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			//driver.get("https://cvsdemo.stacksplatform.com/");
			driver.get("https://uat-nvcvooy-yegpx7i6b33x2.us-3.platformsh.site/");
			Thread.sleep(3000);
			//1st
			eyes.checkWindow("UAT SITE home page [4.0.89a]");
			driver.findElement(By.xpath("//a[contains(text(),'Stress Management Collection')]")).click();
			Thread.sleep(3000);
			//2nd
			eyes.checkWindow("UAT SITE Stress Result Page [4.0.89a]");
			driver.findElement(By.xpath("//input[@id='edit-search-form-eit-search-bar-container-query']")).sendKeys("Medicine");
			driver.findElement(By.xpath("//input[@id='edit-search-form-eit-search-bar-container-actions-submit']")).click();
			Thread.sleep(3000);
			//3rd
			eyes.checkWindow("UAT SITE Medicine result [4.0.89a]");
			driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
			Thread.sleep(3000);
			//4th
			eyes.checkWindow("UAT SITE grid view [4.0.89a]");
			WebElement lastPage = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			lastPage.click();
			Thread.sleep(2000);
			//5th
			eyes.checkWindow("UAT SITE Last page [4.0.89a]");
			driver.findElement(By.xpath(
					"//body/div[1]/div[2]/div[5]/div[1]/div[3]/div[1]/div[1]/footer[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[4]/ul[1]/li[2]/a[1]"))
					.click();		
			Thread.sleep(3000);
			//6th
			eyes.checkWindow("UAT SITE - Health page [4.0.89a]");
		
		}
		 finally {
				driver.quit();
				eyes.abortIfNotClosed();
			}
		
		
		
	}

}
