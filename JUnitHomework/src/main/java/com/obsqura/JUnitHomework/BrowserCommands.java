package com.obsqura.JUnitHomework;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BrowserCommands extends Base {
	String actualTitle, actualUrl, actualSource, expTitle = "Obsqura Testing", expSource = "https";

	@Test
	public void titleEqual() {
		actualTitle = driver.getTitle();
		assertEquals(expTitle, actualTitle);
	}

	// Assert method
	@Test
	public void sourceEqual() {
		actualSource = driver.getPageSource();
		assertTrue(actualSource.contains(expSource));
	}

	// isEmpty method
	@Test
	public void sourceCheck() {
		if (driver.getPageSource().isEmpty()) {
			System.out.println("Actual Source contains Expected Source");
		} else {
			System.out.println("Actual Source doesnot contain Expected Source");
		}
	}

	// Contains method
	@Test
	public void sourceChecking() {
		actualSource = driver.getPageSource();
		if (actualSource.contains(expSource)) {
			System.out.println("Actual Source contains Expected Source");
		} else {
			System.out.println("Actual Source doesnot contain Expected Source");
		}
	}

}
