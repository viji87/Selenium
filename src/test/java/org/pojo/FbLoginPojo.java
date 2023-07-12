package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.Baseclass;

public class FbLoginPojo extends Baseclass{
	
	public FbLoginPojo() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(xpath = "//input[@name='pass']")
	private WebElement pwd;
	
	@FindBy(xpath ="//button[@name='login']")
	private WebElement login;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
	
}
