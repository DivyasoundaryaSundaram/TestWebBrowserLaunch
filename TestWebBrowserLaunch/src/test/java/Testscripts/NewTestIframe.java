package Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTestIframe {
  @Test
  public void Iframetest() {
	  
	  WebDriver driver  = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://the-internet.herokuapp.com/iframe");
	  WebElement iFrameElem = driver.findElement(By.id("mce_0_ifr"));
	  
	  driver.switchTo().frame(iFrameElem);
	  
	  WebElement inputTxt = driver.findElement(By.id("tinymce"));
	  
	  String strTxt = inputTxt.getText();
	  System.out.println("Txt From Frame ..."   + strTxt);
	  
	  //switch backto Main page
	  
	  driver.switchTo().defaultContent();
	  WebElement linkTxt = driver.findElement(By.cssSelector("span.tox-statusbar__branding"));
	  linkTxt.click();
	  
	  
	  
  }
}
