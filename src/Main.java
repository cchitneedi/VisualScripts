import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cchitneedi\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://pathwaysdev.stacksplatform.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#edit-name")).sendKeys("NES_Patron");
		driver.findElement(By.cssSelector("#edit-pass")).sendKeys("exm9fek5tfu-WMB@hwz");
		driver.findElement(By.cssSelector("#edit-submit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Education')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Educational Psychology, Counseling, and Human Development')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/main[1]/div[1]/div[2]/div[1]/div[3]/details[1]/summary[1]"))
		.click();
		
	}

}
