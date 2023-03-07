package visualRegression.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

public class Carl_R_Darnall_Army_Medical_Center {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//cchitneedi@nes.co.in
		// Eyes eyes = new Eyes();
		// eyes.setApiKey("U7sd0gV48usZ4bzkwcPsAs104X10619109icnq7fzBdCqvABU110");
		driver.manage().timeouts().pageLoadTimeout(75, TimeUnit.SECONDS);
		try {
			// eyes.open(driver, "Carl R Darnall Army Medical Center", "Site ID -
			// ouofirtnmihi2");
			// Master URL
			// driver.get("https://darnallarmyhldemo.stacksplatform.com");
			// UAT URL
			driver.get("https://uat-nvcvooy-ynkthhejqpf2q.us-4.platformsh.site/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
		} finally {
			driver.quit();

			// eyes.abortIfNotClosed();
		}

	}

}
