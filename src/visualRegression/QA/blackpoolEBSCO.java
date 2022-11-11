package visualRegression.QA;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.applitools.eyes.selenium.Eyes;

public class blackpoolEBSCO {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Chitneedi.charan@gmail.com
		Eyes eyes = new Eyes();
		eyes.setApiKey("79CYkxosb3KQJmYhkQhA4CLfGDeI9a62992l60V8LmyU110");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		try {
			eyes.open(driver, "BLACKPOOL TEACHING HOSPITALS NHS FOUNDATION TRUST","4.0.82b-BLACKPOOL");
			// Master URL
			//driver.get("https://ns023477.ebscomedical.com");
			// UAT URL
			driver.get("https://uat-nvcvooy-eyhhcvjfl3j7o.uk-1.platformsh.site/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			// 1st checkpoint
			eyes.checkWindow("UAT Home Page 4.0.82b");
			WebElement ele;
			ele = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			ele.click();
			Thread.sleep(3000);
			// 2nd checkpoint
			eyes.checkWindow("UAT Last Page 4.0.82b");
			driver.findElement(
					By.xpath("//header/div[@id='stacks-search-bar-block']/div[1]/form[1]/div[1]/ul[1]/li[7]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='edit-search-form-pubmed-search-bar-container-query']"))
					.sendKeys("Equatorial Guinea.");
			Thread.sleep(2000);
			WebElement clickfunction = driver.findElement(By.xpath("//input[@name='pubmed-submit']"));
			clickfunction.click();
			Thread.sleep(3000);
			// 3rd
			eyes.checkWindow("UAT Pubmed result Page 4.0.82b");
			driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
			Thread.sleep(2000);
			// 4th
			eyes.checkWindow("UAT Pubmed result grid view Page 4.0.82b");
			WebElement Subele;
			Subele = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			Subele.click();
			Thread.sleep(3000);
			// 5th
			eyes.checkWindow("UAT Pubmed result Last Page 4.0.82b");
			driver.findElement(By.xpath("//a[contains(text(),'Subconjunctival loiasis.')]")).click();
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			Thread.sleep(3000);
			// 6th
			eyes.setForceFullPageScreenshot(true);
			eyes.setHideScrollbars(true);
			eyes.checkWindow("UAT Subconjunctival Page 4.0.82b");
			driver.switchTo().window(tabs2.get(0));
		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}

	}

}
