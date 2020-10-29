package ctco.at.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@SuppressWarnings("unused")
public class HomePage extends BasePage {

    @FindBy(xpath = "//*[@href = 'https://ctco.lv/careers/']")
    private WebElement careersDropDown;
    @FindBy(xpath = "//*[@href = 'https://ctco.lv/careers/vacancies/']")
    private WebElement vacancies;

    public void navigateToHomePae() {
        driver.get("https://ctco.lv/en");
    }

    public void mouseOverCareersMenu() {
        Actions actions = new Actions(driver);
        actions.moveToElement(careersDropDown).perform();
    }

    public void selectVacanciesFromMenu() {
        vacancies.click();
    }
}

