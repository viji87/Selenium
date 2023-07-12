package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sam.Baseclass;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AmazonDataTable extends Baseclass{
	
	@Before
	private void precondition() {
		launchBrowser();
		windowMaximize();
	}
	@After
	private void postcondition() {
	   closeEntireBrowser();

	}
	
	@Given("To launch Browser and maximize window")
	public void to_launch_Browser_and_maximize_window() {
	   precondition();
	}

	@When("To launch URL of Amazon Application")
	public void to_launch_URL_of_Amazon_Application() {
	    launchUrl("https://www.amazon.in/");
	}

	@When("To click Sign in button")
	public void to_click_Sign_in_button() {
		WebElement signin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		signin.click();
	}

	@When("To pass the email in email field")
	public void to_pass_the_email_in_email_field(DataTable d) {
		List<String> l = d.asList();
		WebElement mail = driver.findElement(By.name("email"));
		mail.sendKeys(l.get(0));
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
		WebElement ctnue = driver.findElement(By.xpath("//input[@type='submit']"));
		ctnue.click();
	}

	@When("To pass the password in textbox field")
	public void to_pass_the_password_in_textbox_field(DataTable d) throws AWTException {
	   	List<List<String>> passwd = d.asLists();
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys(passwd.get(2).get(2));
        String pt = pwd.getText();
	    System.out.println("Password:"+pt);
	}

	@When("To click the signin button")
	public void to_click_the_signin_button() {
		WebElement login = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		login.click();
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	  postcondition();
	}


	
	
	
	
	
	
	

}
