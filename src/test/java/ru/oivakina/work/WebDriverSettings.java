package ru.oivakina.work;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public ChromeDriver driver;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/oivakina/Downloads/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }
        @After
        public void close(){
            driver.quit();
        }
}
