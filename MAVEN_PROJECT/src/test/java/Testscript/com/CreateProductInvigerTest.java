package Testscript.com;

import java.io.IOException;   
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Javamain.com.BaseClass;

public class CreateProductInvigerTest extends BaseClass{
		@Test
		public void createNewProduct() throws EncryptedDocumentException, IOException {
			
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		driver.findElement(By.cssSelector("img[title='Create Product...']")).click();
		driver.findElement(By.name("productname")).sendKeys(du.getdataFromExcel("Sheet1", 1, 0),Keys.ENTER);
		
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		
		System.out.println("sucsessfully Create Products");
	}
}


