package visualRegression.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

public class PathwaysMyAccountPages {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
				Eyes eyes = new Eyes();
				eyes.setApiKey("wVE71yhGHadxX58P9ieyLRVJlpAXwCJAh100iJHBm6P3M110");
				try {
					eyes.open(driver, "PATHWAYS2RESEARCH-DESKTOP-VIEW Account", "My Account Section -[4.0.84]");
					//driver.get("https://www.pathways2research.com/");
					driver.get("https://pathways2research.com.uat-nvcvooy-j43mdydumhk5g.us-4.platformsh.site/");
					driver.manage().window().maximize();
					Thread.sleep(1000);
					driver.findElement(By.cssSelector("#edit-name")).sendKeys("NES_Patron");
					driver.findElement(By.cssSelector("#edit-pass")).sendKeys("exm9fek5tfu-WMB@hwz");
					Thread.sleep(1000);
					//eyes.checkWindow("MASTER SITE [4.0.84] Login Page");
					driver.findElement(By.cssSelector("#edit-submit")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//button[@id='mobile-menu-2']")).click();
					Thread.sleep(1000);
					
					WebElement myAcc = driver.findElement(By.xpath("//body/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]"));
					myAcc.click();
					
					Thread.sleep(2000);
					//1st
					eyes.checkWindow("UAT SITE [4.0.84][DESKTOP] My-Account Page mode1");
					driver.findElement(By.id("toggle-light-dark")).click();
					Thread.sleep(2000);
					//2nd
					eyes.checkWindow("UAT SITE [4.0.84][DESKTOP] My-Account Page mode2");
					driver.findElement(By.linkText("Your Saved List")).click();
					Thread.sleep(2000);
					//3rd
					eyes.checkWindow("UAT SITE [4.0.84][DESKTOP] Saved-List Page mode1");
					driver.findElement(By.id("toggle-light-dark")).click();
					Thread.sleep(2000);
					//4th
					eyes.checkWindow("UAT SITE [4.0.84][DESKTOP] Saved-List Page mode2");
					driver.navigate().back();
					driver.findElement(By.linkText("Your Saved Searches")).click();
					Thread.sleep(2000);
					//5th
					eyes.checkWindow("UAT SITE [4.0.84][DESKTOP] Saved-Searches Page mode1");
					driver.findElement(By.id("toggle-light-dark")).click();
					Thread.sleep(2000);
					//6th
					eyes.checkWindow("UAT SITE [4.0.84][DESKTOP] Saved-Searches Page mode2");
					driver.navigate().back();
					driver.findElement(By.xpath("//input[@id='edit-search-form-eds-search-bar-container-query']")).sendKeys("Solar");
					driver.findElement(By.xpath("//input[@name='eds-submit']")).click();
					Thread.sleep(1000);
					//7th
					eyes.checkWindow("UAT SITE [4.0.84][DESKTOP] Search-Results Page");
					driver.findElement(By.id("toggle-light-dark")).click();
					Thread.sleep(1000);
					//8th
					eyes.checkWindow("UAT SITE [4.0.84][DESKTOP] Search-Results Page mode2");
					
				}
				 finally {
						driver.quit();
						eyes.abortIfNotClosed();
					}
		
		
		
		
	}

}
