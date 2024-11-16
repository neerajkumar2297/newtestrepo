package example22;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class qty {
	
	public WebDriver driver;
	
	
	@Test
	public void testchrome() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//System.out.println("The current thread count: " +Thread.currentThread().getId());
		driver.close();
		
		
	}
	
	@Test
	public void testfirefox() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//System.out.println("The current thread count: " +Thread.currentThread().getId());
		driver.getTitle();
		
		driver.close();
		
	}
}
