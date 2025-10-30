package com.gmail.Users.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class UserInteraction2 {
	private WebDriver driver;
	private ExtentTest test;

	//	Base base;
	public UserInteraction2(WebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement username;
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	private WebElement password;
	@FindBy(how=How.XPATH,using="//input[@name='confirmPassword']")
	private WebElement confirmPassword;
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	private WebElement FirstName;
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	private WebElement LastName;
	@FindBy(how=How.XPATH,using="//input[@name='phone']")
	private WebElement Phone;
	@FindBy(how=How.XPATH,using="//input[@id='userName']")
	private WebElement email;
	
	public void appsetup() {
		driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
	}
	public void getUsername(String username) {
		WebElement userName=driver.findElement(By.name("userName"));
		userName.sendKeys(username);
	}
	public void getPassword(String pwd)
	{
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys(pwd);
	}
	public void getSubmitButton() {
		WebElement submit=driver.findElement(By.name("submit"));
		submit.click();	
	}
	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
	}
 

}
