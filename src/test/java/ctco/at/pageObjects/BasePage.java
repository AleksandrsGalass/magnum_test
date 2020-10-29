package ctco.at.pageObjects;

import ctco.at.base.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

class BasePage {

    WebDriver driver;

    BasePage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }
}
