package org.stepdefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class Rerun {

	@When("User Enters correct Assertion.")
	public void user_enters_correct_assertion() {
		System.out.println("correct_Assertion");
		
		Assert.assertEquals("sudha","sudha");
	}



	@When("User Enters wrong Assertion.")
	public void user_enters_wrong_assertion() {
		System.out.println("wrong_Assertion");
		Assert.assertEquals("sudha","sudha");
	}

	

	@When("User Enters  no Assertion.")
	public void user_enters_no_assertion() {
		System.out.println(" no Assertion");
		
	}







	


}
