package readProperty;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class MainClass  {
    PropertyRead propertyRead;
    WebDriver driver;

 

    @Before
    public void setUp() throws Exception {
        propertyRead=new PropertyRead();
        System.setProperty("webdriver.chrome.driver", propertyRead.get_chromeDriverPath());
        driver = new ChromeDriver();
        driver.get(propertyRead.get_Url());
        driver.manage().window().maximize();
    }

 

    @Test
    public void test() {

 

        String topic=propertyRead.get_topic();
        driver.findElement(By.name("q")).sendKeys(topic);

 


    }

 

    @After
    public void tearDown() throws Exception {
        
        driver.quit();
    }
} 