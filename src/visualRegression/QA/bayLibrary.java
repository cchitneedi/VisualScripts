package visualRegression.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

public class bayLibrary {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// cchitneedi@nes.co.in
		Eyes eyes = new Eyes();
		eyes.setApiKey("U7sd0gV48usZ4bzkwcPsAs104X10619109icnq7fzBdCqvABU110");
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		try {
			eyes.open(driver, "bayLibrarydemo & baylibdev","baylibrary");
//			driver.get("https://baylibrarydemo.stacksplatform.com/");
//			driver.manage().window().maximize();
//			Thread.sleep(2000);
//			eyes.checkWindow("baylibrarydemo Login Page");
//			driver.findElement(By.xpath("//input[@aria-describedby='edit-name--description']")).sendKeys("stacks_test_patron");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='edit-pass']")).sendKeys("xrf_yzb.FVF1zyd3aru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//input[@value='Log in']")).click();
//			Thread.sleep(2000);
//			eyes.checkWindow("baylibrarydemo Home Page");
//			driver.findElement(By.xpath("//a[@aria-label='Market Reports']")).click();
//			Thread.sleep(3000);
//			eyes.checkWindow("baylibrarydemo Market Reports Page");
//			driver.navigate().back();
//			driver.findElement(By.xpath("//a[@aria-label='Reference Works']")).click();
//			Thread.sleep(3000);
//			eyes.checkWindow("baylibrarydemo Reference Works Page");
//			driver.navigate().back();
//			driver.findElement(By.xpath("//a[@aria-label='Databases & Solutions']")).click();
//			Thread.sleep(3000);
//			eyes.checkWindow("baylibrarydemo Database Page");
		
			driver.get("https://gabrielbaylibdev.stacksplatform.com");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			eyes.checkWindow("gabrielbaylibdev Login Page");
			driver.findElement(By.xpath("//input[@aria-describedby='edit-name--description']")).sendKeys("stacks_test_patron");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='edit-pass']")).sendKeys("xrf_yzb.FVF1zyd3aru");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			Thread.sleep(2000);
			eyes.checkWindow("gabrielbaylibdev Home Page");
			driver.get("https://gabrielbaylibdev.stacksplatform.com/market-reports");
			Thread.sleep(3000);
			eyes.checkWindow("gabrielbaylibdev Market Reports Page");
			driver.navigate().back();
			driver.get("https://gabrielbaylibdev.stacksplatform.com/reference-works?page=0");
			Thread.sleep(3000);
			eyes.checkWindow("gabrielbaylibdev Reference Works Page");
			driver.navigate().back();
			driver.get("https://gabrielbaylibdev.stacksplatform.com/databases");
			Thread.sleep(3000);
			eyes.checkWindow("gabrielbaylibdev databases Page");
		}
		finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}
		
		
		
	}

}
