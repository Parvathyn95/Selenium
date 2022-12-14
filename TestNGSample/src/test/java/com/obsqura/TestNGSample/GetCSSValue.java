package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetCSSValue extends BaseObs {
	@Test
	public void getCSSBgColor() {
		String bgColor, expBgClr="rgba(0, 123, 255, 1)";
		bgColor= driver.findElement(By.xpath("//button[@id='button-one']")).getCssValue("background-color");
		Assert.assertEquals(expBgClr, bgColor);
	}
	@Test
	public void getCSSColor() {
		String color, expColor="rgba(255, 255, 255, 1)";
		color= driver.findElement(By.xpath("//button[@id='button-one']")).getCssValue("color");
		Assert.assertEquals(expColor, color);
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
	@Test
	public void getAttribute() {
		String id,className,type,expId="button-one",expClass="btn btn-primary",expType="button";
		id=driver.findElement(By.xpath("//button[@id='button-one']")).getAttribute("id");
		Assert.assertEquals(expId, id, "Expected and actual id are not the same");
		className=driver.findElement(By.xpath("//button[@id='button-one']")).getAttribute("class");
		Assert.assertEquals(expClass, className, "Expected and actual class names are not the same");
		type=driver.findElement(By.xpath("//button[@id='button-one']")).getAttribute("type");
		Assert.assertEquals(expType, type, "Expected and actual type are not the same");
	}
	@Test
	public void getTagName() {
		String tagName,expTagname="button";
		tagName=driver.findElement(By.xpath("//button[@id='button-one']")).getTagName();
		Assert.assertEquals(expTagname, tagName,"Expected and actual tagnames are not the same");
	}
	@Test
	public void getSize() {
		Dimension size;
		String expSize="(136, 38)",actSize;
		Boolean flag=false;
		size=driver.findElement(By.xpath("//button[@id='button-one']")).getSize();
		actSize=String.valueOf(size);
		Assert.assertEquals(expSize, actSize, "Expected and Actual size are not equal");
	}
	@Test
	public void enDisSel() {
		
		WebElement button = driver.findElement(By.xpath("//button[@id='button-one']"));
			if(button.isEnabled()) {
			}
			Assert.assertTrue(button.isEnabled(), "Button is not enabled");
		
			if(button.isDisplayed()) {
			
			}
			Assert.assertTrue(button.isDisplayed(), "Button is not displayed");
		
			if(button.isSelected()) {
			
			}
			Assert.assertFalse(button.isSelected(), "Button is already selected");
	}
}
