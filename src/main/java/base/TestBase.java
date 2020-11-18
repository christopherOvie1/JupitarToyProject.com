package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import utils.TestUtility;

public class TestBase {
	
	public static WebDriver driver;
	public	static Properties prop;
	
    public TestBase() {
		
		//read the properties file
		try {
			prop = new Properties();
			
			FileInputStream ip = new FileInputStream("src/main/java/config/config.properties");
	
				prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
    //initialise the browser
    public static void initialization() {
		
    	String browserName=	prop.getProperty("browser");
    	if(browserName.equals("chrome")) {
    		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
            driver= new ChromeDriver();
    	}
    	
    	else if (browserName.equals("Firefox")) {
    		System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
    		driver= new FirefoxDriver();	
    	}
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().pageLoadTimeout(TestUtility.pageLoadTimeout, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(TestUtility.ImplicitWait,TimeUnit.SECONDS);
    	//driver.get("https://www.bbc.co.uk");
    	driver.get(prop.getProperty("url"));
    	}  
    

}
