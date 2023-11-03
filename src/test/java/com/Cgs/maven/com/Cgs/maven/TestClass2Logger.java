package com.Cgs.maven.com.Cgs.maven;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import sampleProj.util.LoggerClass;

import org.apache.commons.logging.Log;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Logger;


public class TestClass2Logger {
	static WebDriver d;
	
	
	Logger log = LoggerClass.getLog(TestClass2Logger.class);
	
	
	@Test
	public void test1() {
	d = new ChromeDriver();
	log.info("Browser opened");
	d.get("https://www.google.com");
	log.info("Sampledata");
	System.out.println(d.getTitle());
	System.out.println("This is Test Case");
	d.quit();
	}
	
	//@Test
	public void test2() {
	d = new EdgeDriver();
	d.get("https://www.google.com");
	System.out.println(d.getTitle());
	System.out.println("This is Test Case");
	d.quit();
}
	
}