package ctco.at.stepDefs;

import ctco.at.hooks.Hooks;
import ctco.at.pageObjects.HomePage;
import cucumber.api.java8.En;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class HomePageSteps implements En {

    private HomePage page = new HomePage();
    private Logger logger = LoggerFactory.getLogger(Hooks.class);

    public HomePageSteps() {
        Given("^Navigate to home page$", () -> {
            logger.info("Open Home page");
            page.navigateToHomePae();
        });
        When("^Mouse over the Careers menu$", () -> {
            logger.info("Expand Careers menu");
            page.mouseOverCareersMenu();
        });
        When("^Select Vacancies page from the menu$", () -> {
            logger.info("Select Vacancies");
            page.selectVacanciesFromMenu();
        });
    }
}
