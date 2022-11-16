package com.data.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;
import com.data.test.TestExecutor;

public class Common extends TestExecutor{
	
	
	public void clickElement(By loc) throws InterruptedException
	{
		try
		{
			WebElement ele = driver.findElement(loc);
			ele.click();
			Thread.sleep(2000);
			
			test.log(Status.PASS, "element clicked successfully");
		}
		catch(Exception e)
		{
			test.log(Status.FAIL, "Element not clicked");
		}
	}
	
	public void enterValue(By loc,String value,String element)
	{
		try
		{
		
			WebElement ele = driver.findElement(loc);
			ele.click();
			ele.clear();
			ele.sendKeys(value);
			
			test.log(Status.PASS, "Value entered successfully in "+element);
	
		}
		
		catch(Exception e) {
			test.log(Status.FAIL, "Value not entered in "+element);
		}
	}
	
	public void verifypagetitle()
	{
	String actuatlTitle =	driver.getTitle();
	}

}
