package com.obsqura.HardAssertAssign;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssignTest extends Base{
	@Test
	public void verifyTitle() {
		String actTitle,expTitle="Grocerystore";
		actTitle=driver.getTitle();
		Assert.assertEquals(expTitle, actTitle);
	}
	@Test
	public void driverIsNull() {
			Assert.assertNotNull(driver);
	}
	@Test
	public void driverNull() {
		String currentDrive,expDrive="opesmount";
		currentDrive=driver.getCurrentUrl();
		if(currentDrive.contains(expDrive)) {
			Assert.assertNotNull(true,"Driver url is not null");
		}
	}
		@Test
		public void loginPageNullNot() {
			String currentTitle,expTitle="Account";
			driver.navigate().to("http://www.opesmount.in/grocerystore1/index.php?route=account/login");
			currentTitle=driver.getTitle();
			if(currentTitle.contains(expTitle)) {
				Assert.assertNotNull(true,"Driver url is not null");
			}
	}
}
