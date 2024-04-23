package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class denoqa {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shashidhar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(4000);
        driver.manage().window().maximize();
        //driver.findElement(By.cssSelector("#alertButton")).click();
        //Alert alert = driver.switchTo().alert();
        //alert.accept();
        //Thread.sleep(4000);

        //driver.findElement(By.id("confirmButton")).click();
        //Alert alert2 = driver.switchTo().alert();
        //alert2.accept();
        //Thread.sleep(4000);

        //driver.findElement(By.id("timerAlertButton")).click();
        //Alert alert3 = driver.switchTo().alert();

        Actions actions = new Actions(driver);

        WebElement E = driver.findElement(By.xpath("//button[@id='promtButton']"));
        
        Thread.sleep(5000);
        actions.moveToElement(E).click().perform();//forcefully click
        Alert alert4 = driver.switchTo().alert();
        alert4.sendKeys("shashidhar");
        alert4.accept();
        
        driver.quit();

        
        
        
	}

}
















       

    

