package visualRegression.QA;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LouisvillePublicLibrary {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		Eyes eyes = new Eyes();
		//chrantrent@gmail.com
		eyes.setApiKey("LZLxPWPBvOSNYFXKIUS8o7cKrgRhQwjWZnMvd104jAtyI110"); 
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		try {
			eyes.open(driver, "Loiusvillie Library - [4.0.1.109.1]", "Loiusvillie-[4.0.1.109.1]");
			//driver.get("https://www.lfpl.org/");
			driver.get("https://uat-nvcvooy-alvj26exuqbh6.us-4.platformsh.site/");

			// Try Something New Block screenshots
			driver.findElement(By.xpath("//img[@alt='MyLibraryU']")).click();
			Thread.sleep(4000);
			eyes.checkWindow("-UAT- Louis MyLibraryU 4.0.1.109.1");
			driver.navigate().back();
			driver.findElement(By.xpath("//img[@alt='COLLIDER Artist-in-Residence']")).click();
			Thread.sleep(4000);
			eyes.checkWindow("-UAT- Louis COLLIDER 4.0.1.109.1");
			driver.navigate().back();
			driver.findElement(By.xpath("//img[@alt='Kitkeeper']")).click();
			Thread.sleep(4000);
			eyes.checkWindow("-UAT- Louis KitKeeper 4.0.1.109.1");
			driver.navigate().back();
			driver.findElement(By.xpath("//img[@alt='Online Learning']")).click();
			Thread.sleep(4000);
			eyes.checkWindow("-UAT- Louis Online Learning 4.0.1.109.1");
			driver.navigate().back();
			Thread.sleep(4000);
			driver.findElement(By.linkText("Bookmobile")).click();
			Thread.sleep(4000);
			eyes.checkWindow("-UAT- Bookmobile link text 4.0.1.109.1");
			driver.navigate().back();
			//Click on Branches at Header section
			driver.findElement(By.xpath("//a[@aria-label='branches']")).click();
			Thread.sleep(5000);
			eyes.checkWindow("-UAT- Branches Page 4.0.1.109.1");
			driver.navigate().back();
			//Click on Get Involved
			driver.findElement(By.xpath("//a[@aria-label='get-involved']")).click();
			Thread.sleep(9000);
			eyes.checkWindow("-UAT- Louis GET INVOLVED Page 4.0.1.109.1");
			driver.navigate().back();
			Thread.sleep(5000);
			//Click on Get a Library Card
			driver.findElement(By.xpath("//a[@aria-label='get-a-library-card']")).click();
			Thread.sleep(9000);
			eyes.checkWindow("-UAT- Louis Library Card Page 4.0.1.109.1");
			//Select Search the Website results
			WebElement search = driver.findElement(By.xpath("//select[@id='edit-search-form-stacks-external-catalogs-custompf-search-bar-container-search-type']"));
			Select catalogDDL = new Select(search);
			catalogDDL.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='edit-search-form-sds-search-bar-container-query']")).sendKeys("Medicine");
			driver.findElement(By.xpath("//input[@id='edit-search-form-sds-search-bar-container-actions-submit']")).click();
			Thread.sleep(2000);
			eyes.checkWindow("-UAT- Search Website List View 4.0.1.109.1");
			driver.findElement(By.xpath("//button[@aria-label='grid view']")).click();
			eyes.checkWindow("-UAT- Search Website Grid View 4.0.1.109.1");
			Thread.sleep(2000);
			//Click on Get A Library Card link
			driver.findElement(By.xpath("(//a[contains(text(),'Get a Library Card')])[2]")).click();
			Thread.sleep(2000);
			eyes.checkWindow("-UAT- Get a Library Card Page 4.0.1.109.1");

		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}
	}

}
