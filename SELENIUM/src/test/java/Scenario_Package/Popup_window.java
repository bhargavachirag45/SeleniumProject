package Scenario_Package;



import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Popup_window{
	
	WebDriver driver;
	String url = "http://popuptest.com/goodpopups.html";
	
	@Before
	public void setUp()throws Exception{
		
		//Set property according to the browser you are using
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chirag.bhargava\\eclipse-workspace\\SELENIUM\\driver\\chromedriver.exe");
		//Open browser instance
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Start the application
		driver.get(url);
		
	}
	
	@Test
	public void test() {

		driver.findElement(By.linkText("Good PopUp #1")).click();
		// Two Window IDs will be available now
		Set<String>handle=driver.getWindowHandles();					
		
		// as set does not store obj in form of indexes, use iterator
		Iterator<String>p=handle.iterator();								
		
		// stores Parent Window Value
		String parentWin=p.next();	
		
		// stores Child Window Value
		String childWin=p.next();											
		
		// Switch from Parent to Child Window
		driver.switchTo().window(childWin);									
		
		System.out.println("Child Window Title : "+driver.getTitle());
		// close will close only child window
		driver.close();														

		// Switching to parent window
		driver.switchTo().window(parentWin);
		
		// print title to check if the control is back to parent window
		System.out.println("Parent Window Title : "+driver.getTitle());			

	

}

	


}
