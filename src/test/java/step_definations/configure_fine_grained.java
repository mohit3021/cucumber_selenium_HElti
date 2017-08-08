package step_definations;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.Custom_object;
import pageobjects.UserDifined_object;
import step_definations.support.Hooks;


public class configure_fine_grained
{
	
	
	ResourceBundle inpdata=ResourceBundle.getBundle("inputdata");
	ResourceBundle locdata=ResourceBundle.getBundle("locatorfile");
	Custom_object cus_obj=new Custom_object();
	UserDifined_object usedif_obj=new UserDifined_object();
	
///////////////add new rule//////////////
	
	@When("^I clicked on Add New Rule$")
	public void i_clicked_on_Add_New_Rule()
	{
		cus_obj.explicitywait(locdata.getString("ffg_xpath_addnewrule"));
		cus_obj.click_action(locdata.getString("ffg_xpath_addnewrule"));
	}

	@Then("^i enter application_id$")
	public void i_enter_application_id()
	{
		cus_obj.switchto_activeelement();
		cus_obj.entering_value(locdata.getString("afgr_xpath_application"), inpdata.getString("afgr_application"));
	}

	@Then("^i enter value of country\\.$")
	public void i_enter_value_of_country()
	{
		cus_obj.entering_value(locdata.getString("afgr_xpath_country"), inpdata.getString("afgr_country"));	
	}

	@Then("^i select value for resource from dropdown$")
	public void i_select_value_for_resource_from_dropdown()
	{
		cus_obj.select_from_dropdown(locdata.getString("afgr_xpath_resource"), inpdata.getString("afgr_resource"));
	}

	@Then("^i select value for resource type from dropdown$")
	public void i_select_value_for_resource_type_from_dropdown()
	{
		cus_obj.select_from_dropdown(locdata.getString("afgr_xpath_resourceType"), inpdata.getString("afgr_resourceType"));
	}

	@Then("^i select dropdown value for service type from dropdown\\.$")
	public void i_select_dropdown_value_for_service_type_from_dropdown()
	{
		cus_obj.select_from_dropdown(locdata.getString("afgr_xpath_serviceType"), inpdata.getString("afgr_serviceType"));
	}

	@Then("^I clicked of submit button$")
	public void i_clicked_of_submit_button()
	{
		//cus_obj.click_action(locdata.getString("afgr_xpath_submit"));
	}
	
	///////////////Edit existing rule//////////////
	
	@When("^I clicked on edit button$")
	public void i_clicked_on_edit_button() throws InterruptedException
	{
		//cus_obj.mywait();
		//cus_obj.scrollpage(locdata.getString("eer_xpath_actions"));
		//cus_obj.mywait();
		cus_obj.explicitywait(locdata.getString("eer_xpath_edit"));
		cus_obj.click_action(locdata.getString("eer_xpath_edit"));
	}
	
	@When("^i can change value of application id$")
	public void i_can_change_value_of_application_id()
	{
		cus_obj.switchto_activeelement();
		cus_obj.entering_value(locdata.getString("afgr_xpath_application"), inpdata.getString("afgr_application1"));
	}

	@When("^i can change value os country$")
	public void i_can_change_value_os_country()
	{
		cus_obj.entering_value(locdata.getString("afgr_xpath_country"), inpdata.getString("afgr_country1"));
	}

	@When("^i can select resource value again$")
	public void i_can_select_resource_value_again()
	{
		cus_obj.select_from_dropdown(locdata.getString("afgr_xpath_resource"), inpdata.getString("afgr_resource1"));
	}



	@When("^i can change service type from dropdown$")
	public void i_can_change_service_type_from_dropdown()
	{
		cus_obj.select_from_dropdown(locdata.getString("afgr_xpath_serviceType"), inpdata.getString("afgr_serviceType1"));
	}

	@Then("^i clicked on Update button$")
	public void i_clicked_on_Update_button()
	{
		//cus_obj.click_action(locdata.getString("afgr_xpath_update"));
	}
	
	////////////Trash/delete existing rule/////////////////
	
	@When("^i clicked on trash button$")
	public void i_clicked_on_trash_button() throws InterruptedException
	{
		cus_obj.explicitywait(locdata.getString("ter_xpath_trash"));
		//cus_obj.scrollpage(locdata.getString("eer_xpath_actions"));
		
		cus_obj.click_action(locdata.getString("ter_xpath_trash"));
	}

	@Then("^select cancel option to cancel delete$")
	public void select_cancel_option_to_cancel_delete() throws InterruptedException
	{
	cus_obj.threadwait();
	cus_obj.switchto_activeelement();
	cus_obj.click_action(locdata.getString("ter_xpath_Cancel"));
		
	}
	   
	
}
