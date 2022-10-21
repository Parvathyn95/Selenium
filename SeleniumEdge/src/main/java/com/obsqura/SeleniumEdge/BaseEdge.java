package com.obsqura.SeleniumEdge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseEdge {
	public WebDriver driver;
	public WebDriver initBrowser() {
		System.setProperty("webdriver.edge.driver" , "C:\\Users\\admin\\eclipse-workspace\\SeleniumEdge\\src\\main\\java\\Resources\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		return driver;
	}
	public void edgeClose() {
		driver.close();
	}
}
