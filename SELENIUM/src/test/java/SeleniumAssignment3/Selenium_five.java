package SeleniumAssignment3;

import java.util.List;
import java.util.concurrent.TimeUnit;

 

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_five {
    
    WebDriver driver;
    String url="http://chennaiiq.com/chennai/pincode-by-name.php";
    
    @Before
    public void setUp() throws Exception {        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\chirag.bhargava\\git\\SeleniumProject\\SELENIUM\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
    }

 

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

 

    @Test
    public void test() {
        WebElement table=driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]/table[1]"));
        List<WebElement> rows=table.findElements(By.tagName("tr"));
        
        for(int i=3;i<10;i++)
        {
            List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
            String pin1 = cols.get(2).getText(); 
            
            for(int j=i;j<10;j++) 
            {
                List<WebElement> cols1=rows.get(j).findElements(By.tagName("td"));
                String pin2 = cols1.get(2).getText();
                Assert.assertFalse(pin1==pin2);  
            }

 

        }
}

 


}