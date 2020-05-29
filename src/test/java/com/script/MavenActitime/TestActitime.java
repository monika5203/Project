package com.script.MavenActitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.gnerics.MavenActitime.BaseTest;
import com.pages.MavenActitime.PomCustomerFramework;
import com.pages.MavenActitime.PomFramework;



public class TestActitime extends BaseTest{

	@Test
	
	public void login() throws IOException 
	{
		PomFramework f=new PomFramework(driver);
		f.enterlogindetails();
		PomCustomerFramework w=new PomCustomerFramework(driver);
		w.entercustomerdetails();
	}
}
