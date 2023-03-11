package pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserStartup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		
	   WebElement a=driver.findElement(By.id("twotabsearchtextbox"));
	   WebElement b=driver.findElement(By.id("nav-search-submit-button"));
		a.sendKeys("Samsung");
		Thread.sleep(2000);
		//WebElement b=driver.findElement(By.id("nav-search-submit-button"));
		b.click();
		
	
		
		
		
		

		
		
		
		
		
		
	}

}
