package visualRegression.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

public class Pathways2ResearchPages {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			Eyes eyes = new Eyes();
			eyes.setApiKey("wVE71yhGHadxX58P9ieyLRVJlpAXwCJAh100iJHBm6P3M110");
		try {
			eyes.open(driver, "PATHWAYS2RESEARCH-DESKTOP-VIEW", "PATHWAYS VERSION-[4.0.84]");
			//driver.get("https://www.pathways2research.com/");
			driver.get("https://pathways2research.com.uat-nvcvooy-j43mdydumhk5g.us-4.platformsh.site/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			Dimension currentDimension = driver.manage().window().getSize();
			int height = currentDimension.getHeight();
			int width = currentDimension.getWidth();
			System.out.println("Current width: "+width);
			System.out.println("Current height: "+ height);
			driver.findElement(By.cssSelector("#edit-name")).sendKeys("NES_Patron");
			driver.findElement(By.cssSelector("#edit-pass")).sendKeys("exm9fek5tfu-WMB@hwz");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#edit-submit")).click();
			Thread.sleep(3000);
			//1st
			eyes.checkWindow("UAT SITE HOME PAGE 4.0.84[DESKTOP]");
			driver.findElement(By.id("toggle-light-dark")).click();
			Thread.sleep(2000);
			//2nd
			eyes.checkWindow("UAT SITE HOME PAGE LIGHT MODE 4.0.84[DESKTOP]");
			driver.findElement(By.xpath("//a[contains(text(),'Business & Economics')]")).click();
			Thread.sleep(5000);
			//3rd
			eyes.checkWindow("UAT SITE [4.0.84][DESKTOP] Business Topic PAGE");
			driver.findElement(By.xpath("//span[contains(text(),'A Review of Software Tools Used in Research')]")).click();
			Thread.sleep(2000);
			//4th
			eyes.setForceFullPageScreenshot(true);
			eyes.setHideScrollbars(true);
			eyes.checkWindow("UAT SITE [4.0.84][DESKTOP] Business Article PAGE mode1");
			driver.findElement(By.id("toggle-light-dark")).click();
			Thread.sleep(2000);
			//5th
			eyes.setForceFullPageScreenshot(true);
			eyes.setHideScrollbars(true);
			eyes.checkWindow("UAT SITE [4.0.84][DESKTOP] Business Topic PAGE mode2");
			driver.findElement(By.xpath("(//a[contains(text(),'Pathways to Research')])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Education')]")).click();
			Thread.sleep(5000);
			//6th
			eyes.checkWindow("UAT SITE [4.0.84] [DESKTOP] Education Topic PAGE");
			driver.findElement(By.id("toggle-light-dark")).click();
			Thread.sleep(2000);
			//7th
			eyes.checkWindow("UAT SITE [4.0.84][DESKTOP] Education Topic PAGE mode2");
			driver.findElement(By.xpath("//span[contains(text(),'A Primer on Standards-Based Grading')]")).click();
			Thread.sleep(2000);
			//8th
			eyes.setForceFullPageScreenshot(true);
			eyes.setHideScrollbars(true);
			eyes.checkWindow("UAT SITE [4.0.84][DESKTOP] Education Article PAGE");
			driver.findElement(By.id("toggle-light-dark")).click();
			Thread.sleep(2000);
			//9th
			eyes.setForceFullPageScreenshot(true);
			eyes.setHideScrollbars(true);
			eyes.checkWindow("UAT SITE [4.0.84][DESKTOP] Education Article PAGE mode2");
			driver.findElement(By.xpath("(//a[contains(text(),'Pathways to Research')])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Sustainability')]")).click();
			Thread.sleep(5000);
			//10th
			eyes.checkWindow("UAT SITE [4.0.84][DESKTOP] Sustainability Topic PAGE");
			driver.findElement(By.id("toggle-light-dark")).click();
			Thread.sleep(2000);
			//11th
			eyes.checkWindow("UAT SITE [4.0.84][DESKTOP] Sustainability Topic PAGE mode2");
			driver.findElement(By.xpath("//span[contains(text(),'Acting Sustainably: Public and Private Environmental Behaviors')]")).click();
			Thread.sleep(2000);
			//12th
			eyes.setForceFullPageScreenshot(true);
			eyes.setHideScrollbars(true);
			eyes.checkWindow("UAT SITE [4.0.84][DESKTOP] Sustainability Article PAGE");
			driver.findElement(By.id("toggle-light-dark")).click();
			Thread.sleep(2000);
			//13th
			eyes.setForceFullPageScreenshot(true);
			eyes.setHideScrollbars(true);
			eyes.checkWindow("UAT SITE [4.0.84][DESKTOP] Sustainability Article PAGE mode2");
			
			
		}
		 finally {
				driver.quit();
		eyes.abortIfNotClosed();
			}
	}

}
