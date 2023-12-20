package visualRegression.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pathways2ResearchPages {

	public static void main(String[] args) throws InterruptedException {

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().pageLoadTimeout(140, TimeUnit.SECONDS);
		 Eyes eyes = new Eyes();
		eyes.setApiKey("wVE71yhGHadxX58P9ieyLRVJlpAXwCJAh100iJHBm6P3M110");
		try {
			eyes.open(driver, "PATHWAYS2RESEARCH [DESKTOP VIEW] 4.0.103", "PATHWAYS [4.0.103]");
			//driver.get("https://www.pathways2research.com/");
			driver.get("https://pathways2research.com.uat-nvcvooy-j43mdydumhk5g.us-4.platformsh.site/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			Dimension currentDimension = driver.manage().window().getSize();
			int height = currentDimension.getHeight();
			int width = currentDimension.getWidth();
			System.out.println("Current width: " + width);
			System.out.println("Current height: " + height);
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#edit-name")).sendKeys("NES_Patron");
			driver.findElement(By.cssSelector("#edit-pass")).sendKeys("exm9fek5tfu-WMB@hwz");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#edit-submit")).click();
			Thread.sleep(3000);
			// 1st
			eyes.checkWindow("-UAT- 4.0.103b Page-1");
			driver.findElement(By.id("toggle-light-dark")).click();
			Thread.sleep(2000);
			// 2nd
			eyes.checkWindow("-UAT- 4.0.103b.94 Page-2");
			driver.findElement(By.xpath("//a[contains(text(),'Business & Economics')]")).click();
			Thread.sleep(5000);
			// 3rd
			eyes.checkWindow("-UAT- 4.0.103b Page-3");
			driver.findElement(By.xpath("//span[contains(text(),'A Review of Software Tools Used in Research')]"))
					.click();
			Thread.sleep(2000);
			// 4th
			eyes.checkWindow("-UAT- 4.0.103b Page-4");
			driver.findElement(By.id("toggle-light-dark")).click();
			Thread.sleep(2000);
			// 5th
			eyes.checkWindow("-UAT- 4.0.103b Page-5");

//			WebElement clickfunction;
//			clickfunction = driver.findElement(By.xpath("(//img[@class='default-logo'])[1]"));
//			JavascriptExecutor executor = (JavascriptExecutor) driver;
//			executor.executeScript("arguments[0].click();", clickfunction);
//
//			// driver.findElement(By.xpath("(//img[@class='default-logo'])[1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[contains(text(),'Education')]")).click();
//			Thread.sleep(5000);
//			// 6th
//			eyes.checkWindow("-UAT- 4.0.103b Page-6");
//			driver.findElement(By.id("toggle-light-dark")).click();
//			Thread.sleep(2000);
//			// 7th
//			eyes.checkWindow("-UAT- 4.0.103b Page-7");
//			driver.findElement(By.xpath("//span[contains(text(),'A Primer on Standards-Based Grading')]")).click();
//			Thread.sleep(2000);
//			// 8th
//			eyes.checkWindow("-UAT- 4.0.103b Page-8");
//			driver.findElement(By.id("toggle-light-dark")).click();
//			Thread.sleep(2000);
//			// 9th
//			eyes.checkWindow("-UAT-1 4.0.103b Page-9");
//
//			WebElement clickfunctionEducation;
//			clickfunctionEducation = driver.findElement(By.xpath("(//img[@class='default-logo'])[1]"));
//			JavascriptExecutor executorEDU = (JavascriptExecutor) driver;
//			executorEDU.executeScript("arguments[0].click();", clickfunctionEducation);
//
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[contains(text(),'Sustainability')]")).click();
//			Thread.sleep(5000);
//			// 10th
//			eyes.checkWindow("-UAT- 4.0.103b Page-10");
//			driver.findElement(By.id("toggle-light-dark")).click();
//			Thread.sleep(2000);
//			// 11th
//			eyes.checkWindow("-UAT- 4.0.103b Page-11");
//			driver.findElement(By
//					.xpath("//span[contains(text(),'Acting Sustainably: Public and Private Environmental Behaviors')]"))
//					.click();
//			Thread.sleep(2000);
//			// 12th
//			eyes.checkWindow("-UAT- 4.0.103b Page-12");
//			driver.findElement(By.id("toggle-light-dark")).click();
//			// 13th
//			eyes.checkWindow("-UAT- 4.0.103b Page-13");

		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}
	}

}
