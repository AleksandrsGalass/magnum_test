package ctco.at.pageObjects;

import ctco.at.base.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@SuppressWarnings("unused")
public class TestAutomationEngineerPage extends BasePage {

    private static final By TAE_PAGE_LOCATOR = By.xpath("//h1[text()='Test Automation Engineer']");
    @FindBy(xpath = "//h1[text()='Test Automation Engineer']")
    private WebElement taepage;
    @FindBy(xpath = "(//h1[text()='Test Automation Engineer']/parent::div//ul)[1]//li")
    private List<WebElement> skillsWebElements;

    public boolean isPageDisplayed() {
        ElementHelper.waitForElementToBePresent(TAE_PAGE_LOCATOR);
        return taepage.isDisplayed();
    }

    public Integer getSkills() {
        return skillsWebElements.size();
    }
}
