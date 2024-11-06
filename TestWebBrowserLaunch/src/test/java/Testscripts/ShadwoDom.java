package Testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ShadwoDom {
  @Test
  public void Alerts() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  Actions actions = new  Actions(driver);
	  
	  driver.get("https://demoqa.com/alerts");
	 
	  
	  WebElement alertBtn = driver.findElement(By.id("confirmButton"));
	  actions.scrollToElement(alertBtn).perform();
	  Thread.sleep(4000); 
	  alertBtn.click();
	   Alert alert = driver.switchTo().alert();
	   System.out.println("Confirm Alert Text : " + alert.getText());
	   alert.accept();
//confirmation	   
	   
	   WebElement confirmBtn = driver.findElement(By.id("confirmButton"));
	   actions.scrollToElement(confirmBtn).perform();
	   Thread.sleep(4000);
	   confirmBtn.click();
	   Alert confirm  = driver.switchTo().alert();
       System.out.println("Confirm Alert Text : " + confirm.getText());
	    confirm.dismiss();
	  
	  
	  
//prompt
	  WebElement promptBtn = driver.findElement(By.id("promptButton"));
	  actions.scrollToElement(promptBtn).perform();
	  Thread.sleep(4000);
	  promptBtn.click();
		Alert prompt  = driver.switchTo().alert();
	    System.out.println("Prompt Alert Text : " + prompt.getText());
	    prompt.sendKeys("Hello Welcome");
	    prompt.accept();
	  
	  
	  
  }
}
