package SeleniumAssignment3;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;


public class Tab  {
    
    WebDriver driver;
    String url = "http://demo.automationtesting.in/Windows.html";

 

    
    @Before
    public void setUp()throws Exception{
        
        //Set property according to the browser you are using
        System.setProperty("webdriver.chrome.driver","C:\\Users\\chirag.bhargava\\git\\SeleniumProject\\SELENIUM\\driver\\chromedriver.exe");
        //Open browser instance
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        //Start the application
        driver.get(url);    
        
    }

 

    @Test
    public void test() throws InterruptedException {
        

 

        String urlNew = null;
        
        //click button
        driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
       
        for(String newTab:driver.getWindowHandles()) {
           
            driver.switchTo().window(newTab);
            urlNew = driver.getCurrentUrl();
            System.out.println(driver.getTitle());
        }
       
        
        WebElement webElement = driver.findElement(By.xpath("/html/body/header/nav/div[1]/span"));
        
        
        //for clicking sub-menus and click on Events option
        webElement.click();
        Thread.sleep(4000);
       
        //loading Events tab
        driver.findElement(By.linkText("Events")).click();
        Thread.sleep(4000);   
       
        urlNew = driver.getTitle();
        Assert.assertTrue(!url.equals(urlNew));
        
        
    }
}