package Testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTestPopup {
  @Test
  public void Testwindow() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://stqatools.com/demo/Windows.php/");
	  Thread.sleep(3000);
	  String parentWin = driver.getWindowHandle();
	  System.out.println("Number of windows..." + parentWin);
	  
	  WebElement tabBtn = driver.findElement(By.xpath("//button[contains(text(), 'new Tab']"));
	  tabBtn.click();
	  System.out.println("Page Title..." + driver.getTitle());
		Set<String>	  tabs = driver.getWindowHandles();
		
  System.out.println("Number of windows..." + tabs.size());	  
  
  
  for (String child:tabs) {
	  System.out.println("windows..." + child);
	  if(!child.equalsIgnoreCase(parentWin)) {
		  driver.switchTo().window(child);
		  System.out.println("Child Win title ..." + driver.getTitle());
		  
	  }
	  driver.close();
	  driver.switchTo().window(parentWin);
	  System.out.println("Parent Page  title ..." + driver.getTitle());
	  driver.findElement(By.xpath("//button[contains(text(),'new window']")).click();
	  Set<String> wins = driver.getWindowHandles();
	  System.out.println("Parent Page  title ..." + wins.size());
	  
	  
	  



	  
	  
	  
	  
	  
	  
  }
	  
	  
  }
  
  
}
