package org.stepdefinition;

import org.sam.Baseclass;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyntraPage extends Baseclass {

	@Before
	public void precondition() {
		launchBrowser();
		windowMaximize();
	}
	@When("to launch the URL of Myntra page")
	public void to_launch_the_URL_of_Myntra_page() {
	  launchUrl("https://www.myntra.com/");   
	}

	@Then("To check whether it is working or not")
	public void to_check_whether_it_is_working_or_not() {
	System.out.println("It is working");
	}

	@After
	public void postcondition() {
		System.out.println("Checked");
		closeEntireBrowser();

	}


}
