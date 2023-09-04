package visualRegression.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

public class UVAHL {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Eyes eyes = new Eyes();
		// eyes.setApiKey("LZLxPWPBvOSNYFXKIUS8o7cKrgRhQwjWZnMvd104jAtyI110");
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);

		try {

			// eyes.open(driver, "UVAHL - [4.0.93d]", "UVA-[4.0.93d]");

			driver.get("https://uva.ebscomedical.com/");
			// driver.get("https://uat-nvcvooy-g3bf56dc3asxm.us-4.platformsh.site/");

			// eyes.checkWindow("MASTER HOME PAGE Page 4.0.93");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Stress Management Collection')]")).click();

			// eyes.checkWindow("MASTER Stress Management Collection 4.0.93");

			driver.findElement(By.xpath("//input[@id='edit-search-form-eit-search-bar-container-query']"))
					.sendKeys("Medicine");
			Thread.sleep(3000);

			WebElement clickfunction;
			clickfunction = driver
					.findElement(By.xpath("//div[@id='edit-search-form-eit-search-bar-container-actions']"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(4000);

			// eyes.checkWindow("MASTER MEDICINE PAGE 4.0.93");

			driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
			Thread.sleep(3000);

//			eyes.checkWindow("MASTER GRID VIEW Page 4.0.93");

			WebElement lastPage = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			lastPage.click();
			Thread.sleep(2000);

			// eyes.checkWindow("MASTER LAST PAGE 4.0.93");

			driver.findElement(By.xpath("//header/div[@id='main-navigation']/nav[1]/ul[1]/li[2]/a[1]")).click();
			Thread.sleep(3000);

			// eyes.checkWindow("MASTER QUICK REFERENCE 4.0.93");

			driver.findElement(By.xpath(
					"//body/div[1]/div[2]/div[5]/div[1]/div[3]/div[1]/div[1]/footer[1]/div[1]/div[1]/nav[1]/ul[1]/li[4]/ul[1]/li[2]/a[1]"))
					.click();
			Thread.sleep(2000);

			// eyes.checkWindow("MASTER HEALTH PAGE 4.0.93");

		} finally {
			// driver.quit();
			// eyes.abortIfNotClosed();
		}

	}

}
