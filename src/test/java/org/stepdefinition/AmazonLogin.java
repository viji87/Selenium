package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sam.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonLogin extends Baseclass{
	
	
	@Given("To Launch the browser and maximize window")
	public void to_Launch_the_browser_and_maximize_window() {
		launchBrowser();
		windowMaximize();
	   
	}

	@When("To launch the URL of amazon application")
	public void to_launch_the_URL_of_amazon_application() {
	   launchUrl("https://www.amazon.in/");
	}

	@When("To Click the signin button")
	public void to_Click_the_signin_button() {
		WebElement signin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		signin.click();
	    
	}

	@When("To pass the valid email")
	public void to_pass_the_valid_email() {
		WebElement mail = driver.findElement(By.name("email"));
		mail.sendKeys("mvijitha87@gmail.com");
	    
	}

	@When("To Click the continue button")
	public void to_Click_the_continue_button() {
		WebElement ctnue = driver.findElement(By.xpath("//input[@type='submit']"));
		ctnue.click();
	  
	}

	@When("To pass the invalid Password")
	public void to_pass_the_invalid_Password() {
	   WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
	   pwd.sendKeys("vijisundar");
	}

	@When("To Click the Signin Button")
	public void to_Click_the_Signin_Button() {
		WebElement login = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		login.click();
	   
	}

	@When("To Check whether navigate home page or not")
	public void to_Check_whether_navigate_home_page_or_not() {
	    System.out.println("To check your login credentials");
	}

	@Then("To Close the Browser")
	public void to_Close_the_Browser() {
	    closeEntireBrowser();
	}
}
