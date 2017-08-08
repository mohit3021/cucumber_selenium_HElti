package step_definations.support;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks 
{
	
	public static WebDriver driver;
	
	final String dir = System.getProperty("user.dir");
	String driverPath=dir.replaceAll("\\\\", "/");
	
	ResourceBundle inpdata=ResourceBundle.getBundle("inputdata");
	
	String browser=inpdata.getString("browser");
	
	@Before()
	public void beforScenarios() throws InterruptedException
	{
		
		switch(browser)
		{
		case "chrome" : 
		{
			
			
			System.setProperty("webdriver.chrome.driver", driverPath+"/Drivers/chromedriver.exe");
			
			    ChromeOptions options = new ChromeOptions();
	            options.addArguments("--start-maximized");
	            options.addArguments("--disable-web-security");
	            options.addArguments("--no-proxy-server");
	            Map<String, Object> prefs = new HashMap<String, Object>();
	            prefs.put("credentials_enable_service", false);
	            prefs.put("profile.password_manager_enabled", false);
	            options.setExperimentalOption("prefs", prefs);
	
			   driver=new ChromeDriver(options);
			   break;
		}
		
		
		case "firefox":
		{
			System.setProperty("webdriver.gecko.driver", driverPath+"/Drivers/geckodriver.exe");
			
			driver=new FirefoxDriver();
			 break;
		}
		case"ie":
		{
			System.setProperty("webdriver.ie.driver", driverPath+"/Drivers/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			 break;
		}
		default:
		{
			System.setProperty("webdriver.chrome.driver", driverPath+"/Drivers/chromedriver.exe");
			   driver=new ChromeDriver();	
			   
		}
	
		}
		
		driver.get(inpdata.getString("applicationURL"));
		
		//driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("username")).sendKeys("rajat.arora@globallogic.com");
		driver.findElement(By.id("password")).sendKeys("Test12345");
		driver.findElement(By.xpath(".//*[@value='Login']")).click();
		//Thread.sleep(2000);
	}
	
	@After
	public void afterScenarios()
	{
		driver.quit();
	}

}
