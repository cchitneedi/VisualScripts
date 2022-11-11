import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hindawi {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hindawi.com/");
		driver.findElement(By.linkText("Journals")).click();
		List<WebElement> journals = driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]"
				+ "/main[1]/div[2]/div[2]/div[3]/section[2]/div[1]/a['+i+']/div[1]/h3[1]"));
		System.out.println(journals.size());
		driver.findElement(By.xpath("//button[contains(text(),'B')]")).click();
		
		for (int i=1; i<=journals.size(); i++) {
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/section[2]/div[1]/a["+i+"]/div[1]/h3[1]")).click();
			Thread.sleep(1000);
			String url = driver.getCurrentUrl();
			System.out.println("Journal URL is "+url);
			String journalName = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/main[1]/div[1]/div[1]/a[1]/h1[1]")).getText();
			System.out.println("Name of Journal: "+journalName);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@aria-label='Table of Contents']")).click();
			try {
			List<WebElement> articles = driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div['+k+']/a[1]/h2[1]"));
			System.out.println(articles.size());
			}
			catch(Exception e1) {
			//	
				List<WebElement> articles = driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div['+k+']/a[1]/ul[1]/li[1]"));
				System.out.println(articles.size());
			}
			driver.navigate().back();
			driver.navigate().back();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[contains(text(),'B')]")).click();
			
		}
		driver.quit();
		
	}

}
