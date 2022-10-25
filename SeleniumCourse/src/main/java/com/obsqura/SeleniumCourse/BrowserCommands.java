package com.obsqura.SeleniumCourse;

public class BrowserCommands extends Base {
	String actualTitle,actualUrl,actualSource;
	public void basicCommands() {
		actualTitle = driver.getTitle();   //get title of actual page
		//System.out.println(actualTitle);
		actualUrl = driver.getCurrentUrl();  //get url of the actual page
		//System.out.println(actualUrl);
		actualSource = driver.getPageSource();
	}
	public void navigateCommands() { //throws InterruptedException {
		//driver.get("https://www.amazon.ae/");
	//	Thread.sleep(2000);    //not used usually, but wait must be used (never say in interview),it is a hard wait effects execution
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php"); //navigate to new webpage
	//	Thread.sleep(2000);  
		driver.navigate().back();     //load back the initial webpage
	//	Thread.sleep(2000);  
		driver.navigate().forward();   //goes again to the navigated webpage
	//	Thread.sleep(2000);  
		driver.navigate().refresh();
	}

	public static void main(String[] args) { //throws InterruptedException {
		BrowserCommands obj = new BrowserCommands();
		obj.initBrowser();
		obj.basicCommands();
		obj.navigateCommands();
		//obj.browserClose();
		obj.browserQuit();

	}

}
