package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetCSSValue extends BaseObs {
	@Test
	public void getCSSBgColor() {
		String bgColor, expBgClr="rgba(0, 123, 255, 1)";
		Boolean flag=false;
		bgColor= driver.findElement(By.xpath("//button[@id='button-one']")).getCssValue("background-color");
		if(expBgClr.equals(bgColor)) {
			flag=true;
		}
		Assert.assertTrue(flag, "Expected and actual background color are not equal");
		/*Point location= driver.findElement(By.xpath("//button[@id='button-one']")).getLocation();
		int locationY=location.getY();
		int locationX=location.getX();*/	
	}
	@Test
	public void getColor() {
		String color, expColor="rgba(255, 255, 255, 1)";
		Boolean flag=false;
		color= driver.findElement(By.xpath("//button[@id='button-one']")).getCssValue("color");
		if(expColor.equals(color)) {
			flag=true;
		}
		Assert.assertTrue(flag,"Text color expected and actual are not equal");
	}
	@Test
	public void compareLocation() {
		Point location,locationNxt;
		Boolean flag=false;
		location= driver.findElement(By.xpath("//button[@id='button-one']")).getLocation();
		int locationY=location.getY();
		locationNxt=driver.findElement(By.xpath("//div[@id='message-one']")).getLocation();
		int locationNxtY=locationNxt.getY();
		if(locationNxtY>locationY) {
			flag=true;
		}
		Assert.assertTrue(flag, "Your Message is located above Show Message Button");
	}
}
