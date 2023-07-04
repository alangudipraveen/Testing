package com.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trail {

	public static WebDriver driver;

	@BeforeClass
	public void launchbrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// driver.get("https://www.google.com/");

	}

	@Test
	public void test1() {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("iphone", Keys.ENTER);
		System.out.println(driver.getTitle());
	
	}

	@Test
	public void test2() {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("redme", Keys.ENTER);
		System.out.println(driver.getTitle());
	}

	@Test
	public void test3() {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("xiomi", Keys.ENTER);
		System.out.println(driver.getTitle());
	}

	@AfterClass
	public void tearDown() {
		driver.quit();

	}

}