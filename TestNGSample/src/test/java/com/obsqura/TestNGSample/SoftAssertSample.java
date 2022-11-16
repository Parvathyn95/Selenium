package com.obsqura.TestNGSample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertSample extends BaseObs {
	@Test(description="softassert")
	public void softAssertSample() {
		String actTitle,expTitle="Obsqura Testing Sa",actUrl,expUrl="https://selenium.obsqurazone.com/simple-form-demo.php";
		actTitle=driver.getTitle();
		actUrl=driver.getCurrentUrl();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actTitle, expTitle);
		softAssert.assertEquals(actUrl,expUrl);
		softAssert.assertAll();
		
		
	}
}
