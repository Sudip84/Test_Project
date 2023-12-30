package driverHelper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class DriverHelper {

     public static WebDriver driver;

     public static String browser = "chrome";
     public static void initializeDriver(){
         if (browser.equals("chrome")){
             WebDriverManager.chromedriver().setup();
             ChromeOptions options = new ChromeOptions();
             options.addArguments("--disable-web-security");
             options.addArguments("--disable-popup-blocking");
             DesiredCapabilities chrome = DesiredCapabilities.chrome();
             chrome.setJavascriptEnabled(true);
             options.setCapability(ChromeOptions.CAPABILITY, options);
             driver = new ChromeDriver(options);
         } else if (browser.equals("firefox")) {
             WebDriverManager.firefoxdriver().setup();
             driver = new FirefoxDriver();
         } else if (browser.equals("safari")) {
             WebDriverManager.safaridriver().setup();
             driver = new SafariDriver();
         }
     }

     public static void maximizeBrowser(){
         driver.manage().window().maximize();
     }

     public static void getUrl(String URL){
         driver.get(URL);
     }

     public static void implicitWait(){
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     }

     public static void closeBrowser(){
         driver.quit();
     }

}
