package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shashidhar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        
        String ParentWinID = driver.getWindowHandle();
        
        WebElement insta = driver.findElement(By.xpath("//a[text()='Instagram']"));
        insta.click();
        Set<String> allWindowID = driver.getWindowHandles();
        System.out.println("Main window ID is =" + allWindowID);
        for(String wn:allWindowID) {
        	if(!ParentWinID.equals(wn)) {
        		driver.switchTo().window(wn);
        	}
        }
        Thread.sleep(2000);

        WebElement firstname = driver.findElement(By.xpath("//input[@name='username']"));
        firstname.sendKeys("shashidhar");
	}

}
