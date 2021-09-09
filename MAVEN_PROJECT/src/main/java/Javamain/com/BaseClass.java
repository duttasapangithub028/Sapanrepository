package Javamain.com;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


    
	public class BaseClass 
	{
	
	  public WebDriver driver;
	  public DataUtility du=new DataUtility();
	 //s public static WebDriver moniterDriver;
	 // @Parameters("Browser")
	  @BeforeClass(alwaysRun= true)
	  public void launchBrowser()
	  {   
//		  if(browser.equals("Chrome"))
//				  {
//			         System.out.println("Browser lunch");
//			         System.setProperty("webdriver.chrome.driver", "C:\\OCSM14_AUTOMATION\\chromedriver_win32\\chromedriver.exe");
//			         driver=new ChromeDriver();
//				  }
//		          else if(browser.equals("firefox"))
//		          {
//		        	  System.out.println("Browser lunch");
//				       System.setProperty("webdriver.gecko.driver", "C:\\OCSM14_AUTOMATION\\geckodriver\\geckodriver.exe");
//				       driver=new FirefoxDriver();
//			  
//		          }
//		          else if(browser.equals("Opera"))
//		          {
//		        	  System.out.println("Browser lunch");
//				       System.setProperty("webdriver.opera.driver", "C:\\OCSM14_AUTOMATION\\operadriver\\operadriver_win64\\operadriver.exe");
//				       driver=new OperaDriver();
//		          }
		  
		  
		  
		  System.out.println("Browser launch");
		  System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
	  }

	  @BeforeMethod(alwaysRun= true)
	  public void login() throws IOException
	  {
		  System.out.println("login to application");
		  driver.get(du.getDataFromProperty("url"));
		  LoginPage lp=new LoginPage(driver);		  
		  //driver.findElement(By.name("user_name")).sendKeys(du.getDataFromProperty("username"));
		  //driver.findElement(By.name("user_password")).sendKeys(du.getDataFromProperty("password"));
		  //driver.findElement(By.id("submitButton")).click();  
		  lp.loginToApp(du.getDataFromProperty("username"), du.getDataFromProperty("password"));
	  }
	  
	  @AfterMethod(alwaysRun= true)
	  public void logout()
	  {
		  System.out.println("logout from application");
		  WebElement signoutDD=driver.findElement(By.xpath("//span[text()=' Administrator']/../following-sibling::td[1]/img"));
		  Actions act=new Actions(driver);
		  act.moveToElement(signoutDD).perform();
		  
	  }
	  @AfterClass(alwaysRun= true)
	  public void closeBrowser()
	  {
		  System.out.println("Browser close");
		  driver.close();
	  }
	}


