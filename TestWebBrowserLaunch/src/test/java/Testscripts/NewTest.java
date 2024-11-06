package Testscripts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class NewTest {
	
	WebDriver driver;
@Test
  public void LoginTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  //driver.get("https://the-internet.herokuapp.com/login");
	  //driver.findElement(By.id("username")).sendKeys("tomsmith");
	 // driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	  //driver.findElement(By.className("radius")).click();
	  driver.get("https://www.google.com");
	  
	  
	  //mouse action day 5//
	  List<WebElement> items = driver.findElements(
			  By.cssSelector(null));
	  
	  int numItems = items.size();
	  for(int i =0; i< items.size(); i++) {
		  WebElement item = items.get(i);
		  if(item.getText().equalsIgnoreCase("Monitor 2")) {
			  
			  item.click();
			  break;
			  
		  }
		  
			  
		  
	  }
	  
  }
  
}
