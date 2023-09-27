package com.TestCases;

import org.testng.annotations.Test;

import com.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass
{
	
	@Test
	public void loginTest()
	{
		
		driver.manage().window().maximize();
		
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		
		lp.clicksubmit();
		
		if(driver.getTitle().equals(" Guru99 Bank Manager HomePage "))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}


}
