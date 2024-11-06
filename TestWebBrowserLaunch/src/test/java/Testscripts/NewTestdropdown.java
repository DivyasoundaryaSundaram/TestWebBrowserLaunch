package Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

WebDriver driver;


public class NewTestdropdown {
  /**
 * 
 */
@Test
  public void Dropdown() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https//www.stqatools.com/demo/Multiselectphp");
	  Thread.sleep(2000);
	  
	  Select dateSel = new Select(driver.findElement(
			  By.ByCssSelector("Select.date_s")));
	  dateSel.selectByVisibleText("1983");
	  
	  
	  
	  
	  
  }
}
