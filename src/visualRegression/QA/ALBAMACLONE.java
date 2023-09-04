package visualRegression.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ALBAMACLONE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Eyes eyes = new Eyes();
		eyes.setApiKey("U7sd0gV48usZ4bzkwcPsAs104X10619109icnq7fzBdCqvABU110");
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		try {
			eyes.open(driver, "BCBS-ALBAMA-4.0.94b", "4.0.94b-ALBAMA");
		//driver.get("https://bcbsalaclone.stacksplatform.com");
		driver.get("https://uat-nvcvooy-tkkl5z4c753es.us-3.platformsh.site/");
		eyes.checkWindow("UAT 4.0.94b PAGE-1");
		WebElement bodyPart = driver.findElement(By.id("bodyPartSetter"));
		Select bodyPartddl = new Select(bodyPart);
		bodyPartddl.selectByValue("74");
		Thread.sleep(1000);
		eyes.checkWindow("UAT 4.0.94b PAGE-2");
		driver.findElement(By.xpath("//a[contains(text(),'Stress Management Collection')]")).click();
		Thread.sleep(1000);
		eyes.checkWindow("UAT 4.0.94b PAGE-3");
		driver.findElement(By.xpath("//input[@id='edit-search-form-consumer-health-search-bar-container-query']"))
				.sendKeys("Influenza");
		Thread.sleep(1000);
		eyes.checkWindow("UAT 4.0.94b PAGE-4");
		driver.findElement(
				By.xpath("//input[@id='edit-search-form-consumer-health-search-bar-container-actions-submit']"))
				.click();
		Thread.sleep(5000);
		eyes.checkWindow("UAT 4.0.94b PAGE-5");
		driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
		Thread.sleep(3000);
		eyes.checkWindow("UAT 4.0.94b PAGE-6");
		driver.findElement(By.xpath("//strong[contains(text(),'DynaMed')]")).click();
		
		driver.findElement(By.xpath("//input[@id='edit-search-form-medsapi-search-bar-container-query']")).clear();
		
		driver.findElement(By.xpath("//input[@id='edit-search-form-medsapi-search-bar-container-query']"))
				.sendKeys("COVID-19");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='edit-search-form-medsapi-search-bar-container-actions-submit']")).click();
		Thread.sleep(3000);
		eyes.checkWindow("UAT 4.0.94b PAGE-7");
		driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
		eyes.checkWindow("UAT 4.0.94b PAGE-8");
		}
		 finally {
				driver.quit();
				eyes.abortIfNotClosed();
			}

	}

}
