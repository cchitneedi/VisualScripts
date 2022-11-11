import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class qa_googleDrive {
	@Test(priority=2)
	public static void qaMain() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cchitneedi\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Users\\cchitneedi\\Downloads\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\cchitneedi\\Downloads\\msedgedriver.exe");
		// WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://pathways2research.com.uat-nvcvooy-j43mdydumhk5g.us-4.platformsh.site/");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("#edit-name")).sendKeys("NES_Patron");
		driver.findElement(By.cssSelector("#edit-pass")).sendKeys("exm9fek5tfu-WMB@hwz");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#edit-submit")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Business and Economics')]")).click();
		int exansionButton = driver.findElements(By.xpath("//summary[@role='button']")).size();
		System.out.println("Expansion buttons count is: " + exansionButton);
		for (int i = 8; i <= exansionButton; i++) {
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/main[1]/div[1]/div[2]/div[1]/div[" + i
							+ "]/details[1]/summary[1]/h2[1]/a[1]/span[1]"))
					.click();
			Thread.sleep(5000);
			String articleTitle = driver.findElement(By.cssSelector("p.title-article")).getText();
			Actions abc = new Actions(driver);
			abc.moveToElement(driver.findElement(By.cssSelector("a.menu-toggle"))).click().build().perform();
			try {
				Thread.sleep(1000);
				abc.moveToElement(driver.findElement(By.cssSelector("li.save-google-drive"))).click().build().perform();
				// abc.moveToElement(driver.switchTo().alert());
				// driver.switchTo().alert().dismiss();
				System.out.println("Google Drive button working for: " + articleTitle);
				driver.navigate().back();
				Thread.sleep(1000);
			} catch (Exception e1) {
				System.out.println("Google Drive button not working for: " + articleTitle);
				driver.navigate().back();
				Thread.sleep(1000);
			}

		}
		driver.quit();

	}
	@Test(priority=1)
	public static void qa2Main() {
		System.out.println("This is the second functionality");
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		qa2Main();
		qaMain();

	}

}
