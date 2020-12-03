package Scenario_Package;
import java.util.concurrent.TimeUnit;



import static org.junit.Assert.*;

 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class SetSizeWindow_Operation  {
    WebDriver driver;
    String url = "https://www.google.com";
    
    
    
    @Test
    public void test() throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\chirag.bhargava\\eclipse-workspace\\SELENIUM\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);
        
        driver.manage().window().maximize();
        
        // getting Original Size
        Dimension DD=driver.manage().window().getSize();            
        System.out.println("Before Setting Size : "+DD);
        
        // Setting different size
        driver.manage().window().setSize(new Dimension(200,500));    
        Dimension dd=driver.manage().window().getSize();
        
        // Values after getting Size
        System.out.println("After Setting Size : "+dd);                
        System.out.println("Successful Result");
        
    }
    
    @After
    public void tearDown() throws Exception {
        
        driver.quit();
    }

 

 

}