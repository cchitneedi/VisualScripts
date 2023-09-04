package visualRegression.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrooksHealthSystem {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Eyes eyes = new Eyes();
		// eyes.setApiKey("U7sd0gV48usZ4bzkwcPsAs104X10619109icnq7fzBdCqvABU110");

		try {
			// eyes.open(driver, "Brooks Health System-4.0.95.1a", "[4.0.95.1a]-BROOKS);
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.get("https://brookshldemo.stacksplatform.com/");
			// driver.get("https://uat-nvcvooy-emb2t3wmtizvi.us-4.platformsh.site/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Travel and Health')]")).click();
			// eyes.checkWindow("MASTER SITE HOME PAGE 4.0.95.1");
			Thread.sleep(1000);
			WebElement linktxt = driver.findElement(By.xpath("//a[contains(text(),'Travel and Health')]"));
			linktxt.click();
			Thread.sleep(2000);
			driver.findElement(By
					.xpath("//body/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/main[1]/div[1]/div[2]/button[1]/span[1]"))
					.click();
			// eyes.checkWindow("MASTER Travel PAGE 4.0.95.1");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@linkkey='11857']")).click();
			Thread.sleep(2000);
			driver.findElement(By
					.xpath("//body/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/main[1]/div[1]/div[2]/button[1]/span[1]"))
					.click();
			// eyes.checkWindow("MASTER SITE Influenza page 4.0.95.1");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='edit-search-form-eit-search-bar-container-query']"))
					.sendKeys("Medicine");
			driver.findElement(By.xpath("//input[@id='edit-search-form-eit-search-bar-container-actions-submit']"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By
					.xpath("//body/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/main[1]/div[1]/div[2]/button[1]/span[1]"))
					.click();
			// eyes.checkWindow("MASTER SITE Medicine Search result 4.0.95.1");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
			Thread.sleep(2000);
			// eyes.checkWindow("MASTER SITE Medicine result grid view 4.0.95.1");
			driver.findElement(By.xpath("(//a[@data-drupal-link-query='{\"id\":\"EP 157017\"}'])[3]")).click();
			Thread.sleep(1000);
			driver.findElement(By
					.xpath("//body/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/main[1]/div[1]/div[2]/button[1]/span[1]"))
					.click();
			// eyes.checkWindow("MASTER SITE Health & Myth Page 4.0.95.1");
		} finally {
			// driver.quit();
			// eyes.abortIfNotClosed();
		}
	}

}
