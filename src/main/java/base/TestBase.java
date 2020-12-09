package base;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.TestUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

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
    public static void initialization() throws MalformedURLException {

        String browserName=	prop.getProperty("browser");
        if(browserName.equals("chrome")) {
           //System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
          // driver= new ChromeDriver();
            DesiredCapabilities capability = new DesiredCapabilities();
            capability.setBrowserName("chrome");
            capability.setPlatform(Platform.WINDOWS);
            ChromeOptions options = new ChromeOptions();
            options.merge(capability);
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);

        }

        else if (browserName.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
            driver= new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtility.pageLoadTimeout, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtility.ImplicitWait,TimeUnit.SECONDS);
        //driver.get(prop.getProperty("url"));
        //driver.get(prop.getProperty("URL"));
    }


}
