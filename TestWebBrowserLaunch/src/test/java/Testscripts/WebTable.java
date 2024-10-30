package Testscripts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	
	  WebDriver driver;
  @Test
  public void TestTable() {

	 driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://testautomationpractice.blogspot.com");
	 List<WebElement> items = driver.findElements(By.xpath("//td[contains(text(),'Master In Selenium')]//following-sibling::td1"));
    System.out.println("Number of items.....:" + items.size());
    for (WebElement item :items) {
    	System.out.println("item value : . . . ." + item.getText());
    	
    } 
	 	  
  }
}
