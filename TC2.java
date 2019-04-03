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

public class TC2

{
	WebDriver driver;
  @Test
  public void f1() throws InterruptedException
  {
	 
	  WebElement Signin=driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
	  Signin.click();
	  WebElement Email=driver.findElement(By.xpath("//*[@class='whsOnd zHQkBf']"));
	  Email.sendKeys("reena@abbieit.com");
	  WebElement Next=driver.findElement(By.xpath("//span[text()='Next']"));
	  Next.click();
	  Thread.sleep(3000);
	  WebElement Password=driver.findElement(By.xpath("//*[@name='password']"));
	  Password.sendKeys("Reena@9590");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  WebElement Next2=driver.findElement(By.xpath("//span[text()='Next']"));
	  Next2.click();
	  WebElement Subscription=driver.findElement(By.xpath("//span[text()='Subscriptions']"));
	  Subscription.click();
	  Thread.sleep(1000);
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
