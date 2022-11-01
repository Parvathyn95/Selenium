package com.obsqura.HardAssertAssign;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;
	@BeforeMethod
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\HardAssertAssign\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.opesmount.in/grocerystore1/");
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void browserClose() {
		driver.close();
	}
}
