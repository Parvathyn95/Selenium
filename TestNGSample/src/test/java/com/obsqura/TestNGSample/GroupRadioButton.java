package com.obsqura.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupRadioButton extends BaseObs {
	@Test(description="Gender radio button disabled, Get results clicked, Message compared")
	public void patientGenderCheck() {
		String expText="Pateints Gender",actText,actMsg,expMsg="Gender :\nAge group:";
		Boolean sel1,sel2,getSel,msgFlag=false;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		actText=driver.findElement(By.xpath("//h4[text()='Pateints Gender']")).getText();
		Assert.assertEquals(actText, expText);
		WebElement male = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		sel1=male.isSelected();
		sel2=female.isSelected();
		if(sel1==false && sel2==false) {
			msgFlag=true;
			WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
			getSel=getResult.isSelected();
			if(getSel==false) {
				msgFlag=true;
				getResult.click();
				actMsg=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
				Assert.assertEquals(actMsg, expMsg);
		  }
		   Assert.assertTrue(msgFlag, "Get Result Button is already selected");
		}
		Assert.assertTrue(msgFlag, "Radio button is already selected");
	}
	@Test(description="AgeGroup radio button disabled, Get results clicked, Message compared")
	public void patientAgeGroupCheck() {
		String expText="Pateints Age Group",actText,actMsg,expMsg="Gender :\nAge group:";
		Boolean sel1,sel2,sel3,getSel,msgFlag=false;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		actText=driver.findElement(By.xpath("//h4[text()='Pateints Age Group']")).getText();
		Assert.assertEquals(actText, expText);
		WebElement ageOne = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		WebElement ageTwo = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		WebElement ageThree = driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		sel1=ageOne.isSelected();
		sel2=ageTwo.isSelected();
		sel3=ageThree.isSelected();
		if(sel1==false && sel2==false && sel3==false) {
			msgFlag=true;
			WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
			getSel=getResult.isSelected();
			if(getSel==false) {
				msgFlag=true;
				getResult.click();
				actMsg=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
				Assert.assertEquals(actMsg, expMsg);
		  }
		   Assert.assertTrue(msgFlag, "Get Result Button is already selected");
		}
		Assert.assertTrue(msgFlag, "Radio button is already selected");
	}
	@Test(description="Male is selected, agegroup no selection, message check")
	public void patientMaleOnly() {
		String expMsg="Gender : Male\nAge group:",actMsg,inpGendLabel;
		Boolean maleSel,getMale,selFlag=false;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement male = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		maleSel=male.isSelected();
		if(maleSel==false) {
			selFlag=true;
			male.click();
			WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
			getMale=getResult.isSelected();
			if(getMale==false) {
				selFlag=true;
				getResult.click();
				inpGendLabel=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).getText();
				Assert.assertEquals(expMsg, "Gender : "+inpGendLabel+"\nAge group:");
			}
			Assert.assertTrue(selFlag, "Get Results button already selected");
		}
		Assert.assertTrue(selFlag, "Male radiobutton already selected");
	}
	@Test(description="Female is selected, agegroup no selection, message check")
	public void patientFemaleOnly() {
		String expMsg="Gender : Female\nAge group:",actMsg,inpGendLabel;
		Boolean femaleSel,getFemale,selFlag=false;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement female = driver.findElement(By.xpath("//label[@for='inlineRadio21']"));
		femaleSel=female.isSelected();
		if(femaleSel==false) {
			selFlag=true;
			female.click();
			if(female.isSelected()) {
				WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
				getFemale=getResult.isSelected();
				if(getFemale==false){
				selFlag=true;
				getResult.click();
				inpGendLabel = driver.findElement(By.xpath("//label[@for='inlineRadio21']")).getText();
				Assert.assertEquals(expMsg, "Gender : "+inpGendLabel+"\nAge group:");	
			    }
			Assert.assertTrue(selFlag, "Get Results button is already selected");
		   }
		Assert.assertTrue(selFlag, "Female Radiobutton is already selected");
	  }
	}
	@Test(description="Gender not selected, agegroup first selection, message check")
	public void firstAgeGroupOnly() {
		String expMsg="Gender :\nAge group: 1 to 18",actMsg,inpAgeLabel;
		Boolean ageSel,getAge,selFlag=false;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement age = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		ageSel=age.isSelected();
		if(ageSel==false) {
			selFlag=true;
			age.click();
			WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
			getAge=getResult.isSelected();
			if(getAge==false) {
				selFlag=true;
				getResult.click();
				inpAgeLabel = driver.findElement(By.xpath("//label[@for='inlineRadio22']")).getText();
				Assert.assertEquals(expMsg, "Gender :\nAge group: "+inpAgeLabel);
			}
			Assert.assertTrue(selFlag, "Get Result button already selected");
		}
		Assert.assertTrue(selFlag, "Age Radiobutton already selected");
	}
	@Test(description="Gender not selected, agegroup second selection, message check")
	public void secondAgeGroupOnly() {
		String expMsg="Gender :\nAge group: 19 t0 44",actMsg,inpAgeLabel;
		Boolean ageSel,getAge,selFlag=false;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement age = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		ageSel=age.isSelected();
		if(ageSel==false) {
			selFlag=true;
			age.click();
			WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
			getAge=getResult.isSelected();
			if(getAge==false) {
				getResult.click();
				inpAgeLabel = driver.findElement(By.xpath("//label[@for='inlineRadio23']")).getText();
				Assert.assertEquals(expMsg, "Gender :\nAge group: "+inpAgeLabel);
			}
			Assert.assertTrue(selFlag, "Get Result button already selected");
		}
		Assert.assertTrue(selFlag, "Age Radiobutton already selected");
	 }
	@Test(description="Gender not selected, agegroup third selection, message check")
	public void thirdAgeGroupOnly() {
		String expMsg="Gender :\nAge group: 45 to 60",actMsg,inpAgeLabel;
		Boolean ageSel,getAge,selFlag=false;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement age = driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		ageSel=age.isSelected();
		if(ageSel==false) {
			selFlag=true;
			age.click();
			WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
			getAge=getResult.isSelected();
			if(getAge==false) {
				getResult.click();
				inpAgeLabel = driver.findElement(By.xpath("//label[@for='inlineRadio24']")).getText();
				Assert.assertEquals(expMsg, "Gender :\nAge group: "+inpAgeLabel);
			}
			Assert.assertTrue(selFlag, "Get Result button already selected");
		}
		Assert.assertTrue(selFlag, "Age Radiobutton already selected");
	 }
	@Test(description="Male selected, agegroup first selection, message check")
	public void maleFirstAgeGroupOnly() {
		String expMsg="Gender : Male\nAge group: 1 to 18",actMsg,inpGendLabel,inpAgeLabel;
		Boolean maleSel,ageSel,getAge,selFlag=false;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement male = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		maleSel=male.isSelected();
		WebElement age = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		ageSel=age.isSelected();
		if(maleSel==false&&ageSel==false) {
			selFlag=true;
			age.click();
			WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
			getAge=getResult.isSelected();
			if(getAge==false) {
				getResult.click();
				inpGendLabel=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).getText();
				inpAgeLabel = driver.findElement(By.xpath("//label[@for='inlineRadio22']")).getText();
				Assert.assertEquals(expMsg, "Gender : "+inpGendLabel+"\nAge group: "+inpAgeLabel);
			}
			Assert.assertTrue(selFlag, "Get Result button already selected");
		}
		Assert.assertTrue(selFlag, "Age Radiobutton already selected");
	 }
	@Test(description="Male selected, agegroup second selection, message check")
	public void maleSecondAgeGroupOnly() {
		String expMsg="Gender : Male\nAge group: 19 t0 44",actMsg,inpGendLabel,inpAgeLabel;
		Boolean maleSel,ageSel,getAge,selFlag=false;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement male = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		maleSel=male.isSelected();
		WebElement age = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		ageSel=age.isSelected();
		if(maleSel==false&&ageSel==false) {
			selFlag=true;
			age.click();
			WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
			getAge=getResult.isSelected();
			if(getAge==false) {
				getResult.click();
				inpGendLabel=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).getText();
				inpAgeLabel = driver.findElement(By.xpath("//label[@for='inlineRadio23']")).getText();
				Assert.assertEquals(expMsg, "Gender : "+inpGendLabel+"\nAge group: "+inpAgeLabel);
			}
			Assert.assertTrue(selFlag, "Get Result button already selected");
		}
		Assert.assertTrue(selFlag, "Age Radiobutton already selected");
	 }
	@Test(description="Male selected, agegroup third selection, message check")
	public void maleThirdAgeGroupOnly() {
		String expMsg="Gender : Male\nAge group: 45 to 60",actMsg,inpGendLabel,inpAgeLabel;
		Boolean maleSel,ageSel,getAge,selFlag=false;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement male = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		maleSel=male.isSelected();
		WebElement age = driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		ageSel=age.isSelected();
		if(maleSel==false&&ageSel==false) {
			selFlag=true;
			age.click();
			WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
			getAge=getResult.isSelected();
			if(getAge==false) {
				getResult.click();
				inpGendLabel=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).getText();
				inpAgeLabel = driver.findElement(By.xpath("//label[@for='inlineRadio24']")).getText();
				Assert.assertEquals(expMsg, "Gender : "+inpGendLabel+"\nAge group: "+inpAgeLabel);
			}
			Assert.assertTrue(selFlag, "Get Result button already selected");
		}
		Assert.assertTrue(selFlag, "Age Radiobutton already selected");
	 }
	@Test(description="Female selected, agegroup first selection, message check")
	public void femaleFirstAgeGroupOnly() {
		String expMsg="Gender : Female\nAge group: 1 to 18",actMsg,inpGendLabel,inpAgeLabel;
		Boolean femaleSel,ageSel,getAge,selFlag=false;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		femaleSel=female.isSelected();
		WebElement age = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		ageSel=age.isSelected();
		if(femaleSel==false&&ageSel==false) {
			selFlag=true;
			age.click();
			WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
			getAge=getResult.isSelected();
			if(getAge==false) {
				getResult.click();
				inpGendLabel=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).getText();
				inpAgeLabel = driver.findElement(By.xpath("//label[@for='inlineRadio22']")).getText();
				Assert.assertEquals(expMsg, "Gender : "+inpGendLabel+"\nAge group: "+inpAgeLabel);
			}
			Assert.assertTrue(selFlag, "Get Result button already selected");
		}
		Assert.assertTrue(selFlag, "Age Radiobutton already selected");
	 }
	@Test(description="Female selected, agegroup second selection, message check")
	public void femaleSecondAgeGroupOnly() {
		String expMsg="Gender : Female\nAge group: 19 t0 44",actMsg,inpGendLabel,inpAgeLabel;
		Boolean femaleSel,ageSel,getAge,selFlag=false;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		femaleSel=female.isSelected();
		WebElement age = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		ageSel=age.isSelected();
		if(femaleSel==false&&ageSel==false) {
			selFlag=true;
			age.click();
			WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
			getAge=getResult.isSelected();
			if(getAge==false) {
				getResult.click();
				inpGendLabel=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).getText();
				inpAgeLabel = driver.findElement(By.xpath("//label[@for='inlineRadio23']")).getText();
				Assert.assertEquals(expMsg, "Gender : "+inpGendLabel+"\nAge group: "+inpAgeLabel);
			}
			Assert.assertTrue(selFlag, "Get Result button already selected");
		}
		Assert.assertTrue(selFlag, "Age Radiobutton already selected");
	 }
	@Test(description="Female selected, agegroup third selection, message check")
	public void femaleThirdAgeGroupOnly() {
		String expMsg="Gender : Female\nAge group: 45 to 60",actMsg,inpGendLabel,inpAgeLabel;
		Boolean femaleSel,ageSel,getAge,selFlag=false;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		femaleSel=female.isSelected();
		WebElement age = driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		ageSel=age.isSelected();
		if(femaleSel==false&&ageSel==false) {
			selFlag=true;
			age.click();
			WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
			getAge=getResult.isSelected();
			if(getAge==false) {
				getResult.click();
				inpGendLabel=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).getText();
				inpAgeLabel = driver.findElement(By.xpath("//label[@for='inlineRadio24']")).getText();
				Assert.assertEquals(expMsg, "Gender : "+inpGendLabel+"\nAge group: "+inpAgeLabel);
			}
			Assert.assertTrue(selFlag, "Get Result button already selected");
		}
		Assert.assertTrue(selFlag, "Age Radiobutton already selected");
	 }
}
