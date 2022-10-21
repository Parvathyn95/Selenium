package com.obsqura.SeleniumFirefoxx;

public class SeleniumFirefoxx extends BaseTrial {
	String actTitle,actUrl;
	public void firefoxxBscCommands() {
		actTitle = driver.getTitle();
	//	System.out.println(actTitle);
		actUrl = driver.getCurrentUrl();
	//	System.out.println(actUrl);
	}

	public static void main(String[] args) {
		SeleniumFirefoxx obj = new SeleniumFirefoxx();
		obj.initBrowser();
		obj.firefoxxBscCommands();
		obj.firefoxClose();
	}

}
