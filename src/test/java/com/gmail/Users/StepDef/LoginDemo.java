package com.gmail.Users.StepDef;
 
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.gmail.Users.Pages.UserInteraction3;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class LoginDemo {
	//static WebDriver driver;
	ExtentTest test = Hooks.test;
	UserInteraction3 obj;
	WebDriver driver = Hooks.driver;
	
	@Given("I navigate to login page")
	
	public void i_navigate_to_login_page() {
//		driver =new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/newtours/index.php");
	    obj= new UserInteraction3(driver,test);
	    
		//obj.appsetup();
		//driver = obj.getDriver();
		System.out.println("Page Opened");
	}
 
	@When("I entered {string} and {string}")
	public void i_entered_and(String string, String string2) throws TimeoutException {
//		
//		WebElement username=driver.findElement(By.name("userName"));
//		username.sendKeys(string);
//		
//		WebElement password=driver.findElement(By.name("password"));
//		password.sendKeys(string2);
//		
//		WebElement submit=driver.findElement(By.name("submit"));
//		submit.click();	
		obj.getUsername(string);
		obj.getPassword(string2);
		obj.getSubmitButton();
		
		System.out.println(string+" "+string2);
//		WebElement logintext=driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
//		
//		Assert.assertEquals(logintext.getText(),"Login Successfully");
//	    
//		System.out.println(string + ""+string2);
	}
	@Then("Itas navigated to the HomePage")
	public void itas_navigated_to_the_home_page() {
WebElement logintext=driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
		
		Assert.assertEquals(logintext.getText(),"Login Successfully");
		System.out.println("Login Successfully");
	}
	
	@Then("Itas navigated to the Error Message")
	public void itas_navigated_to_the_Error_Message() {
	    
		
WebElement logintext=driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
		
		Assert.assertEquals(logintext.getText(),"Enter your userName and password correct");
		System.out.println("Login failed");
	}
	
	@And("I entered username and password")
	public void i_entered_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("correct credentials");
	}
	@And("I clicked signin button")
	public void i_clicked_signin_button() {
	   
		System.out.println("signin button clicked");
	}
	
	
	@And("I entered correct username")
	public void i_entered_correct_username() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("correct username");
	}
	
	@But("Invalid pwd")
	public void Invalid_pwd() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Incorrect Password");
	}
	
 
	
	@When("I entered following details")
	public void i_entered_following_details(DataTable dataTable) throws TimeoutException {
		
		List<List<String>> ele=dataTable.cells();
		for(int i=1;i<ele.size();i++)
		{
		String user=ele.get(i).get(0);
		String pwd=ele.get(i).get(1);
		
//		WebElement username=driver.findElement(By.name("userName"));
//		username.sendKeys(user);
//			
//		WebElement password=driver.findElement(By.name("password"));
//		password.sendKeys(pwd);
//		
//		WebElement submit=driver.findElement(By.name("submit"));
//		submit.click();	
		obj.getUsername(user);
		obj.getPassword(pwd);
		obj.getSubmitButton();
		
		System.out.println(user+" "+pwd);
		
	
		}
			
	   
	}
	
		@When("I insert {string} and {string}")
		public void i_insert_and(String user, String pwd) throws TimeoutException {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
			System.out.println(user+" "+pwd);
			obj.getUsername(user);
			obj.getPassword(pwd);
			obj.getSubmitButton();
//			WebElement username=driver.findElement(By.name("userName"));
//			username.sendKeys(user);
//				
//			WebElement password=driver.findElement(By.name("password"));
//			password.sendKeys(pwd);
//			
//			WebElement submit=driver.findElement(By.name("submit"));
//			submit.click();	
			
		}

//		@Then("Its navigated to the home page")
//		public void its_navigated_to_the_home_page() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
		
		@Then("Itas navigated to the home page {string}")
		public void its_navigated_to_the_home_page(String expectedResult) throws TimeoutException {
//			if(expectedResult.equals("Login Successfully")) {
//				System.out.println("Login Successfully");
//				WebElement logintext=driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
//				//System.out.println(logintext.getText());
//				Assert.assertEquals(logintext.getText(),"Login Successfully");
//			}else if(expectedResult.equals("Enter your userName and password correct")) {
//				System.out.println("No Login Successfully");
//				WebElement errtext=driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
//				//System.out.println(logintext.getText());
//				Assert.assertEquals(errtext.getText(),"Enter your userName and password correct");
//				
//			}	
			boolean s1 = obj.run(expectedResult);
			Assert.assertTrue(s1);
		
		}
		public void it_got_navigated_to_the_home_page(String ex) {
			 
	    	try {
	    	    Object obj2;
				boolean result = obj2.run(ex);
	    	    Assert.assertTrue(result);
	    	    System.out.println("Success..");
	    	} catch (AssertionError ae) {
	    	    System.out.println("Failure... Assertion failed: ");
	    	}
		    	
	        
	    }
}
	 
		
 
 
