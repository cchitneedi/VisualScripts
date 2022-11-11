import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.applitools.eyes.selenium.Eyes;

public class topicArticles_VR {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cchitneedi\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Eyes eyes = new Eyes();
		eyes.setApiKey("LZLxPWPBvOSNYFXKIUS8o7cKrgRhQwjWZnMvd104jAtyI110");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		try {
			eyes.open(driver, "Post UAT Check Pathways Site - Group wise", "Sustainability Group");
			driver.get("https://www.pathways2research.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#edit-name")).sendKeys("NES_Patron");
			driver.findElement(By.cssSelector("#edit-pass")).sendKeys("exm9fek5tfu-WMB@hwz");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#edit-submit")).click();
			Thread.sleep(5000);
			// 1st checkpoint
			eyes.checkWindow("EBSCO Pathways Homepage validation");
			driver.findElement(By.xpath("//a[contains(text(),'Business and Economics')]")).click();
			Thread.sleep(5000);
			// 2nd checkpoint
			eyes.checkWindow("Business and Economics Group home Page");
			driver.findElement(By.xpath("//a[contains(text(),'Corporate Social Responsibility')]")).click();
			// 3rd checkpoint
			eyes.checkWindow("Corporate Social Responsibility topic");
			driver.findElement(By.xpath("//body/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/details[1]/summary[1]"))
			.click();
			// 4th checkpoint
			eyes.checkWindow("Bussiness - Abstract check");
			
			driver.findElement(By.xpath("//span[contains(text(),'Corporate Social Responsibility as Insurance: Protecting a Firm’s Relational Assets')]"))
					.click();
			Thread.sleep(5000);
			eyes.setForceFullPageScreenshot(true);
			eyes.setHideScrollbars(true);
			// 5th checkpoint
			eyes.checkWindow("Full article body in Bussiness group");
			driver.navigate().back();
			driver.navigate().back();
			driver.navigate().back();
			driver.findElement(By.xpath("//a[contains(text(),'Education')]")).click();
			Thread.sleep(5000);
			// 6th checkpoint
			eyes.checkWindow("Education Group home Page");
			driver.findElement(By.xpath("//a[contains(text(),'Educational Psychology, Counseling, and Human Development')]")).click();
			Thread.sleep(1000);
			//7th checkpoint
			eyes.checkWindow("Educational Psychology, Counseling, and Human Development group");
			driver.findElement(By.xpath("//body/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/main[1]/div[1]/div[2]/div[1]/div[3]/details[1]/summary[1]")).click();
			// 8th checkpoint
			eyes.checkWindow("Educational - Abstract");
			driver.findElement(By.xpath("//span[contains(text(),'Using Cognitive Science to Improve Pedagogical Practice')]"))
			.click();
			Thread.sleep(5000);
			eyes.setForceFullPageScreenshot(true);
			eyes.setHideScrollbars(true);
			// 9th checkpoint
			eyes.checkWindow("Full article body in Education group");
			driver.navigate().back();
			driver.navigate().back();
			driver.navigate().back();
			driver.findElement(By.xpath("//a[contains(text(),'Sustainability')]")).click();
			Thread.sleep(5000);
			// 10th checkpoint
			eyes.checkWindow("Sustainability Group home Page");
			driver.findElement(By.xpath("//a[contains(text(),'Business')]")).click();
			Thread.sleep(3000);
			// 11th checkpoint
			eyes.checkWindow("Corporate Social Responsibility topic");
			driver.findElement(By.xpath("//body/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/details[1]/summary[1]")).click();
			//12th checkpoint
			eyes.checkWindow("Biomimicry - Abstract");
			driver.findElement(By.xpath("//span[contains(text(),'Biomimicry: Innovating for Sustainability')]"))
			.click();
			Thread.sleep(5000);
			eyes.setForceFullPageScreenshot(true);
			eyes.setHideScrollbars(true);
			// 13th checkpoint
			eyes.checkWindow("Full article body in Sustainability group");

			
			eyes.close();
		} finally {
			driver.quit();

			eyes.abortIfNotClosed();
		}

	}

}
