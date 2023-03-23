package org.stepdefinition;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import demoqa.BaseClass;
import demoqa.DemoqaExe;
import demoqa.DemoqaLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoqaStepDefinition extends DemoqaExe{
	
	@Given("User Enters the URL.")
	public void user_enters_the_url() {
			setProperty();
			getUrl("https://demoqa.com/forms");
			window();
	}
	

	@When("User clicks on forms")
	public void user_clicks_on_forms() {
	form();
	}



	@Then("the user enter the first name")
	public void the_user_enter_the_first_name() {
		FirstName("Sudha");
	}

	@Then("the user enter the last name")
	public void the_user_enter_the_last_name() {
		LastName("kuppusamy");
	}


	@Then("user Select city and place")
	public void user_select_city_and_place() throws AWTException {
		
	  city("Haryana"); 
//	  ExplicitWait();
//	  implicitlyWait();
	}


//	@Then("the user enter the subject")
//	public void the_user_enter_the_subject() {
//		subject("1235");
//	}
	@Then("the user select hobbies")
	public void the_user_select_hobbies() {
hobbies();
	}




//	@Then("user clicks submit")
//	public void user_clicks_submit() {
//		submit();
//	}

	@Then("the user enter the Email")
	public void the_user_enter_the_email() {
		Email("123@gmail.com");
	}
	@Then("the user clicks the gender")
	public void the_user_clicks_the_gender() {
	    gender();
	}
	@Then("the user enter the mobilenumber")
	public void the_user_enter_the_mobilenumber() {
	mobileNumber("1234567890");
	}
	@Then("the user enter the currentAddress")
	public void the_user_enter_the_current_address() {
		currentAddress("abcd");
	}



//
//	@Then("user Select city and place")
//	public void user_select_city_and_place() {
//	  city();
//	  implicitlyWait();
	  
//	  cityName("Haryana");
	}



//
//	@And("validate that page  is visible")
//	public void validate_that_page_is_visible() {
//	 
//	}

//}
