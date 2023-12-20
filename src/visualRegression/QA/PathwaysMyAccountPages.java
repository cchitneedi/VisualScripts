package visualRegression.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PathwaysMyAccountPages {

	public static void main(String[] args) throws InterruptedException {

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		
				Eyes eyes = new Eyes();
				eyes.setApiKey("wVE71yhGHadxX58P9ieyLRVJlpAXwCJAh100iJHBm6P3M110");
				try {
					eyes.open(driver, "PATHWAYS2RESEARCH-DESKTOP VIEW Account", "My Account Pages -[4.0.103]");
					driver.get("https://www.pathways2research.com/");
					//driver.get("https://pathways2research.com.uat-nvcvooy-j43mdydumhk5g.us-4.platformsh.site/");
					driver.manage().window().maximize();
					Thread.sleep(1000);
					driver.findElement(By.cssSelector("#edit-name")).sendKeys("NES_Patron");
					driver.findElement(By.cssSelector("#edit-pass")).sendKeys("exm9fek5tfu-WMB@hwz");
					Thread.sleep(1000);
					eyes.checkWindow("-MASTER- SITE [4.0.103] Login Page");
					driver.findElement(By.cssSelector("#edit-submit")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//button[@id='mobile-menu-2']")).click();
					Thread.sleep(1000);
					
					WebElement myAcc = driver.findElement(By.xpath("//body/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]"));
					myAcc.click();
					
					Thread.sleep(2000);
					//1st
					eyes.checkWindow("-MASTER- SITE [4.0.103] My-Account Page mode1");
					driver.findElement(By.id("toggle-light-dark")).click();
					Thread.sleep(2000);
					//2nd
					eyes.checkWindow("-MASTER- SITE [4.0.103] My-Account Page mode2");
					driver.findElement(By.linkText("Your Saved List")).click();
					Thread.sleep(2000);
					//3rd
					eyes.checkWindow("-MASTER- SITE [4.0.103] Saved-List Page mode1");
					driver.findElement(By.id("toggle-light-dark")).click();
					Thread.sleep(2000);
					//4th
					eyes.checkWindow("-MASTER- SITE [4.0.103] Saved-List Page mode2");
					driver.navigate().back();
					driver.findElement(By.linkText("Your Saved Searches")).click();
//					Thread.sleep(2000);
//					//5th
//					eyes.checkWindow("-MASTER- SITE [4.0.103] Saved-Searches Page mode1");
//					driver.findElement(By.id("toggle-light-dark")).click();
//					Thread.sleep(2000);
//					//6th
//					eyes.checkWindow("-MASTER- SITE [4.0.103] Saved-Searches Page mode2");
//					driver.navigate().back();
//					Thread.sleep(3000);
//					driver.findElement(By.xpath("//input[@id='edit-search-form-eds-search-bar-container-query']")).sendKeys("Solar");
//					driver.findElement(By.xpath("//input[@name='eds-submit']")).click();
//					Thread.sleep(3000);
//					//7th
//					eyes.checkWindow("-MASTER- SITE [4.0.103] Search-Results Page");
//					driver.findElement(By.id("toggle-light-dark")).click();
//					Thread.sleep(1000);
//					//8th
//					eyes.checkWindow("-MASTER- SITE [4.0.103] Search-Results Page mode2");
					
				}
				 finally {
						driver.quit();
						eyes.abortIfNotClosed();
					}
	}

}
