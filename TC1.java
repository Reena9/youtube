package org.testing.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {
	
	public WebDriver driver;

	
  @Test
  public void f() throws InterruptedException 
  {
	 WebElement signin=driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
	 signin.click();
	 WebElement Email=driver.findElement(By.xpath("//input[@type='email']"));
	 Email.sendKeys("reena@abbieit.com");
	 WebElement Next=driver.findElement(By.cssSelector("content.CwaK9"));
	 Next.click();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 WebElement Password=driver.findElement(By.name("password"));
	 Password.sendKeys("Reena@9590");
	 Thread.sleep(1000);
	 WebElement Next2=driver.findElement(By.xpath("//span[text()='Next']"));
	 Next2.click();
	 Thread.sleep(5000);
	 WebElement Trending=driver.findElement(By.xpath("//span[text()='Trending']"));
	 Trending.click();
	Thread.sleep(5000);

	
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions option=new ChromeOptions();
	option.addArguments("disable-notifications");
	driver=new ChromeDriver(option);
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	
	  
  }

  
  @AfterMethod
  public void afterMethod()
  {
	  driver.close();
  }

}
