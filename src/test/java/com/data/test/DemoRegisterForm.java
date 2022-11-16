package com.data.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class DemoRegisterForm extends TestExecutor{
	
	@Test
	public void register() throws IOException
	{
		test = report.createTest("Registration Form");
		
		test.log(Status.INFO, "Test case started");
		
		reg.enterFrstName();
		reg.enterLastName();
		reg.enterAddress();
		reg.enterEmailAddress();
		reg.enterPhonenum();
		
		test.log(Status.PASS, "Test case completed successfully");
		
	}
	
	/*@Test
	public void test() throws IOException
	{
		test = report.createTest("Test");
		test.log(Status.INFO, "Info");
		test.log(Status.PASS, "Test case completed successfully");
		test.log(Status.FAIL, "Test case failed");
		reg.enterFrstName();
		reg.enterLastName();
	}*/

}
