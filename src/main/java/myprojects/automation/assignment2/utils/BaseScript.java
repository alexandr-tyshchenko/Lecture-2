package myprojects.automation.assignment2.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.io.File;

/**
 * Created by Alexandr on 04.04.2017.
 */
public abstract class BaseScript {

    private static String BROWSER = BrowserType.CHROME;

    /**
     * @return New instance of {@link WebDriver} object.
     */
    public static WebDriver getDriver() {
        switch (BROWSER) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver",
                        new File((BaseScript.class.getResource("/geckodriver.exe").getFile())).getPath());
                return new FirefoxDriver();

            default:
                System.setProperty("webdriver.chrome.driver",
                        new File((BaseScript.class.getResource("/chromedriver.exe").getFile())).getPath());
                return new ChromeDriver();
        }
    }
}
