package Testscripts;
import org.openqa.selenium.WebDriver;
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
	  driver.get("https://testautomationpractice.blogspot.com");
  }
  
}
