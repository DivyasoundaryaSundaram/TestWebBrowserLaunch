package Testscripts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleTstPage{
	
WebDriver driver;
@Test
	
public void searchJavaTest() {
		
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("115");
		driver =new ChromeDriver(options);
		driver.manage().window().maximize();
      //  driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//WebElement searchbox = driver.findElement(By.id("APjFqb"));
		//WebElement searchbox = driver.findElement(By.tagName("gLFyf"));
		WebElement searchbox = driver.findElement(By.name("q"));

		searchbox.sendKeys("java Tutorial");
		searchbox.sendKeys(Keys.ENTER);	
		
		System.out.println("Page Title : after back()..." + driver.getTitle());
		
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		driver.navigate().back();
		System.out.println("Page Title : after forward()..." + driver.getTitle());
		
		//driver.close();
		
		
	}
}
