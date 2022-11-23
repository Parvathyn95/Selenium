package com.obsqura.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JquerySelect2Dropdown extends BaseObs{
	@Test(description = "Compare heading of actual and expected heading")
	public void headingDropdownWithSearchBox() {
		String expectedHeading = "Drop Down with Search box",actualHeading;
		WebElement jquery = driver.findElement(By.linkText("Jquery Select2"));
		jquery.click();
		actualHeading = driver.findElement(By.xpath("(//div[@class='card-header'])[2]")).getText();
		Assert.assertEquals(expectedHeading, actualHeading, "Actual and expected messages are not the same");
	}
	@Test(description = "Select one option among the dropdown")
	public void selectOneOptionDropDown() {
		int stateElementSize;
		String inputHeader,expectedHeader="States";
		String expectedState = "Nevada";
		driver.navigate().to("https://selenium.obsqurazone.com/jquery-select.php");
		inputHeader = driver.findElement(By.xpath("//label[@for='inputEmail4']")).getText();
		Assert.assertEquals(inputHeader, expectedHeader, "Actual and expected header not equal");
		Select optionSelect = new Select(driver.findElement(By.xpath("(//select[@aria-hidden='true'])[1]")));
		optionSelect.selectByVisibleText("Nevada");
		List<WebElement> stateElements = optionSelect.getOptions();
		stateElementSize = stateElements.size();
		Assert.assertEquals(stateElements.get(3).getText(), expectedState,"Actual and Expected state are not equal");
		Assert.assertNotNull(stateElementSize, "List of dropdownElements are null");
	}
	@Test(description = "Compare heading of actual and expected heading")
	public void headingSelectMultipleValues() {
		String expectedHeading = "Select Multiple Values",actualHeading;
		WebElement jquery = driver.findElement(By.linkText("Jquery Select2"));
		jquery.click();
		actualHeading = driver.findElement(By.xpath("(//div[@class='card-header'])[3]")).getText();
		Assert.assertEquals(expectedHeading, actualHeading, "Actual and expected messages are not the same");
	}
	@Test(description = "Select one option among the dropdown")
	public void selectAndDeselectMultipleValueDropDown() {
		int stateElementSize,stateElementSizeNew;
		String inputHeader,expectedHeader="States";
		driver.navigate().to("https://selenium.obsqurazone.com/jquery-select.php");
		inputHeader = driver.findElement(By.xpath("//label[@for='inputEmail4']")).getText();
		Assert.assertEquals(inputHeader, expectedHeader, "Actual and expected header not equal");
		Select optionSelect = new Select(driver.findElement(By.xpath("(//select[@aria-hidden='true'])[2]")));
		optionSelect.selectByVisibleText("Nevada");
		optionSelect.selectByVisibleText("Oregon");
		optionSelect.selectByVisibleText("Idaho");
		optionSelect.selectByVisibleText("Wyoming");
		List<WebElement> stateElements = optionSelect.getAllSelectedOptions();
		stateElementSize = stateElements.size();
		Assert.assertNotNull(stateElementSize, "List of dropdownElements are null");
		optionSelect.deselectByVisibleText("Nevada");
		optionSelect.deselectByVisibleText("Oregon");
		optionSelect.deselectByVisibleText("Idaho");
		optionSelect.deselectByVisibleText("Wyoming");
		List<WebElement> stateElementsNew = optionSelect.getAllSelectedOptions();
		stateElementSizeNew = stateElementsNew.size();
		Assert.assertNotNull(stateElementSizeNew, "List of dropdownElements are not null");
	}
}
