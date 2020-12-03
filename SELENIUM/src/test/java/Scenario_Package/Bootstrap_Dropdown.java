package Scenario_Package;

import java.util.List;
import java.util.concurrent.TimeUnit;

 

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class Bootstrap_Dropdown  {
    WebDriver driver;
    String url = "https://www.jquery-az.com/boots/demo.php?ex=63.0_2";
    
    @Before
    public void setUp()throws Exception{
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\chirag.bhargava\\eclipse-workspace\\SELENIUM\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        
        
    }
    
    
    @Test
    public void testBootStrap()throws Exception{
        
        driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button")).click();
        
        List<WebElement> webElement = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
        
        for(int i = 0; i<webElement.size(); i++) {
      Thread.sleep(5);
            String val = webElement.get(i).getText();
            if (val.equalsIgnoreCase("Java")||val.equalsIgnoreCase("Python")) {
                
                webElement.get(i).click();
    
            }
        }
        
    }

 

}
