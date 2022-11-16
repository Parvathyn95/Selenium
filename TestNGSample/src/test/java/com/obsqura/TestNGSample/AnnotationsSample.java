package com.obsqura.TestNGSample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsSample {
	@BeforeTest
		public void beforeTestSample() {
			System.out.println("Before Test");
		}
	@AfterTest
		public void afterTestSample() {
			System.out.println("After Test");
		}
	@BeforeMethod
		public void beforeMethodSample() {
			System.out.println("Before Method");
		}
	@AfterMethod
		public void afterMethodSample() {
			System.out.println("After Method");
		}
	@Test
	public void testSample() {
		System.out.println("Test");
	}
	@BeforeClass
		public void beforeClassSample() {
			System.out.println("Before Class");
		}
	@AfterClass
		public void afterClassSample() {
			System.out.println("After Class");
		}
	@BeforeSuite
		public void beforeSuiteSample() {
			System.out.println("Before Suite");
		}
	@AfterSuite
		public void afterSuiteSample() {
			System.out.println("After Suite");
        }
}
