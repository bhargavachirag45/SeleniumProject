package Scenario_Package;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search{
	
	WebDriver driver;
	String url = "https://www.google.com";
	
	@Before
	public void setUp()throws Exception{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chirag.bhargava\\eclipse-workspace\\SELENIUM\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	
		driver.get(url);
		
	}

	
	
	@Test
	public void test() throws InterruptedException 
	{
		driver.findElement(By.name("q")).sendKeys("Selenium");

		List<WebElement> ele=driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));

		for(int j=0;j<ele.size();j++) 
		{
			String val=ele.get(j).getText();
			if(val.contains("selenium tutorial"))
			{
				Thread.sleep(5000);
				ele.get(j).click();
				break;
			}
		}

	}

}

