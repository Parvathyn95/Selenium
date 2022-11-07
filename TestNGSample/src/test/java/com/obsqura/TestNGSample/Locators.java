package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators extends Base {
	@Test(description="Locating By ID Amazon Test Case")
	public void locatingById(){
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Kipling sling bags");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14 pro max case");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	@Test(description="Locating By Class Obsqura Zone")
	public void locatingByClass() {
		driver.findElement(By.className("top-logo"));
	}
	@Test(description="Locating By Class Search n Featured")
	public void locatingClass() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14 pro max case");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.className("a-dropdown-label")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lakme eyeconic kajal");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.className("a-dropdown-prompt")).click();	
	}
	@Test(description="Locating By Class All")
	public void locatingAll() {
		driver.findElement(By.className("hm-icon-label")).click();	
	}
	@Test(description="Locating By Class Flag")
	public void locatingFlag() {
		driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 icp-link-style-2']")).click();	
		driver.findElement(By.className("a-button-input")).click();
	}
	@Test(description="Locating By Name")
	public void locatingName() {
		driver.findElement(By.name("dropdown-selection-ubb"));
	}
	@Test(description="Locating By CSS Selector(id) Select Your Address")
	public void locatingCSSSel() {
		driver.findElement(By.cssSelector("#glow-ingress-line2")).click();
	}
	@Test(description="Locating By CSS Selector(tag n id) Allv ")
	public void locatingCSSAll() {
		driver.findElement(By.cssSelector("div#nav-search-dropdown-card")).click();
	}
	@Test(description="Locating By CSS Selector(class) Cart To Deals")
	public void locatingCSSCartToDeals() {
		driver.navigate().to("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
		driver.findElement(By.cssSelector(".a-link-normal")).click();
	}
	@Test(description="Locating By CSS Selector(tag n class) Set Language")
	public void locatingCSSSetLang() {
		driver.navigate().to("https://www.amazon.in/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2Fref%3Dnav_logo&ref_=topnav_lang");
		driver.findElement(By.cssSelector("input.a-button-input")).click();
	}
	@Test(description="Locating By CSS Selector(tag n attribute) Lawn n Garden")
	public void locatingCSSLawnGrdn() {
		driver.findElement(By.cssSelector("option[value='search-alias=lawngarden']")).click();
	}
	@Test(description="Locating By CSS Selector(tag class n attribute) Flag")
	public void locatingCSSFlag() {
		driver.findElement(By.cssSelector("a#nav-logo-sprites[aria-label='Amazon']")).click();
	}
	/*@Test(description="Locating By CSS Selector(tag inner text)Account & Lists")
	public void locatingCSSAccountLists() {
		driver.findElement(By.cssSelector("span:contains('Account & Lists'))")).click();
	}*/
	//css selector does not support contains. Therefore you are getting an error saying the selector is invalid.
	@Test(description="Locating By xpath contains Garage")
	public void locatingxpathGarage() {
		driver.navigate().to("https://www.amazon.in/Home-Kitchen/b/?ie=UTF8&node=976442031&ref_=nav_cs_home");
		driver.findElement(By.xpath("//a[contains(text(),'Garage')]")).click();
	}
	@Test(description="Locating By xpath Search bar")
	public void locatingXpathSearch() {
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}
	@Test(description="Locating By xpath dir")
	public void locatingXpathdir() {
		driver.findElement(By.xpath("//input[@dir='auto']")).click();
	}
	@Test(description="Locating By xpath dir")
	public void locatingXpathElectroTop() {
		driver.navigate().to("https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics");
		driver.findElement(By.xpath("//a[@href='/b/?_encoding=UTF8&node=976392031&ref_=sv_top_elec_mega_2']")).click();
	}
	@Test(description="Locating By xpath Start Selling")
	public void locatingStartSelling(){
		driver.navigate().to("https://www.amazon.in/b/32702023031?node=32702023031&ld=AZINSOANavDesktop_T3&ref_=nav_cs_sell_T3");
		driver.findElement(By.xpath("//a[@aria-label='Main CTA']")).click();
	}
	@Test(description="Locating By xpath Best Sellers")
	public void locatingXpathBestSellers() {
		driver.navigate().to("https://www.amazon.in/Books/b/?ie=UTF8&node=976389031&ref_=nav_cs_books");
		driver.findElement(By.xpath("//img[@alt='Bestsellers']")).click();
	}
	@Test(description="Locating By xpath AirdopeAddCart")
	public void locatingXpathAirdopeAddCart() {
		driver.navigate().to("https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics");
		driver.navigate().to("https://www.amazon.in/dp/B09N3ZNHTY/ref=s9_acsd_al_bw_c2_x_0_t?pf_rd_m=A1K21FY43GMZF8&pf_rd_s=merchandised-search-4&pf_rd_r=H0Z2PZ0D9Y107N4MZB66&pf_rd_t=101&pf_rd_p=912786e9-e447-4e13-ab5b-b62b83cb6dac&pf_rd_i=976419031");
		driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();
	}
	@Test(description="Locating By xpath CookwareDining")
	public void locatingXpathCookwareDining() {
		driver.navigate().to("https://www.amazon.in/Home-Kitchen/b/?ie=UTF8&node=976442031&ref_=nav_cs_home");
		driver.findElement(By.xpath("//span[text()='Cookware & Dining']")).click();
	}
	@Test(description="Locating By xpath accounts lists")
	public void locatingXpathAccountlists() {
		driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
	}
	@Test(description="Locating By xpath books")
	public void locatingXpathBooks() {
		driver.findElement(By.xpath("//a[text()='Books']")).click();
	}
	@Test(description="Locating By xpath Sign In")
	public void locatingXpathSignIn() {
		driver.findElement(By.xpath("(//span[text()='Sign in'])[2]")).click();
	}
	@Test(description="Locating By xpath FashionWomen")
	public void locatingFashionWomen(){
		driver.navigate().to("https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion");
		driver.navigate().to("https://www.amazon.in/b/ref=AF_WIN_bub_w_cml_t_6?pf_rd_r=YJK5YZ1HFTJFRD61XR9H&pf_rd_p=63bd110d-830e-4aad-b9ba-c529ce193dc6&pf_rd_m=A1VBAL9TL5WCBF&pf_rd_s=merchandised-search-1&pf_rd_t=&pf_rd_i=6648217031&node=5210079031");
		driver.findElement(By.xpath("(//span[@class='nav-a-content'])[2])")).click();
	}
	@Test(description="Locating By xpath ClickSearch")
	public void locatingXpathClickSearch() {
		driver.findElement(By.xpath("(//div[@class='nav-fill'])[2]//child::div[1]")).click();
	}
	/*@Test(description="Locating By xpath to subscribe save")
	public void locatingXpathSubsSave() {
		driver.navigate().to("https://www.amazon.in/deals?ref_=nav_cs_gb");
		driver.findElement(By.xpath("(//div[@id='nav-subnav'])[3]//child::a[4]//child::(span[@class='nav-a-content'])[4]")).click();
	}*/
/*	@Test(description="Locating By xpath All Suggestions")
	public void locatingXpathAllSuggestions() {
		driver.findElement(By.xpath("(//div[@id='s-suggestion s-recentSearchDistinct s-suggestion-ellipsis-direction'])[2]//span[1]")).click();
	}*/
}
