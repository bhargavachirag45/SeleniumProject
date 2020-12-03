package Scenario_Package;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop_operation  {
    WebDriver driver;
    String url = "https://jqueryui.com/droppable/";
    
    @Before
    public void setUp()throws Exception{
        
        //Set property according to the browser you are using
        System.setProperty("webdriver.chrome.driver","C:\\Users\\chirag.bhargava\\eclipse-workspace\\SELENIUM\\driver\\chromedriver.exe");
        //Open browser instance
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        //Implicit wait for 5 second
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        //Start the application
        driver.get(url);
        
//        driver.quit();
    }
    
    @Test
    public void testDragDrop() {
        
        driver.switchTo().frame(0);
        //WebElement to which drag and drop operation needs to be performed
        WebElement Element = driver.findElement(By.id("draggable"));
        
        //WebElement on which the above object is dropped
        WebElement Elements = driver.findElement(By.id("droppable"));
        
        //Creating object of Actions Class to build Composite actions
        Actions build = new Actions(driver);
        
        build.dragAndDrop(Element,Elements).perform();
        
        String Dragging = driver.findElement(By.id("droppable")).getText();
        
        if (Dragging.equals("Dropped!")) {
            
            System.out.println("PASS: file is dropped as expected");
            
        }
        else {
            System.out.println("FAIL: file failed to drop as expected");
            
        }
    }
    
    @After
    public void tearDown() throws Exception{
        driver.quit();
    }
    
    

 

}