package org.testing.testscripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class TC3 
{
	
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException 
  {
	  WebElement signin=driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
		 signin.click();
	  WebElement Email=driver.findElement(By.cssSelector("input[aria-label='Email or phone']"));
	  Email.sendKeys("reena@abbieit.com");
	  WebElement Next=driver.findElement(By.xpath("//span[text()='Next']"));
	  Next.click();
	  Thread.sleep(1000);
	  WebElement Password=driver.findElement(By.name("password"));
	  Password.sendKeys("Reena@9590");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  WebElement Next2=driver.findElement(By.xpath("//span[text()='Next']"));
	  Next2.click();
	  WebElement Videoplay=driver.findElement(By.id("video-title"));
	  Videoplay.click();
	  Thread.sleep(5000);
	 WebElement Like=driver.findElement(By.xpath("//*[contains(@aria-label,'like this video')]"));
	 Like.click();
	 System.out.println("video liked");
	 
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