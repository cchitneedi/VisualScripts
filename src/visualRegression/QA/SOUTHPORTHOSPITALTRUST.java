package visualRegression.QA;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

public class SOUTHPORTHOSPITALTRUST {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//charantrent
		Eyes eyes = new Eyes();
		eyes.setApiKey("LZLxPWPBvOSNYFXKIUS8o7cKrgRhQwjWZnMvd104jAtyI110");
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		try {
			eyes.open(driver, "SOUTHPORT-[4.0.85a]", "mdwpeq5ohnsks-[4.0.85a]");
			//Master URL
			//driver.get("https://ns011037.ebscomedical.com/");
			//UAT URL
			driver.get("https://uat-nvcvooy-mdwpeq5ohnsks.uk-1.platformsh.site/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			// 1st checkpoint
			eyes.checkWindow("UAT Home Page 4.0.85a");
			WebElement ele;
			ele = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			ele.click();
			Thread.sleep(3000);
			// 2nd checkpoint
			eyes.checkWindow("UAT Last Page 4.0.85a");
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).sendKeys("Yellow fever – Gabon");
			Thread.sleep(1000);
			WebElement clickfunction;
			clickfunction = driver.findElement(By.cssSelector(".submit.expanded.button.js-form-submit.form-submit.focus-input"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("UAT Search Yellow Fever Result Page 4.0.85a");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2000)");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(text(),'See 19 more')]")).click();
			Thread.sleep(5000);
			// 4th checkpoint
			eyes.checkWindow("UAT Pubmed Results page 4.0.85a");
			driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
			Thread.sleep(2000);
			//5th
			eyes.checkWindow("UAT Pubmed Results Grid View 4.0.85a");
			driver.findElement(By.xpath("//a[contains(text(),'Equatorial Guinea.')]")).click();
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			Thread.sleep(3000);
			eyes.checkWindow("UAT window handler page for Equatorial article 4.0.85a");
			driver.switchTo().window(tabs2.get(0));
			WebElement eleYellowLast;
			eleYellowLast = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			executor.executeScript("arguments[0].click();", eleYellowLast);
			Thread.sleep(4000);
			// 6th checkpoint
			eyes.checkWindow("UAT Pubmed Results Last page 4.0.85a");
		}
		finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}
	}

}
