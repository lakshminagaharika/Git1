package com.User.Runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = ".\\src\\test\\java\\com\\gmail\\Users\\Features\\login.feature",
		glue = "com.gmail.Users.StepDef",
		//tags = ("@TC1 or @TC2")
		//tags="@loginFea and @B2"
		//tags="@TC4",
		plugin = {"pretty" , "html:Reports/cucumber-reports.html"}
		)

public class TestRunner2 extends AbstractTestNGCucumberTests {

}
