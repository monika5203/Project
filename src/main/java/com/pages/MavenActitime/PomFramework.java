package com.pages.MavenActitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gnerics.MavenActitime.AutoConstant;
import com.gnerics.MavenActitime.ExcelLibrary;



public class PomFramework implements AutoConstant{

	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernametextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwdtextfield;
	
	@FindBy(xpath="//div[.='Login ']")
   private WebElement loginbutton;
	
	public PomFramework(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterlogindetails() throws IOException
	{
		usernametextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1,0));
		
		pwdtextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 1));
		
		loginbutton.click(); 
	}
	
	
}
