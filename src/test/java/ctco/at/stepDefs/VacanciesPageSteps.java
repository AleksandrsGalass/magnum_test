package ctco.at.stepDefs;

import ctco.at.hooks.Hooks;
import ctco.at.pageObjects.VacanciesPage;
import cucumber.api.java8.En;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings("unused")
public class VacanciesPageSteps implements En {

    private Logger logger = LoggerFactory.getLogger(Hooks.class);
    private VacanciesPage page = new VacanciesPage();

    public VacanciesPageSteps() {
        Then("^Verify Vacancies page is displayed", () -> {
            assertThat(page.isPageDisplayed()).isTrue();
            logger.info("Test Automation page is displayed");
        });
        And("^Select vacancy \"([^\"]*)\"$", (String name) -> {
            logger.info("Select Vacancy");
            page.selectVacancyByName(name);

        });
    }
}
