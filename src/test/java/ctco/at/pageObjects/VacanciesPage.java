package ctco.at.pageObjects;

import ctco.at.base.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class VacanciesPage extends BasePage {

    private static final By VACANCIES_PAGE_LOCATOR = By.xpath("//div[@class ='row vacancies-main']");
    private static final String vacancy = "//*[@href = '%s']";
    private final Map<String, String> VACANCIES = new HashMap<>();
    @FindBy(xpath = "//div[@class ='row vacancies-main']")
    private WebElement vacanciesPage;

    public VacanciesPage() {
        VACANCIES.put("Test Automation Engineer", "https://ctco.lv/careers/vacancies/test-automation-engineer-2/");
    }

    public boolean isPageDisplayed() {
        ElementHelper.waitForElementToBePresent(VACANCIES_PAGE_LOCATOR);
        return vacanciesPage.isDisplayed();
    }

    public void selectVacancyByName(String name) {
        driver.findElement(By.xpath(String.format(vacancy, VACANCIES.get(name)))).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
