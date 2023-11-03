package com.Cgs.maven.com.Cgs.maven;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestClass {
	static WebDriver d;

	@Test
	public void test1() {
	d = new ChromeDriver();
	d.get("https://www.google.com");
	System.out.println(d.getTitle());
	System.out.println("This is Test Case");
	d.quit();
	}
	
	@Test
	public void test2() {
	d = new EdgeDriver();
	d.get("https://www.google.com");
	System.out.println(d.getTitle());
	System.out.println("This is Test Case");
	d.quit();
}
	//@Test
	public void readDataFromExcel() throws Exception {
		FileInputStream fis = new FileInputStream(".//DataFiles//LoginData.xlsx//");
		XSSFWorkbook wb = new  XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Login");
	}
}