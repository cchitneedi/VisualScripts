package visualRegression.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PathwaysTabletView {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		//cchitneedi@ebsco.com
		Eyes eyes = new Eyes();
		eyes.setApiKey("79CYkxosb3KQJmYhkQhA4CLfGDeI9a62992l60V8LmyU110");
		try {
			eyes.open(driver, "TABLET VIEW -[4.0.93.2a]", "PATHWAYS 640 X 1023 -[4.0.93.2a]");
			driver.get("https://www.pathways2research.com/");
			//driver.get("https://pathways2research.com.uat-nvcvooy-j43mdydumhk5g.us-4.platformsh.site/");
			// Default size
			Dimension currentDimension = driver.manage().window().getSize();
			int height = currentDimension.getHeight();
			int width = currentDimension.getWidth();
			System.out.println("Current width: "+width);
			System.out.println("Current height: "+ height);
			// Set new size
			Dimension tabletView = new Dimension(640, 1023);
			driver.manage().window().setSize(tabletView);
			Thread.sleep(10000);
			// Getting 
			Dimension resizeBrowser = driver.manage().window().getSize();
			int tabletWidth = tabletView.getWidth();
			int tabletHeight = tabletView.getHeight();
			System.out.println("Current Tablet View width is : "+tabletWidth);
			System.out.println("Current Tablet View height is: "+ tabletHeight);
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#edit-name")).sendKeys("NES_Patron");
			driver.findElement(By.cssSelector("#edit-pass")).sendKeys("exm9fek5tfu-WMB@hwz");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#edit-submit")).click();
			Thread.sleep(3000);
			//1st
			eyes.checkWindow("UAT SITE HOME PAGE 4.0.93.2a");
			driver.findElement(By.id("toggle-light-dark")).click();
			Thread.sleep(2000);
			//2nd
			eyes.checkWindow("UAT SITE HOME PAGE 4.0.93.2a");
			driver.findElement(By.xpath("//a[contains(text(),'Business & Economics')]")).click();
			Thread.sleep(5000);
			//3rd
			eyes.checkWindow("UAT SITE Sustainability Tablet View 4.0.93.2a");
			driver.findElement(By.xpath("//span[contains(text(),'A Review of Software Tools Used in Research')]")).click();
			Thread.sleep(2000);
			//4th
			eyes.checkWindow("UAT SITE B&E Article Tablet View mode 4.0.93.2a");
			driver.findElement(By.id("toggle-light-dark")).click();
			Thread.sleep(2000);
			//5th
			eyes.checkWindow("UAT SITE B&E Article Tablet View mode2 4.0.93.2a");
			driver.findElement(By.xpath("(//img[@class='default-logo'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Education')]")).click();
			Thread.sleep(5000);
			//6th
			eyes.checkWindow("UAT SITE Education Tablet View mode 4.0.93.2a");
			driver.findElement(By.id("toggle-light-dark")).click();
			Thread.sleep(2000);
			//7th
			eyes.checkWindow("UAT SITE Education Tablet View mode2 4.0.93.2a");
			driver.findElement(By.xpath("//span[contains(text(),'A Primer on Standards-Based Grading')]")).click();
			Thread.sleep(2000);
			//8th
			eyes.checkWindow("UAT SITE Education Article Tablet View mode 4.0.93.2a");
			driver.findElement(By.id("toggle-light-dark")).click();
			Thread.sleep(2000);
			//9th
			eyes.checkWindow("UAT SITE Education Article Tablet View mode2 4.0.93.2a");
			driver.findElement(By.xpath("(//img[@class='default-logo'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Sustainability')]")).click();
			Thread.sleep(5000);
			//10th
			eyes.checkWindow("UAT SITE Sustainability Tablet View mode 4.0.93.2a");
			driver.findElement(By.id("toggle-light-dark")).click();
			Thread.sleep(2000);
			//11th
			eyes.checkWindow("UAT SITE Sustainability Tablet View mode2 4.0.93.2a");
			driver.findElement(By.xpath("//span[contains(text(),'Acting Sustainably: Public and Private Environmental Behaviors')]")).click();
			Thread.sleep(2000);
			//12th
			eyes.checkWindow("UAT SITE Sustainability Article Tablet View mode 4.0.93.2a");
			driver.findElement(By.id("toggle-light-dark")).click();
			//13th
			eyes.checkWindow("UAT SITE Sustainability Article Tablet View mode2- 4.0.93.2a");
		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
			
		}

	}

}
