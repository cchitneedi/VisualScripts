import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class wallStreet {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\cchitneedi\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.wsj.com/print-edition/20230117/us");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		Thread.sleep(5000);

		String FirstLink = driver.findElement(By.xpath("//main[@id='main']/div[1]/div[1]/div[1]/div[2]/div/h2/a"))
				.getAttribute("href");
		System.out.println(FirstLink);

		List<WebElement> allArticleTitles = driver
				.findElements(By.xpath("//div[starts-with(@class,'WSJTheme--list-item')]/div[2]/div[1]/h3/a"));

		int cnl = allArticleTitles.size();
		System.out.println("Count of Articles Links is: " + cnl);

		// Enhanced for loop
		for (WebElement option : allArticleTitles) {
			String namePrint = option.getAttribute("href");
			System.out.println("Href value of link: " + namePrint);
		}

	}

}
