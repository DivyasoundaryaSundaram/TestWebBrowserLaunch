package Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fileupload {
  @Test
  public void Fileadd() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://blueimp.github.io/jQuery-File-Upload/");
  WebElement addFile = driver.findElement(By.xpath("//input[@type = 'file']"));
	  String strPath  = System.getProperty("user.dir")
		  + "//1730696977247.png";
	  addFile.sendKeys(strPath);
      driver.findElement(By.xpath("//Span[text()='Start upload']")).click();
	  
	  
//	  Download
	  
//	  driver.get("https://chromedriver.storage.googleapis.com/index.html?path=2.0/");
//	  Thread.sleep(2000);
//	  WebElement addFile = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]/a"));
     
	  
	  
  }
}
