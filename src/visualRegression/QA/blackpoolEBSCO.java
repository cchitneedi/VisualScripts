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
		// vsriharibabu@gmail.com
		Eyes eyes = new Eyes();
		eyes.setApiKey("UFnibMBf5106107SunPp98oA3nC7WYox3qiX68oZQsVMdDdc110");
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		try {
			eyes.open(driver, "BLACKPOOL TEACHING HOSPITALS 4.0.85f","4.0.85f-BLACKPOOL");
			// Master URL
			//driver.get("https://ns023477.ebscomedical.com");
			// UAT URL
			driver.get("https://uat-nvcvooy-eyhhcvjfl3j7o.uk-1.platformsh.site/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			// 1st checkpoint
			eyes.checkWindow("UAT Home Page 4.0.85f");
			WebElement ele;
			ele = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			ele.click();
			Thread.sleep(3000);
			// 2nd checkpoint
			eyes.checkWindow("UAT Last Page 4.0.85f");
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
			eyes.checkWindow("UAT Search Yellow Fever Result Page 4.0.85f");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2000)");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(text(),'See 19 more')]")).click();
			Thread.sleep(6000);
			// 4th checkpoint
			eyes.checkWindow("UAT Pubmed Results page 4.0.85f");
			driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
			Thread.sleep(2000);
			// 5th
			eyes.checkWindow("UAT Grid View Results Page 4.0.85f");

			driver.findElement(By.xpath("//a[contains(text(),'Equatorial Guinea.')]")).click();
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			Thread.sleep(3000);
			// 6th checkpoint
			eyes.checkWindow("UAT Equatorial Results Page 4.0.85f");
			driver.switchTo().window(tabs2.get(0));
			Thread.sleep(3000);
			WebElement eleYellowLast;
			eleYellowLast = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			executor.executeScript("arguments[0].click();", eleYellowLast);
			Thread.sleep(4000);
			// 7th
			eyes.checkWindow("UAT Last Results Page 4.0.85f");
		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}

	}

}
