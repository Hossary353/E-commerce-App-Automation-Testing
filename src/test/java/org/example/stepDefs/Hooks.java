package org.example.stepDefs;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class Hooks {

    public static WebDriver driver;

    @Before
    public static void OPen_Browser(){
        // 1- Bridge   D:\Testig\Ecommerce\src\main\resources\chromedriver.exe
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
        // Note: you could use WebDriverManager.chromedriver().setup() instead of System.setProperty() as explained in the videos
        // 2- create object from chrome browser
         driver = new ChromeDriver();
        // 3- Configurations
         driver.manage().window().maximize();
//         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3));
        // 4- navigate to url
        driver.get("https://demo.nopcommerce.com/");
      }


    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    }

