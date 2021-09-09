package Testscript.com;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Javamain.com.BaseClass;

public class CreateNewContactTest extends BaseClass
{
	    @Test
		public void createNewcantacts() throws EncryptedDocumentException, IOException 
		{
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.cssSelector("img[title='Create Contact...']")).click();
		driver.findElement(By.name("lastname")).sendKeys(du.getdataFromExcel("contact", 1, 2),Keys.ENTER);
		System.out.println("sucsessfully Create contact");
		
		}
}




