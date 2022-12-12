package com.anm.Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import demopackage.Login;

public class FirstTest {
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-java-2022\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
//	@Test
//	public void CheckOut() throws InterruptedException {
//		
//		
//		Login login = new Login(driver);
//		login.doLogin();
//		login.orderProduct();
//		login.doCheckout();
//		login.doPayment();
////		WebElement logout = driver.findElement(By.linkText("Log out"));
////		String text = logout.getText();
////		Assert.assertEquals(text, "Log out");
////		
//		WebElement verify_1 = driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
//		String text = verify_1.getText();
//		Assert.assertEquals(text, "Your order has been successfully processed!");
//		Thread.sleep(5000);
//		
//	}
	
	
	
	@Test(priority = 1)
	public void Login() {
		Login login = new Login(driver);
		login.doLogin();
		
	}
	
	@Test(priority = 2)
	public void OrderProduct() throws InterruptedException {
		Login login = new Login(driver);
		login.orderProduct();
		
	}
	
	@Test(priority = 3)
	public void DoCheckout() throws InterruptedException {
		Login login = new Login(driver);
		login.doCheckout();
		
	}
	
	@Test(priority = 4)
	public void DoPayment() throws InterruptedException {
		Login login = new Login(driver);
		login.doPayment();
	}
	
	@Test(priority = 5)
	public void PostCondition() throws InterruptedException {

		
		WebElement verify_1 = driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
		String text = verify_1.getText();
		Assert.assertEquals(text, "Your order has been successfully processed!");
		
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
