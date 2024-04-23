package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFunctionality {
    WebDriver driver = new ChromeDriver();

	void login_navigate() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(5000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		WebDriverWait wait = new WebDriverWait(driver,30);		
		driver.manage().window().maximize(); 
		WebElement w = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Username']")));
//		WebElement w = driver.findElement(By.xpath("//input[@placeholder='Username']"));
				w.sendKeys("Admin");
//			WebElement w = Wait.
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
	    driver.findElement(By.cssSelector("button[type='submit']")).click();
	    Thread.sleep(2000);
		}
   void Buzz() throws InterruptedException {
      
	     driver.findElement(By.xpath("//span[normalize-space()='Buzz']")).click();
	      Thread.sleep(2000);
	     driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]")).click();
	      Thread.sleep(2000);

	     driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]")).sendKeys("shashi");
	      Thread.sleep(2000);

	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
