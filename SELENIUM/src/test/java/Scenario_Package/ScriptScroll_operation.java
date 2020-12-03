package Scenario_Package;




import static org.junit.Assert.*;

 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class ScriptScroll_operation {
    
    WebDriver driver;
    String url = "http://openclinic.sourceforge.net/openclinic/home/index.php";
    
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
        
        JavascriptExecutor JSE = (JavascriptExecutor) driver; 
        JSE. executeScript("window. scrollBy(0,250)");
    }
    
    @After
    public void tearDown() throws Exception {
        
        driver.quit();
    }

 

 

}
 

 

