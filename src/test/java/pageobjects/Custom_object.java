package pageobjects;

import java.util.ResourceBundle;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import step_definations.support.Hooks;

public class Custom_object 
{
    
    
	public WebDriver driver=Hooks.driver;
	public void entering_value(String xpathvalue, String enteredvalue)
	{
		driver.findElement(By.xpath(xpathvalue)).sendKeys(enteredvalue);
	}
	
	public void select_from_dropdown(String xpathvalue, String elementselected)
	{
		WebElement clickdropdown=driver.findElement(By.xpath(xpathvalue));
		 Select select=new Select(clickdropdown);
		 select.selectByVisibleText(elementselected);
	}
	
	public void click_action(String xpath_clickelement)
	{
		driver.findElement(By.xpath(xpath_clickelement)).click();
	}
	
	
	public void threadwait() throws InterruptedException
	{
		Thread.sleep(3000);
	}
	
	public void maxmizebrowser()
	{
		driver.manage().window().maximize();
	}
	
	public void scrollpage(String xpathofelementtoscroll)
	{
		JavascriptExecutor je = (JavascriptExecutor) driver;
		 
		WebElement element = driver.findElement(By.xpath(xpathofelementtoscroll));

		je.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	public void switchto_activeelement()
	{
		driver.switchTo().activeElement();
	}
	
	public void explicitywait(String waitforpresenceOfElementLocated)
	{
		WebDriverWait wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(waitforpresenceOfElementLocated)));
	}
	
	public void switchto_defaultcontent()
	{
		driver.switchTo().defaultContent();
	}
	
	//************************************
	
	public void assertequal(String expectedresult, String xpathforaxtualresult)
	{
		String axtualresult=driver.findElement(By.xpath("xpathforaxtualresult")).getText();
		System.out.println("This is the value of Actual result :"+axtualresult);
		Assert.assertEquals(expectedresult, axtualresult);
	}
	
	public void update_textfield(String xpathvalue, String enteredvalue)
	{
		WebElement element=driver.findElement(By.xpath(xpathvalue));
		element.clear();
		element.sendKeys(enteredvalue);
		
	}
	
	
	public void threadwait1() throws InterruptedException
	{
		Thread.sleep(6000);
	}
	
}
