import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class screenshots {
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		takeScreenshot("fb_homepage3");
		driver.findElement(By.cssSelector("#email")).sendKeys("selenium");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Selenium test");
		Thread.sleep(2000);
		takeScreenshot("fb_secondpic001");
		
		driver.close();
	
	}
	public static void takeScreenshot(String fileName) throws IOException {
		//casting here driver object to TakesScreenshot method object
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//method to copy the file into our local machine
		FileUtils.copyFile(src,new File("C:\\Users\\cchitneedi\\eclipse-2\\GeneralTests\\src\\"+fileName+".jpg"));
	}

}
