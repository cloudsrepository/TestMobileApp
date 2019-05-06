package testcases;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import base.TestBase;

public class DisplayToastMessageTest extends TestBase{
	
	@Test(priority=4, description ="Test Case: 5 => Display Toast Message")
	public void tostMessage(){
	driver.findElement(By.id(OR.getProperty("ToastMsg"))).click();
		
	}
	

}
