package Testscript.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoScript
{   @Test
	public void login_Test() 
	{
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\OCSM14_AUTOMATION\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver driver= new ChromeDriver();
    
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	 driver.get("https://demo.actitime.com/login.do");
	 
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.className("textField")).sendKeys("admin");
	
	 
	 driver.findElement(By.className("pwdfield")).sendKeys("manager");
	
	 
	 driver.findElement(By.id("keepLoggedInCheckBox")).click();
	 
	 driver.findElement(By.id("loginButton")).click();
	 
	
	 
	 System.out.println("Title is:" + driver.getCurrentUrl());
	 
	 
	 
	 driver.close();
}
}


