package org.stepdefinition;

import org.sam.Baseclass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksSample extends Baseclass {
	
	@Before
	private void precondition() {
		launchBrowser();
		windowMaximize();
	}
	@After
	private void postcondition() {
	   closeEntireBrowser();

	}

}
