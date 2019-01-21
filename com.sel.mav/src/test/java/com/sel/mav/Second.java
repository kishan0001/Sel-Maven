package com.sel.mav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Second {
	
	
	WebDriver driver;
	@BeforeClass
	public void before(){
		
		System.setProperty("webdriver.chrome.driver","F:\\Study\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/?p=us");
	}

	@Test
	public void asert() throws InterruptedException{
		
		driver.findElement(By.xpath("//*[@id='uh-signin']")).click();
		driver.findElement(By.xpath("//*[@id='login-signin']")).click();
	    //Thread.sleep(5000);
		String num;
	    String err_text=driver.findElement(By.xpath("//p[@class='row error'][@role='alert']")).getAttribute("innerHTML");
	    System.out.println(err_text);
		Assert.assertTrue(err_text.contains("email"));
		System.out.println("it does");
		
	}
	@AfterClass
	public void after(){
		
		driver.quit();
	}


}
