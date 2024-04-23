package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		Boolean a , b, c,d;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shashidhar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        
        a = login.isDisplayed();
        b = login.isEnabled();
        if(a == true && b == true) {
        	 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
             driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
             login.click();
             Thread.sleep(2000);

             driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
             Thread.sleep(2000);

             WebElement mRadiobtn  = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
             c = mRadiobtn.isSelected();
             System.out.println("Male Radiobtn " + c);
             
             WebElement fRadiobtn  = driver.findElement(By.xpath(" //label[normalize-space()='Female']"));
             d = fRadiobtn.isSelected();
             System.out.println("female Radiobtn "+ d);
             if(d == false) {
            	 fRadiobtn.click();
            
                 System.out.println("female Radiobtn "+ d);
             }
        }
        else {
            driver.navigate().refresh();
            Thread.sleep(2000);

            TakesScreenshot ts = (TakesScreenshot)driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            File file = new File("G:\\screenshot.png");
            FileUtils.copyFile(src,file);
            System.out.println("Screenshot is captured");
        }
        System.out.println(a);
        
        Thread.sleep(5000);

        driver.quit();
	}

}
