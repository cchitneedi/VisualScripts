package visualRegression.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

public class mobileViewPathwaysMyAccountPages {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		//cchitneedi@nes.co.in
			//Eyes eyes = new Eyes();
				//eyes.setApiKey("U7sd0gV48usZ4bzkwcPsAs104X10619109icnq7fzBdCqvABU110");
				try {
					//eyes.open(driver, "PATHWAYS2RESEARCH Account", "My Account Section -[4.0.81.2]");
					//driver.get("https://www.pathways2research.com/");
					driver.get("https://pathways2research.com.uat-nvcvooy-j43mdydumhk5g.us-4.platformsh.site/");
					driver.manage().window().maximize();
					Thread.sleep(1000);
					driver.findElement(By.cssSelector("#edit-name")).sendKeys("NES_Patron");
					driver.findElement(By.cssSelector("#edit-pass")).sendKeys("exm9fek5tfu-WMB@hwz");
					Thread.sleep(1000);
					//eyes.checkWindow("UAT SITE [4.0.81.2] Login Page");
					driver.findElement(By.cssSelector("#edit-submit")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//button[@id='mobile-menu-2']")).click();
					Thread.sleep(1000);
					
					WebElement myAcc = driver.findElement(By.xpath("//body/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]"));
					myAcc.click();
					
					Thread.sleep(2000);
					//1st
					//eyes.checkWindow("UAT SITE [4.0.81.2] My-Account Page mode1");
					driver.findElement(By.id("toggle-light-dark")).click();
					Thread.sleep(2000);
					//2nd
					//eyes.checkWindow("UAT SITE [4.0.81.2] My-Account Page mode2");
					driver.findElement(By.linkText("Your Saved List")).click();
					Thread.sleep(2000);
					//3rd
					//eyes.checkWindow("UAT SITE [4.0.81.2] Saved-List Page mode1");
					driver.findElement(By.id("toggle-light-dark")).click();
					Thread.sleep(2000);
					//4th
					//eyes.checkWindow("UAT SITE [4.0.81.2] Saved-List Page mode2");
					driver.navigate().back();
					driver.findElement(By.linkText("Your Saved Searches")).click();
					Thread.sleep(2000);
					//5th
					//eyes.checkWindow("UAT SITE [4.0.81.2] Saved-Searches Page mode1");
					driver.findElement(By.id("toggle-light-dark")).click();
					Thread.sleep(2000);
					//6th
					//eyes.checkWindow("UAT SITE [4.0.81.2] Saved-Searches Page mode2");
					driver.navigate().back();
					//PRODUCTION
					//driver.findElement(By.xpath("//input[@id='edit-search-form-sds-search-bar-container-query']")).sendKeys("Solar");
					//driver.findElement(By.xpath("//input[@name='sds-submit']")).click();
					//7th
					//eyes.checkWindow("UAT SITE [4.0.81.2] Search-Results Page");
					//UAT
					driver.findElement(By.xpath("//input[@id='edit-search-form-eds-search-bar-container-query']")).sendKeys("Solar");
					driver.findElement(By.xpath("//input[@name='eds-submit']")).click();
				}
				 finally {
						driver.quit();
					//eyes.abortIfNotClosed();
					}
		
		
		
		
	}

}
