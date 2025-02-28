package excelplease;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {

    private static final Logger log = LogManager.getLogger(Excel.class);

    public static void main(String[] args) throws InterruptedException {

    	
        // Log information
        log.info("Starting WebDriver");

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Chromedriver-new\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  
        
        driver.manage().window().maximize();
        log.info("Opening Google...");
        driver.get("https://www.google.com/");
        
        log.info("Google opened successfully");
        
        Thread.sleep(2500);

        driver.quit();
        log.info("Browser closed");
    }
}
