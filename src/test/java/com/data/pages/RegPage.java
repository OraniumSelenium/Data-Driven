package com.data.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.aventstack.extentreports.Status;
import com.data.test.TestExecutor;

public class RegPage extends TestExecutor{
	
	public static By FirstName = By.xpath("//input[@placeholder='First Name']");
	
	public static By LastName = By.xpath("//input[@placeholder='Last Name']");
	public static By Address = By.tagName("textar");
	
	public static By EmailAddress = By.xpath("//input[@ng-model='EmailAdress']");
	
	public static By PhonenNumber = By.xpath("//input[@ng-model='Phone']");
	
	
	public void enterFrstName() throws IOException
	{
	
		com.enterValue(FirstName, excel.getData("FirstName"),"First Name");
	}
	
	public void enterLastName() throws IOException
	{
		com.enterValue(LastName, excel.getData("LastName"),"Last Name");
	}
	
	public void enterAddress() throws IOException
	{
		com.enterValue(Address, excel.getData("Address"),"Address");
	}
	
	public void enterEmailAddress() throws IOException
	{
		com.enterValue(EmailAddress, excel.getData("Email"),"Email");
	}
	
	public void enterPhonenum() throws IOException
	
	{
		com.enterValue(PhonenNumber, excel.getData("PhoneNumber"),"Phone");
	}

}
