package com.obsqura.TestNGAssignment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCasesNg extends BaseTestNg{
	@Test
	public void verifyTitle() {
		String actualTitle,expTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		actualTitle = driver.getTitle();
		Assert.assertEquals(expTitle, actualTitle);
	}
	@Test
	public void verifyUrl() {
		String actualUrl,expUrl="www.";
		actualUrl=driver.getCurrentUrl();
		Boolean verifyUrl=actualUrl.contains(expUrl);
		Assert.assertTrue(verifyUrl);
	}
	@Test
	public void verifyPageSource() {
		String actualSource,expSource="https";
		actualSource=driver.getPageSource();
		Boolean verifySource=actualSource.contains(expSource);
		Assert.assertTrue(verifySource);
	}
	@Test
	public void navigateandCheck() {
		String loginTitle;
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		loginTitle=driver.getTitle();
		Boolean verTitle = loginTitle.equalsIgnoreCase("Amazon Sign In");
		Assert.assertTrue(verTitle);
	}
}
