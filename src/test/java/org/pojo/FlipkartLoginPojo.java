package org.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.Baseclass;

public class FlipkartLoginPojo extends Baseclass{
	public FlipkartLoginPojo() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//span[text()='Sign in']")
	private WebElement login;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement mobile;
	
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement Rotp;


	public WebElement getLogin() {
		return login;
	}

	public WebElement getMobile() {
		return mobile;
	}
	
	public WebElement getRotp() {
		return Rotp;
	}

	
}
