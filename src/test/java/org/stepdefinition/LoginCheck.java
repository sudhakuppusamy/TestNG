package org.stepdefinition;

import org.junit.Assert;

import com.adactin.page.BookHotelPageExe;
import com.adactin.page.LoginPageExe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCheck  extends  BookHotelPageExe {
	@Given("User Enters thr URL.")
	public void enters_thr_url() {
		setProperty();
		getUrl("https://adactinhotelapp.com/");
	
	}



	@When("User enters the username {string}")
	public void user_enters_the_username(String user) {
		username(user);
	}
	@When("User enters the password {string}")
	public void user_enters_the_password(String pass) {
		password(pass);
	}



	@When("User enters the username")
	public void user_enters_the_username() {
	username("daisyrubycatharine");
	}

	@When("User enters the password")
	public void user_enters_the_password() {
	password("RP65IQ");
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		login();
	}

	@When("Validate the user icon.")
	public void validate_the_user_icon() {

	}
	
	@Then("validate the user icon")
	public void validate_the_user_icon1() {
	  
	}
	@Then("validate that sign in button is not visible")
	public void validate_that_sign_in_button_is_not_visible() {
	 
	}
	

	@Then("validate the home page title")
	public void validate_the_home_page_title() {
	}
	
//		String actualvalu = getTitle();
//		String value = "adactinhotelapp.com-SearchHol";
//		Assert.assertEquals("actualvalu", "value");
//		System.out.println( getTitle());
//	}
//
//
//
//	private String getTitle() {
//
//		return null;
//	}



	@Then("validate that sign in icon is not visible")
	public void validate_that_sign_in_icon_is_not_visible() {
System.out.println("validate_that_sign_in_icon_is_not_visible");
	}

	@When("User enters the Invalid username")
	public void user_enters_the_invalid_username() {
		username("daisyrubycathari");
	}

	@Given("User Enters the  URL.")
	public void user_enters_the_url() {
		setProperty();
		getUrl("https://adactinhotelapp.com/");	
	}
	@When("User enters the   Invalid password")
	public void user_enters_the_invalid_password() {
		password("RP65IQ");
	}

	@When("User enters the Invalid username {string}")
	public void user_enters_the_invalid_username(String user) {
		username(user);
	}





	





	










}
