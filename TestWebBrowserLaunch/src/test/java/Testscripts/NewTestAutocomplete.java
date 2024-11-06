package Testscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTestAutocomplete {
	public static final String expValue = "javaScript";
	
	
  @Test
  public void AutocomTesting() {
	  
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://jqueryui.com/autocomplete/");
	  WebElement frame1 = driver.findElement(By.cssSelector(".demo-frame"));
	  driver.switchTo().frame(frame1);
	  WebElement inp = driver.findElement(By.cssSelector("#tags"));
	  
	  
	  inp.sendKeys("as");
	  
	  
	  List<WebElement> items = driver.findElements(By.cssSelector("u1#ui-id-1 > li"));
	  
	  System.out.println("No of items . . . "  + items.size());
	  
	  for(WebElement item : items) {
		  
		  System.out.println(item.getText());
		  
		  if(item.getText().equalsIgnoreCase(expValue)) {
			  item.click();
			  break;
			  
			  
		  }
	  }
  	  
	  
	  
	  
	  
	  

  }
}
