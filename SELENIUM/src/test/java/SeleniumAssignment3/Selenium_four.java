package SeleniumAssignment3;

import java.io.FileInputStream;
import java.io.IOException;

 

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;

public class Selenium_four {
    @Test
    public void test() throws IOException {
        
        String path="C:\\Users\\chirag.bhargava\\git\\SeleniumProject\\SELENIUM\\Data\\Information.xlsx";
        
        FileInputStream input=new FileInputStream(path);
        XSSFWorkbook b =new XSSFWorkbook(input);
        XSSFSheet sheet=b.getSheet("Sheet1");
        
        int Count=sheet.getLastRowNum()-sheet.getFirstRowNum();
        
        for(int i=0;i<=Count;i++) {
            
            String firstName=sheet.getRow(i).getCell(0).getStringCellValue();
            String lastName=sheet.getRow(i).getCell(1).getStringCellValue();

 

            
            Assert.assertNotNull(firstName);
            System.out.println("First Name : "+firstName);
            System.out.println("Last Name  : "+lastName);

 

            
        }
    }

 

}