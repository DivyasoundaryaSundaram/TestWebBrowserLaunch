package Testscripts;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	
	  WebDriver driver;
  @Test
  public void TestTable() throws IOException {

	 driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://automationbookstore.dev");
	  driver.findElement(By.id("searchBar")).sendKeys("Test");
	  
	  
	  TakesScreenshot screen = (TakesScreenshot)driver;
	  File srcImg =screen.getScreenshotAs(OutputType.FILE);
	  String path = System.getProperty("user.dir")
			  + "/screenshots/" + System.currentTimeMillis() + ".png";
	  FileUtils.copyFile(srcImg, new File(path));
	  
	  String strPlaceholder = driver.findElement(
			  By.id("searchBar")).getAttribute("placeHolder");
	  System.out.println(strPlaceholder);
	 //WebElement CloseIcon = driver.findElement(
			// By.cssSelector("a[title = 'Clear text']"));
	 
	 
	 
	 
	 
	
	 
			 
	 
	  		
	 
	  	  //driver.get("https://testautomationpractice.blogspot.com");
	// List<WebElement> items = driver.findElements(By.xpath("//td[contains(text(),'Master In Selenium')]//following-sibling::td1"));
   // System.out.println("Number of items.....:" + items.size());
   // for (WebElement item :items) {
    	//System.out.println("item value : . . . ." + item.getText());
    	
    } 
	 	  
  }

