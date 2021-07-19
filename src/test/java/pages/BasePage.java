package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/soulm/OneDrive/Documentos/Autoestudio/SW-Testing/TheFreeRangerTester/Selenium_Project/chromedriver.exe");

        ChromeOptions chromeoptions = new ChromeOptions();
        driver = new ChromeDriver(chromeoptions);
        wait = new WebDriverWait(driver, 10);

    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public static void navigateTo(String url) {
        driver.get(url);
    }
}
