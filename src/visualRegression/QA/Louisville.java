package visualRegression.QA;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Louisville {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		Eyes eyes = new Eyes();
		// Srihari
		eyes.setApiKey("UFnibMBf5106107SunPp98oA3nC7WYox3qiX68oZQsVMdDdc110");

		driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);

		try {
			eyes.open(driver, "Loiusvillie Library - [4.0.106c]", "Loiusvillie-[4.0.106c]");
			// driver.get("https://www.lfpl.org/");
			driver.get("https://uat-nvcvooy-alvj26exuqbh6.us-4.platformsh.site/");

			// Try Something New Block screenshots
			driver.findElement(By.xpath("//img[@alt='MyLibraryU']")).click();
			Thread.sleep(4000);
			eyes.checkWindow("-MASTER- Louis MyLibraryU 4.0.106");
			driver.navigate().back();

			driver.findElement(By.xpath("//img[@title='COLLIDER Artist-in-Residence']")).click();
			Thread.sleep(4000);
			eyes.checkWindow("-MASTER- Louis COLLIDER 4.0.106");
			driver.navigate().back();

			driver.findElement(By.xpath("//img[@title='Kitkeeper']")).click();
			Thread.sleep(4000);
			eyes.checkWindow("-MASTER- Louis KitKeeper 4.0.106");
			driver.navigate().back();

			driver.findElement(By.xpath("//img[@title='Online Learning']")).click();
			Thread.sleep(4000);
			eyes.checkWindow("-MASTER- Louis Online Learning 4.0.106");
			driver.navigate().back();

			Thread.sleep(4000);
			
			// For Production site only
			driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-custompf-search-bar-container-query']"))
					.click();

			eyes.checkWindow("-MASTER- Louis Page1 4.0.106");

			driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-custompf-search-bar-container-query']"))
					.sendKeys("Adventure Books");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='stacks_external_catalogs_custom:pf-submit']")).click();
			Thread.sleep(5000);

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			eyes.checkWindow("-MASTER- Louis Page2 4.0.106");

			Thread.sleep(5000);

			driver.switchTo().window(tabs2.get(0));
			Thread.sleep(5000);

			driver.findElement(By.xpath("//a[@aria-label='catalog']")).click();
			Thread.sleep(9000);

			eyes.checkWindow("-MASTER- Louis CATALOG Page 4.0.106");

			// eyes.checkWindow("-MASTER- Louis Page3 4.0.106f");
			Thread.sleep(5000);
			driver.switchTo().window(tabs2.get(0));

			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@aria-label='my-account']")).click();
			Thread.sleep(9000);
			driver.switchTo().window(tabs2.get(1));
			eyes.checkWindow("-MASTER- Louis My Account Page 4.0.106");

			Thread.sleep(5000);

			driver.switchTo().window(tabs2.get(0));

			driver.findElement(By.xpath("//a[@aria-label='branches']")).click();
			Thread.sleep(9000);

			eyes.checkWindow("-MASTER- Louis Branch Page 4.0.106");

			driver.navigate().back();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@aria-label='get-involved']")).click();
			Thread.sleep(9000);

			eyes.checkWindow("-MASTER- Louis GET INVOLVED Page 4.0.106");

			driver.navigate().back();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@aria-label='get-a-library-card']")).click();
			Thread.sleep(9000);
			eyes.checkWindow("-MASTER- Louis Library Card Page 4.0.106");

		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}
	}

}
