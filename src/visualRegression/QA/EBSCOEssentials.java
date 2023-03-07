package visualRegression.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

public class EBSCOEssentials {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//cchitneedi@ebsco.com
		Eyes eyes = new Eyes();
		eyes.setApiKey("wVE71yhGHadxX58P9ieyLRVJlpAXwCJAh100iJHBm6P3M110");
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		
		try {
			
			eyes.open(driver, "EBSCO-ESSENTIALS","ESSENTIALS-4.0.89d");
			//driver.get("https://essentials.ebsco.com/");
			driver.get("https://opensandbox.stacksplatform.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).sendKeys("Drug Interactions");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-actions-submit']")).click();
			Thread.sleep(3000);
			//1st
			eyes.checkWindow("UAT-DI-4.0.89d");
			//Changing to dark mode
			driver.findElement(By.xpath("//button[@id='darkModeToggle']")).click();
			Thread.sleep(3000);
			//2nd
			eyes.checkWindow("UAT-DI-MODE2-4.0.89d");
			
			//click on [Refine Search] button
			driver.findElement(By.xpath("//a[contains(text(),'Refine Search')]")).click();
			Thread.sleep(3000);
			//3rd
			eyes.setForceFullPageScreenshot(true);
			eyes.setHideScrollbars(true);
			eyes.checkWindow("UAT-REFINE-4.0.89d");
			//changing to white mode
			driver.findElement(By.xpath("//button[@id='darkModeToggle']")).click();
			//4th
			eyes.setForceFullPageScreenshot(true);
			eyes.setHideScrollbars(true);
			eyes.checkWindow("UAT-REFINE-MODE2-4.0.89d");
			
			//click grid view
			driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
			Thread.sleep(3000);
			//5th
			eyes.setForceFullPageScreenshot(true);
			eyes.setHideScrollbars(true);
			eyes.checkWindow("UAT-GRIDVIEW-4.0.89d");
			
			//click on ebooks text box
			driver.findElement(By.xpath("//a[contains(text(),'eBooks')]")).click();
			Thread.sleep(3000);
			//6th
			eyes.setForceFullPageScreenshot(true);
			eyes.setHideScrollbars(true);
			eyes.checkWindow("UAT-eBooks-4.0.89d");
			
			//Changing to dark mode
			driver.findElement(By.xpath("//button[@id='darkModeToggle']")).click();
			Thread.sleep(2000);
			//7th
			eyes.setForceFullPageScreenshot(true);
			eyes.setHideScrollbars(true);
			eyes.checkWindow("UAT-REFINE-MODE2-4.0.89d");
			
			
		}
		finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}
	}

}
