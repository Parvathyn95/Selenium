package com.obsqura.SeleniumEdge;

public class BrowserCommands extends BaseEdge {
	String actTitle,actUrl;
	public void bscCommands() {
		actTitle = driver.getTitle();
		System.out.println(actTitle);
		actUrl = driver.getCurrentUrl();
		System.out.println(actUrl);
	}

	public static void main(String[] args) {
		BrowserCommands obj = new BrowserCommands ();
		obj.initBrowser();
		obj.bscCommands();
		obj.edgeClose();

	}

}
