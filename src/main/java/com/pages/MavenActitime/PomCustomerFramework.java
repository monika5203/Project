package com.pages.MavenActitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gnerics.MavenActitime.AutoConstant;
import com.gnerics.MavenActitime.ExcelLibrary;

public class PomCustomerFramework implements AutoConstant {
public WebDriver driver;
	
	@FindBy(id="container_tasks")
	private WebElement taskfield;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewbutton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
   private WebElement createcustomerbutton;
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	   private WebElement customernametextfield;
	
	@FindBy(xpath="//div[.='Create Customer']")
	   private WebElement submitbutton;
	
	

	public PomCustomerFramework(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void entercustomerdetails() throws IOException
	{
		 taskfield.click();
		 addnewbutton.click();
		 createcustomerbutton.click();
		 customernametextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname1, 1, 0));
	}
	
	
}
