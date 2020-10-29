package ctco.at.stepDefs;

import ctco.at.hooks.Hooks;
import ctco.at.pageObjects.TestAutomationEngineerPage;
import cucumber.api.java8.En;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings("unused")
public class TestAutomationEngineerPageSteps implements En {

    private Logger logger = LoggerFactory.getLogger(Hooks.class);
    private TestAutomationEngineerPage page = new TestAutomationEngineerPage();

    public TestAutomationEngineerPageSteps() {

        Then("^Verify Test Automation page is displayed", () -> {
            assertThat(page.isPageDisplayed()).isTrue();
            logger.info("Test Automation page is displayed");

        });
        Then("^Verify Professional skills and qualification: contains exactly \"([^\"]*)\" skills$", (Integer numberOfSkills) -> {
            assertThat(page.getSkills()).isEqualTo(numberOfSkills);
            logger.info("Skills verified =" + numberOfSkills);
        });
    }
}
