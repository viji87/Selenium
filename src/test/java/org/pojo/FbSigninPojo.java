package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.Baseclass;

public class FbSigninPojo extends Baseclass{
	public FbSigninPojo() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "u_0_0_ZL")
	private WebElement CreateNewAcct;
	
	@FindBy(name="firstname")
	private WebElement fname;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement sname;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd;

	public WebElement getCreateNewAcct() {
		return CreateNewAcct;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getSname() {
		return sname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPwd() {
		return pwd;
	}
	
	
	

}
