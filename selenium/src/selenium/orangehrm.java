package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class orangehrm {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shashidhar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);

       driver.manage().window().maximize();
       System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());
       driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
       driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
       driver.findElement(By.cssSelector("button[type='submit']")).click();
       Thread.sleep(2000);

       driver.findElement(By.xpath("//span[normalize-space()='Buzz']")).click();
       Thread.sleep(2000);

       driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]")).click();
       Thread.sleep(2000);

       driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]")).sendKeys("shashi");
       Thread.sleep(2000);

       driver.findElement(By.xpath("//button[@type='submit']")).click();



	}

}
