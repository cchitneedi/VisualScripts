package visualRegression.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlueCrossBlueShield {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Eyes eyes = new Eyes();
		eyes.setApiKey("UFnibMBf5106107SunPp98oA3nC7WYox3qiX68oZQsVMdDdc110");
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		try {
			eyes.open(driver, "BLUECROSS BLUESHIELD-4.0.95.1a", "BLUECROSS-4.0.95.1a");
		//driver.get("https://bcbsaldemo.stacksplatform.com");
		driver.get("https://uat-nvcvooy-leb6fi3s4aiyg.us-3.platformsh.site/");
		eyes.checkWindow("UAT 4.0.95.1a PAGE-1");
		WebElement bodyPart = driver.findElement(By.id("bodyPartSetter"));
		Select bodyPartddl = new Select(bodyPart);
		bodyPartddl.selectByValue("74");
		Thread.sleep(1000);
		eyes.checkWindow("UAT 4.0.95.1a PAGE-2");
		driver.findElement(By.xpath("//a[contains(text(),'Stress Management Collection')]")).click();
		Thread.sleep(1000);
		eyes.checkWindow("UAT 4.0.95.1a PAGE-3");
		driver.findElement(By.xpath("//input[@name='search_form[eit][search_bar_container][query]']"))
				.sendKeys("Influenza");
		Thread.sleep(1000);
		eyes.checkWindow("UAT 4.0.95.1a PAGE-4");
		
		WebElement clickfunction;
		clickfunction = driver.findElement(By.xpath("//input[@id='edit-search-form-eit-search-bar-container-actions-submit']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", clickfunction);
		
		
		Thread.sleep(5000);
		eyes.checkWindow("UAT 4.0.95.1a PAGE-5");
		driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
		Thread.sleep(3000);
		eyes.checkWindow("UAT 4.0.95.1a PAGE-6");
		driver.findElement(By.xpath("//strong[contains(text(),'DynaMed')]")).click();
		
		driver.findElement(By.xpath("//input[@id='edit-search-form-medsapi-search-bar-container-query']")).clear();
		
		driver.findElement(By.xpath("//input[@id='edit-search-form-medsapi-search-bar-container-query']"))
				.sendKeys("COVID-19");
		Thread.sleep(2000);
		
		WebElement clickDynamed;
		clickDynamed = driver.findElement(By.xpath("//input[@id='edit-search-form-eit-search-bar-container-actions-submit']"));
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click();", clickDynamed);
		
		Thread.sleep(3000);
		eyes.checkWindow("UAT 4.0.95.1a PAGE-7");
		driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
		eyes.checkWindow("UAT 4.0.95.1a PAGE-8");
		}
		 finally {
				driver.quit();
				eyes.abortIfNotClosed();
			}

	}

}
