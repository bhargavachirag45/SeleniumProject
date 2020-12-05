package SeleniumAssignment3;

import static org.junit.Assert.*;



import java.io.File;
import java.io.IOException;

 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

import com.google.common.io.Files;
public class Scenario_three {

 

    WebDriver driver;
    String url="https://api.jquery.com/dblclick/";

 

    @Before
    public void setUp() throws Exception {

 

        System.setProperty("webdriver.chrome.driver","C:\\Users\\chirag.bhargava\\git\\SeleniumProject\\SELENIUM\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(3000);
    }

 

    @After
    public void tearDown() throws Exception {

 

        driver.close();
    }

 

    @Test
    public void test() {

 

        try {
            File pic=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            File dest =new File("C:\\Users\\chirag.bhargava\\Downloads\\ScreenShoot\\image.jpg");
            Files.copy(pic, dest);
        }
        catch(IOException e) {
            System.out.println("Message : "+e.getMessage());
        }

 

    }

 

}