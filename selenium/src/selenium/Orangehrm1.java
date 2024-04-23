package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm1 {

	public static void main(String[] args) 
		 throws InterruptedException
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shashidhar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		        LoginFunctionality d = new LoginFunctionality();
		        d.login_navigate();
		        Thread.sleep(3000);
		        d.Buzz();

//		       System.out.println(driver.getTitle());
//		       System.out.println(driver.getCurrentUrl());

//		       Thread.sleep(2000);

	}

}
