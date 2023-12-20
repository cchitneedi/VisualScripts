package PublicLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PalosVerdes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		Eyes eyes = new Eyes();
		//chrantrent@gmail.com
		eyes.setApiKey("LZLxPWPBvOSNYFXKIUS8o7cKrgRhQwjWZnMvd104jAtyI110");

		driver.manage().timeouts().pageLoadTimeout(210, TimeUnit.SECONDS);
		
		try {
			eyes.open(driver, "Public Palos Verdes - [4.0.1.109.1]", "Palos Verdes-[4.0.108 & 4.0.106.2]");
			driver.get("https://www.pvld.org/");
			//driver.get("https://pvld.org.uat-nvcvooy-3oi3iamzdpmdc.us-3.platformsh.site/");

			Thread.sleep(5000);
			eyes.checkWindow("-MASTER- Palos Verdes Home Page 4.0.106.2");
			
			//Click on Book a Study Room Callout
			driver.findElement(By.xpath("//a[contains(text(),'Book a Study Room')]")).click();
			Thread.sleep(4000);
			
			eyes.checkWindow("-MASTER- Book a Study Room 4.0.106.2");
			driver.navigate().back();
			
			//Click on Custom Block Content Celebrate
			driver.findElement(By.xpath("//body/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/main[1]/div[1]/div[3]/article[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]/article[1]/div[1]/img[1]")).click();
			Thread.sleep(9000);
			eyes.checkWindow("-MASTER- Celebrate Our Stories Page 4.0.106.2");
			
			
			//Click on 2nd May Month Callout
			//driver.findElement(By.xpath("(//a[@href='/celebrate/jahmo'])[2]")).click();
			//UAT
			driver.findElement(By.xpath("//body/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/main[1]/div[1]/div[3]/article[1]/div[1]/div[2]/div[1]/div[1]/div[1]/article[4]/div[1]/div[1]/h3[1]/a[1]")).click();
			Thread.sleep(4000);
			eyes.checkWindow("-MASTER- May Month 4.0.106.2");
			driver.navigate().back();
			
			
			Thread.sleep(2000);
			
			
			
			//Click on Sep-Oct Month
			driver.findElement(By.xpath("//a[contains(text(),'Sep-Oct')]")).click();
			Thread.sleep(4000);
			eyes.checkWindow("-MASTER- Bookmobile link text 4.0.106.2");
			driver.navigate().back();
			
			
			
			//Click on October Month
			driver.findElement(By.xpath("//a[contains(text(),'October')]")).click();
			Thread.sleep(5000);
			eyes.checkWindow("-MASTER- October Page 4.0.106.2");
			driver.navigate().back();
			Thread.sleep(5000);
			
			//Click on elibrary in home page
			driver.findElement(By.xpath("(//a[@href='/elibrary'])[2]")).click();
			eyes.checkWindow("-MASTER- eLibrary 4.0.106.2");
			
			Thread.sleep(5000);
			//Click on Events in home page
			driver.findElement(By.xpath("(//a[@href='/calendar'])[2]")).click();
			eyes.checkWindow("-MASTER- Events 4.0.106.2");
			

		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}

		
		
		
		

	}

}
