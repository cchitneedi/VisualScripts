import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.applitools.eyes.selenium.Eyes;

public class Pathways_4_0_72_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Eyes eyes = new Eyes();
		//eyes.setApiKey("79CYkxosb3KQJmYhkQhA4CLfGDeI9a62992l60V8LmyU110");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		try {
			//eyes.open(driver, "PATHWAYS-UAT-4.0.72.2", "Topic Groups, Articles");
			 //driver.get("https://pathways2research.com.uat-nvcvooy-j43mdydumhk5g.us-4.platformsh.site/");
			driver.get("https://www.pathways2research.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#edit-name")).sendKeys("NES_Patron");
			driver.findElement(By.cssSelector("#edit-pass")).sendKeys("exm9fek5tfu-WMB@hwz");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#edit-submit")).click();
			Thread.sleep(3000);
			//eyes.checkWindow("Home page in dark mode");
			driver.findElement(By.id("darkModeToggle")).click();
			Thread.sleep(3000);
			//eyes.checkWindow("Home Page in light mode");
			driver.findElement(By.xpath("//a[contains(text(),'Business and Economics')]")).click();
			//eyes.checkWindow("Bussiness and Economics group");
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"//body/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/details[1]/summary[1]"))
					.click();
			//eyes.checkWindow("Corporate Article");
			driver.findElement(By.xpath("//body/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/details[1]/summary[1]/h2[1]/a[1]"))
					.click();
			Thread.sleep(5000);
			//eyes.setForceFullPageScreenshot(true);
			//eyes.setHideScrollbars(true);
			//eyes.checkWindow("Full article body in Bussiness group");
			driver.navigate().back();
			driver.navigate().back();
			driver.findElement(By.xpath("//a[contains(text(),'Education')]")).click();
			Thread.sleep(5000);
			//eyes.checkWindow("Education Group home Page");
			driver.findElement(
					By.xpath("//a[contains(text(),'Educational Psychology, Counseling, and Human Development')]"))
					.click();
			Thread.sleep(2000);
			//eyes.checkWindow("Educational Psychology, Counseling, and Human Development group");
			driver.findElement(By.xpath(
					"//body/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/main[1]/div[1]/div[2]/div[1]/div[3]/details[1]/summary[1]"))
					.click();
			driver.findElement(
					By.xpath("//span[contains(text(),'Using Cognitive Science to Improve Pedagogical Practice')]"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.id("darkModeToggle")).click();
			Thread.sleep(2000);
			//eyes.setForceFullPageScreenshot(true);
			//eyes.setHideScrollbars(true);
			//eyes.checkWindow("Full article body in Education group");
			driver.navigate().back();
			driver.navigate().back();
			driver.navigate().back();
			driver.findElement(By.xpath("//a[contains(text(),'Sustainability')]")).click();
			Thread.sleep(5000);
			//eyes.checkWindow("Sustainability Group home Page");
			driver.findElement(By.xpath("//a[contains(text(),'Communication')]")).click();
			Thread.sleep(3000);
			//eyes.checkWindow("Communication topic");
			driver.findElement(By.xpath(
					"//body/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/details[1]/summary[1]"))
					.click();
			driver.findElement(
					By.xpath("//span[contains(text(),'Greenwashing: From Hollow Eco-Claim to Eventual Eco-Action')]"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.id("darkModeToggle")).click();
			//eyes.setForceFullPageScreenshot(true);
			//eyes.setHideScrollbars(true);
			//eyes.checkWindow("Full article with light mode");
			Thread.sleep(1000);
			driver.findElement(By.id("darkModeToggle")).click();
			Thread.sleep(1000);
			//eyes.setForceFullPageScreenshot(true);
			//eyes.setHideScrollbars(true);
			//eyes.checkWindow("Full article with dark mode");
			driver.navigate().back();

			//eyes.close();
		} finally {
			driver.quit();

			//eyes.abortIfNotClosed();
		}
	}

}
