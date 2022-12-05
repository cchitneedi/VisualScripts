package visualRegression.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

public class mobileViewPathwaysMyAccountPages {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
				Eyes eyes = new Eyes();
					eyes.setApiKey("wVE71yhGHadxX58P9ieyLRVJlpAXwCJAh100iJHBm6P3M110");
				try {
					eyes.open(driver, "PATHWAYS-Mobile Account", "Mobile Account Section -[4.0.84]");
					//driver.get("https://www.pathways2research.com/");
					driver.get("https://pathways2research.com.uat-nvcvooy-j43mdydumhk5g.us-4.platformsh.site/");
					// Default size
					Dimension currentDimension1 = driver.manage().window().getSize();
					int height = currentDimension1.getHeight();
					int width = currentDimension1.getWidth();
					System.out.println("Current width: "+width);
					System.out.println("Current height: "+ height);
					// Set new size
					Dimension mobileView2 = new Dimension(400, 630);
					driver.manage().window().setSize(mobileView2);
					Thread.sleep(10000);
					// Getting 
					Dimension resizeBrowser3 = driver.manage().window().getSize();
					int mobileWidth = mobileView2.getWidth();
					int mobiletHeight = mobileView2.getHeight();
					System.out.println("Current Mobile View width is : "+mobileWidth);
					System.out.println("Current Mobile View height is: "+ mobiletHeight);
					Thread.sleep(1000);
					driver.findElement(By.cssSelector("#edit-name")).sendKeys("NES_Patron");
					driver.findElement(By.cssSelector("#edit-pass")).sendKeys("exm9fek5tfu-WMB@hwz");
					Thread.sleep(1000);
					eyes.checkWindow("MASTER SITE [4.0.84] Login Page");
					driver.findElement(By.cssSelector("#edit-submit")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//button[@id='mobile-menu-1']")).click();
					Thread.sleep(1000);
					
					WebElement myAcc = driver.findElement(By.xpath("//body/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]"));
					myAcc.click();
					
					Thread.sleep(2000);
					//1st
					eyes.checkWindow("UAT SITE [4.0.84] [400 X 630] My-Account Page mode1");
					driver.findElement(By.id("toggle-light-dark")).click();
					Thread.sleep(2000);
					//2nd
					eyes.checkWindow("UAT SITE [4.0.84] [400 X 630] My-Account Page mode2");
					driver.findElement(By.linkText("Your Saved List")).click();
					Thread.sleep(2000);
					//3rd
					eyes.checkWindow("UAT SITE [4.0.84] [400 X 630] Saved-List Page mode1");
					driver.findElement(By.id("toggle-light-dark")).click();
					Thread.sleep(2000);
					//4th
					eyes.checkWindow("UAT SITE [4.0.84][400 X 630] Saved-List Page mode2");
					driver.navigate().back();
					driver.findElement(By.linkText("Your Saved Searches")).click();
					Thread.sleep(2000);
					//5th
					eyes.checkWindow("UAT SITE [4.0.84] [400 X 630] Saved-Searches Page mode1");
					driver.findElement(By.id("toggle-light-dark")).click();
					Thread.sleep(2000);
					//6th
					eyes.checkWindow("UAT SITE [4.0.84] [400 X 630] Saved-Searches Page mode2");
					driver.navigate().back();
					//PRODUCTION
					//driver.findElement(By.xpath("//input[@id='edit-search-form-sds-search-bar-container-query']")).sendKeys("Solar");
					//driver.findElement(By.xpath("//input[@name='sds-submit']")).click();
					//UAT
					driver.findElement(By.xpath("//input[@id='edit-search-form-eds-search-bar-container-query']")).sendKeys("Solar");
					driver.findElement(By.xpath("//input[@name='eds-submit']")).click();
					eyes.checkWindow("UAT SITE [4.0.84] [400 X 630] Search-Results");
				}
				 finally {
						driver.quit();
					eyes.abortIfNotClosed();
					}
		
		
		
		
	}

}
