package visualRegression.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UTHEALTH {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//chrantrent@gmail.com
		Eyes eyes = new Eyes();
		eyes.setApiKey("LZLxPWPBvOSNYFXKIUS8o7cKrgRhQwjWZnMvd104jAtyI110");
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);

		try {

			eyes.open(driver, "UT HEALTH SAN ANTANIO - [4.0.93d]", "UT HEALTH-[4.0.93d]");

			//driver.get("https://uthealthsahldemo.stacksplatform.com/");
			driver.get("https://uat-nvcvooy-sosyb5dsljk4s.us-4.platformsh.site/");

			eyes.checkWindow("UAT HOME PAGE Page 4.0.93d");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Stress Management Collection')]")).click();

			eyes.checkWindow("UAT Stress Management Collection 4.0.93d");

			driver.findElement(By.xpath("//input[@id='edit-search-form-eit-search-bar-container-query']"))
					.sendKeys("Medicine");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='edit-search-form-eit-search-bar-container-actions-submit']"))
					.click();
			Thread.sleep(3000);

			eyes.checkWindow("UAT MEDICINE PAGE 4.0.93d");

			driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
			Thread.sleep(3000);

			eyes.checkWindow("UAT GRID VIEW Page 4.0.93d");

			WebElement lastPage = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			lastPage.click();
			Thread.sleep(2000);

			eyes.checkWindow("UAT LAST PAGE 4.0.93d");

			driver.findElement(By.xpath("//header/div[@id='main-navigation']/nav[1]/ul[1]/li[2]/a[1]")).click();
			Thread.sleep(3000);

			eyes.checkWindow("UAT QUICK REFERENCE 4.0.93d");

			driver.findElement(By.xpath("//body/div[1]/div[2]/div[5]/div[1]/div[3]/div[1]/div[1]/footer[1]/div[1]/div[1]/nav[1]/ul[1]/li[4]/ul[1]/li[2]/a[1]")).click();
			Thread.sleep(2000);

			eyes.checkWindow("UAT HEALTH PAGE 4.0.93d");

		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}

	}

}
