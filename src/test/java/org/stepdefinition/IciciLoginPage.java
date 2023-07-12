package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sam.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IciciLoginPage extends Baseclass {

	@Given("To launch browser and maximize window")
	public void to_launch_browser_and_maximize_window() {
		launchBrowser();
		windowMaximize();

	}

	@When("To launch the URL of ICICI bank login page")
	public void to_launch_the_URL_of_ICICI_bank_login_page() {
		launchUrl("https://www.icicibank.com/");
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		WebElement login = driver.findElement(By.xpath("//a[@class='ic-btn']"));
		clickBtn(login);

	}

	@When("To pass the valid userid")
	public void to_pass_the_valid_userid() throws AWTException {
		WebElement activ = driver.findElement(By.xpath("//img[@class='goahead']"));
		clickBtn(activ);
		WebElement userid = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		passText("mviji87", userid);

	}

	@When("To pass the valid password")
	public void to_pass_the_valid_password() {
		WebElement pwd = driver.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
		passText("inmakes", pwd);

	}

	@Then("close the browser")
	public void close_the_browser() {
		closeEntireBrowser();
	}

}
