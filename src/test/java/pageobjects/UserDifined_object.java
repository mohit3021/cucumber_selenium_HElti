package pageobjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import step_definations.support.Hooks;

public class UserDifined_object 
{
	public WebDriver driver=Hooks.driver;
	
	
	
	public void validate_successfulcreation() throws InterruptedException
	{
		Thread.sleep(2000);
		String actualresult=driver.findElement(By.xpath(".//div[@id='custcreated-alert']")).getText();
		String[] str = actualresult.split("\n");
		System.out.println(str[1]);
		Assert.assertEquals("Congratulations! The attribute has been successfully created.", str[1]);
	}
	
	public void trashcustomerattribute(String attribute__to_delete) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//td[text()='"+attribute__to_delete+"']//following::button[2]")).click();
	}
	
	public void edit_customerattribute(String attribute__to_edit) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//td[text()='"+attribute__to_edit+"']//following::button[1]")).click();
	}
	
	
	
	
	

	


}
