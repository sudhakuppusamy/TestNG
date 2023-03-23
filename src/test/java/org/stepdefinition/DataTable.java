//package org.stepdefinition;
//
//import java.util.List;
//import java.util.Map;
//
//import com.adactin.page.BookHotelPageExe;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//
//public class DataTable extends  BookHotelPageExe {
//	@Given("User Enters the URL.")
//	public void user_enters_the_url() {
//		setProperty();
//		getUrl("https://adactinhotelapp.com/");
//	}
//
//	@When("enter form asList")
//	public void enter_form_as_list(io.cucumber.datatable.DataTable dataTable) {
//	 List <String> asList = dataTable.asList();
//	   username(asList.get(0));
//	   password(asList.get(1));
//	}
//
//	@Given("User Enters the URL for DemoqA.")
//	public void user_enters_the_url_for_demoq_a() {
//		setProperty();
//		getUrl("https://demoqa.com/");
//	}
//
//	@When("enter form asLists")
//	public void enter_form_as_lists(io.cucumber.datatable.DataTable dataTable) {
//		List <List <String>> asList = dataTable.asLists();
//		System.out.println(asList.get(0).get(1));
//		System.out.println(asList.get(1).get(1));
//	}
//
//		@When("enter form asMap")
//	public void enter_form_as_map(io.cucumber.datatable.DataTable dataTable) {
//			Map <String ,String> asMap = dataTable.asMap();
//			System.out.println(asMap.get("fname"));
//			System.out.println(asMap.get("lastname"));
//			System.out.println(asMap.get("mail"));
//	}
//
//
//
//		@When("enter form asMaps")
//		public void enter_form_as_maps(io.cucumber.datatable.DataTable dataTable) {
//			List<Map<String, String>> asMaps = dataTable.asMaps();
//			System.out.println(asMaps.get(0).get("fname"));
//			System.out.println(asMaps.get(0).get("lastname"));
//			System.out.println(asMaps.get(0).get("mail"));
//			
//		}
//
//
//
//
//}
