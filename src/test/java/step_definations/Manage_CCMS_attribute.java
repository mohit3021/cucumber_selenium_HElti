package step_definations;

import java.util.ResourceBundle;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.Custom_object;
import pageobjects.UserDifined_object;

public class Manage_CCMS_attribute 
{
	
	ResourceBundle inpdata=ResourceBundle.getBundle("inputdata");
	ResourceBundle locdata=ResourceBundle.getBundle("locatorfile");
	Custom_object cus_obj=new Custom_object();
	UserDifined_object usedif_obj=new UserDifined_object();

	@When("^i clicked on Manage CCMS attributes from left panel$")
	public void i_clicked_on_Manage_CCMS_attributes_from_left_panel() throws InterruptedException
	{
		
		cus_obj.threadwait();
		cus_obj.click_action(locdata.getString("xpath_manageccmsattribute"));
	}

	@When("^i entered attribute name$")
	public void i_entered_attribute_name() throws InterruptedException
	{
		//usedif_obj.test();
    cus_obj.threadwait();
	cus_obj.switchto_defaultcontent();
	cus_obj.entering_value(locdata.getString("mca_xpath_attributename"), inpdata.getString("mca_attributename"));
	}

	@When("^i clicked on Add botton$")
	public void i_clicked_on_Add_botton()
	{
		cus_obj.click_action(locdata.getString("mca_xpath_add"));
	}

	@Then("^attribute should be added successfully$")
	public void attribute_should_be_added_successfully() throws InterruptedException
	{
		usedif_obj.validate_successfulcreation();
	
	}
	
	@When("^i clicked on Trash$")
	public void i_clicked_on_Trash() throws InterruptedException
	{
		usedif_obj.trashcustomerattribute(inpdata.getString("mca_delete_atrtribute"));
       //cus_obj.click_action(locdata.getString("mca_xpath_clickontrash"));
	}	
	@Then("^i clicked on delete$")
	public void i_clicked_on_delete() throws InterruptedException
	{
		cus_obj.threadwait();
		cus_obj.switchto_defaultcontent();
		cus_obj.click_action(locdata.getString("mca_xpath_clickondelete"));
	}

	@Then("^verify successfull deletion$")
	public void verify_successfull_deletion()
	{

	}
	
	@When("^i clicked on Edit$")
	public void i_clicked_on_Edit() throws InterruptedException
	{
		usedif_obj.edit_customerattribute(inpdata.getString("mca_edit_attribute"));
	}

	@Then("^i changed attribute value$")
	public void i_changed_attribute_value()
	{
		cus_obj.update_textfield(locdata.getString("mca_xpath_updateattribute"), inpdata.getString("mca_newattributevalue"));
	}

	@Then("^i clicked on update$")
	public void i_clicked_on_update()
	{
		cus_obj.click_action(locdata.getString("mca_xpath_clickupdate"));
	}
	
}
