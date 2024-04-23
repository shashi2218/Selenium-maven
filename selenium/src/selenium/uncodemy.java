package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uncodemy {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shashidhar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://uncodemy.com/");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        WebElement categories =driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
        Actions a = new Actions(driver);
      	a.moveToElement(categories).perform();
        WebElement st =driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Software Testing']"));
      	a.moveToElement(st).perform();
      	
      	driver.findElement(By.xpath("//a[normalize-space()='Manual Testing']")).click();
      	
        Thread.sleep(2000);

      	driver.close();
	}

}
