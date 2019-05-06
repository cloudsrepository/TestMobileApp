package testcases;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.TestBase;


public class DisplayPopupTest extends TestBase {

	@Test(priority=3, description ="Test Case: 4 => Display Popup Message by clicking on Display Popup Window")
	public void clicks_on_Display_Popup_button() throws Throwable {
	    driver.findElement(By.id(OR.getProperty("PopupBtn"))).click();
	    driver.switchTo().alert().dismiss();
	}

}


