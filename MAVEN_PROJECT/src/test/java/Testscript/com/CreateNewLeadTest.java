package Testscript.com;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Javamain.com.BaseClass;

public class CreateNewLeadTest extends BaseClass
{
	        @Test
			public void CreatenewLead() throws EncryptedDocumentException, IOException 
			{
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.cssSelector("img[title='Create Lead...']")).click();
			driver.findElement(By.name("firstname")).sendKeys(du.getdataFromExcel("lead", 0, 5));
			driver.findElement(By.name("lastname")).sendKeys(du.getdataFromExcel("lead", 1, 5));
			driver.findElement(By.name("company")).sendKeys(du.getdataFromExcel("lead", 2, 5),Keys.ENTER);
			System.out.println("sucsessfully Create Lead");
			}
	
  }
