package visualRegression.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DenverHealth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://denverhealthhldemo.stacksplatform.com/");
		driver.get("https://uat-nvcvooy-u5lxdlxexidfs.us-3.platformsh.site/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Stress Management Collection')]")).click();
		driver.findElement(By.xpath("//input[@id='edit-search-form-eit-search-bar-container-query']")).sendKeys("Medicine");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='edit-search-form-eit-search-bar-container-actions-submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
		Thread.sleep(3000);
		WebElement lastPage = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
		lastPage.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//header/div[@id='main-navigation']/nav[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@data-drupal-link-query='{\"id\":\"EP 157017\"}'])[3]")).click();
		Thread.sleep(2000);
	}

}
