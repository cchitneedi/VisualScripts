package visualRegression.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

public class Pathways2ResearchMobileView {
	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		Eyes eyes = new Eyes();
		eyes.setApiKey("wVE71yhGHadxX58P9ieyLRVJlpAXwCJAh100iJHBm6P3M110");
		try {
			eyes.open(driver, "MOBILE VIEW -[4.0.82b]", "400 X 630-[4.0.82b]");
			//driver.get("https://www.pathways2research.com/");
			driver.get("https://pathways2research.com.uat-nvcvooy-j43mdydumhk5g.us-4.platformsh.site/");
			
			// Default size
						Dimension currentDimension = driver.manage().window().getSize();
						int height = currentDimension.getHeight();
						int width = currentDimension.getWidth();
						System.out.println("Initial width: "+width);
						System.out.println("Initial height: "+ height);
						
						// Set new size
						Dimension mobileView = new Dimension(400, 630);
						driver.manage().window().setSize(mobileView);
						Thread.sleep(10000);
						// Getting 
						Dimension resizeBrowser = driver.manage().window().getSize();
						int tabletWidth = mobileView.getWidth();
						int tabletHeight = mobileView.getHeight();
						System.out.println("Current Mobile View width is : "+tabletWidth);
						System.out.println("Current Mobile View height is: "+ tabletHeight);
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#edit-name")).sendKeys("NES_Patron");
			driver.findElement(By.cssSelector("#edit-pass")).sendKeys("exm9fek5tfu-WMB@hwz");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#edit-submit")).click();
			Thread.sleep(3000);
			//1st
			eyes.checkWindow("UAT 400 X 630 - 4.0.82b-1");
			driver.findElement(By.id("toggle-light-dark")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Business & Economics')]")).click();
			Thread.sleep(5000);
			//2nd
			eyes.checkWindow("UAT 400 X 630 - 4.0.82b-2");
			driver.findElement(By.xpath("//span[contains(text(),'A Review of Software Tools Used in Research')]")).click();
			Thread.sleep(2000);
			//3rd
			//1st
			eyes.checkWindow("UAT 400 X 630 - 4.0.82b-3");
			driver.findElement(By.id("toggle-light-dark")).click();
			Thread.sleep(2000);
			//4th
			eyes.checkWindow("UAT 400 X 630 - 4.0.82b-4");
			driver.findElement(By.xpath("(//img[@class='default-logo'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Education')]")).click();
			Thread.sleep(5000);
			//5th
			eyes.checkWindow("UAT 400 X 630 - 4.0.82b-5");
			driver.findElement(By.id("toggle-light-dark")).click();
			Thread.sleep(2000);
			//6th
			eyes.checkWindow("UAT 400 X 630 - 4.0.82b-6");
			driver.findElement(By.xpath("//span[contains(text(),'A Primer on Standards-Based Grading')]")).click();
			Thread.sleep(2000);
			//7th
			eyes.checkWindow("UAT 400 X 630 - 4.0.82b-7");
			driver.findElement(By.id("toggle-light-dark")).click();
			Thread.sleep(2000);
			//8th
			eyes.checkWindow("UAT 400 X 630 - 4.0.82b-8");
			driver.findElement(By.xpath("(//img[@class='default-logo'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Sustainability')]")).click();
			Thread.sleep(5000);
			//9th
			eyes.checkWindow("UAT 400 X 630 - 4.0.82b-9");
			driver.findElement(By.id("toggle-light-dark")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'Acting Sustainably: Public and Private Environmental Behaviors')]")).click();
			Thread.sleep(2000);
			//10th
			eyes.checkWindow("UAT 400 X 630 - 4.0.82b-10");
			driver.findElement(By.id("toggle-light-dark")).click();
			//11th
			eyes.checkWindow("UAT 400 X 630 - 4.0.82b-11");
		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
			
		}

		
		
		
		
		
		
	}

}
