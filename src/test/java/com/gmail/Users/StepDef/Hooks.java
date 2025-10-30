package com.gmail.Users.StepDef;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
// import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.gmail.Users.Config.Base;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks extends Base{
	//WebDriver driver;
//		Base base;
//		
//		public Hooks(Base base)// constructor -- base class reference
//		{
//			this.base =base;
//		}	
//	@BeforeAll
//	public static void beforeAll()
//	{
//		System.out.println("Before all...");
//	}
//	@AfterAll
//	public static void afterAll()
//	{
//		System.out.println("afterall...");
//	}
//		@Before
//		public void setup()
//		{		
//			System.out.println("Before Started...");
////			base.driver = new ChromeDriver();
////			test = extReports.createTest(scenario.getName());
////			LaunchBrowser();// driver Initialization
//		}
//		
//		@After
//		public void tearDown()
//		{
//			System.out.println("After started...");
////			base.driver.close();
//		}
    public static ExtentSparkReporter spark;
    public static ExtentReports extReports;
    public static ExtentTest test;

 
    @BeforeAll
    public static void beforeAll() {
        
        spark = new ExtentSparkReporter(".\\reports\\ExtentReport.html");
        extReports = new ExtentReports();
        extReports.attachReporter(spark);
    }
 
    @AfterAll
    public static void afterAll() {
        
        extReports.flush();
    }
 
    @Before
    public void beforeScenario(Scenario scenario) {
          test = extReports.createTest(scenario.getName());
       launchBrowser();
    }
      
 
    @After
    public void afterScenario() {
        
//        sleep(4000);
//        driver.quit();
    }
 

}
