package ctco.at.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.util.Objects.nonNull;

public class DriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.gecko.driver", "C:\\srdev\\git\\magnum_test\\src\\test\\resources\\drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public static void closeDriver() {
        if (nonNull(driver)) {
            driver.quit();
        }
    }
}

