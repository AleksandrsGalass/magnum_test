package ctco.at.base;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementHelper {

    public static void waitForElementToBePresent(By webElement) {
        new WebDriverWait(DriverManager.getDriver(), 10).until(ExpectedConditions.presenceOfElementLocated(webElement));
    }
}
