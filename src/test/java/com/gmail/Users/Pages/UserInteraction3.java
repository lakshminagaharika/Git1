package com.gmail.Users.Pages;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.gmail.Users.Config.Reports;
public class UserInteraction3 {
	

 

	private WebDriver driver;
	private WebDriverWait wait;
	ExtentTest test;
	
//	Base base;
	public UserInteraction3(WebDriver driver,ExtentTest test) {
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		this.test=test;
		PageFactory.initElements(driver, this);
	}
//	public void setup() {
//		driver = new ChromeDriver();
//		driver.get("https://demo.guru99.com/test/newtours/");
//	}
//	public WebDriver getdriver() {
//		
//		return driver;
//	}
	WebElement username = driver.findElement(By.name("userName"));
	WebElement paswd = driver.findElement(By.name("password"));
	WebElement submit = driver.findElement(By.name("submit"));
	
	@SuppressWarnings("unused")
	public  void getUsername(String User) {
		boolean actResult = true;
		try {
			wait.until(ExpectedConditions.visibilityOf(username));
			Reports.generateReport(driver, test, Status.PASS, "Username found");
			username.sendKeys(User);
		}catch(TimeoutException te) {
			actResult = false;
			Reports.generateReport(driver, test, Status.FAIL, "Username not interacting...");
		}
		
	    }
	 
 

	public void getPassword(String pwd) {
		
		boolean actResult = true;
		try {
			wait.until(ExpectedConditions.visibilityOf(username));
			Reports.generateReport(driver, test, Status.PASS, "Username found");
			paswd.sendKeys(pwd);
		}catch(TimeoutException te) {
			actResult = false;
			Reports.generateReport(driver, test, Status.FAIL, "Username not interacting...");
		}
		
	}
	public void getSubmitButton() {
		submit.click();
	}
	public boolean run(String ExpectedResult) throws TimeoutException {
		boolean actResult = true;
	   	 WebElement success = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
		 wait.until(ExpectedConditions.visibilityOf(success));
		 if(success.getText().matches("Login Successfully"))
		 {
			Reports.generateReport(driver, test, Status.PASS, "Valid User");
		 }
		 else
		 {
			actResult = false;
		    Reports.generateReport(driver, test, Status.FAIL, "Invalid User");
		 }
	   	 return actResult;
	    }
	
 
}
 
 


