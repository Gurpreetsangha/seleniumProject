package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Browser {
    private static WebDriver driver;

     public static String getPropertyInfo(String propertyName){
         String propertyValue="";


         try {
            InputStream inputStream = new FileInputStream("src/main/resources/info.Properties");
             Properties properties=new Properties();
             properties.load(inputStream);
             propertyValue=properties.getProperty(propertyName);
         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
         return propertyValue;
     }
     public static void setDriver(){
         String driverInfo=getPropertyInfo("browser");
         if (driverInfo.equalsIgnoreCase("Chrome")){
             WebDriverManager.chromedriver().setup();
             driver=new ChromeDriver();

         }
         else if (driverInfo.equalsIgnoreCase("firefox")){
             WebDriverManager.firefoxdriver().setup();
             driver=new FirefoxDriver();
         }
     }
     public static WebDriver getDriver(){
         return driver;
     }
}