package com.sel.mav;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class First {
	
	WebDriver driver;
	@BeforeClass
	public void before(){
		
		System.setProperty("webdriver.chrome.driver","F:\\Study\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@Test
	public void asert(){
		
		//default timeouts for wait is 250ms
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("kishan");
		
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,6);
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		System.out.println(ele.getAttribute("value"));
	    String title = driver.getTitle();
	    System.out.println(title);
	}
	@Test
	public void sy(){
		System.out.println("assert complete");
	}
	
	@Test
	public void asser_a(){
		String a = "a";
		System.out.println(a);
	}
	@AfterClass
	public void after(){
		
		driver.quit();
	}

}
