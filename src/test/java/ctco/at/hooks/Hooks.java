package ctco.at.hooks;

import ctco.at.base.DriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hooks {
    private Logger logger = LoggerFactory.getLogger(Hooks.class);

    @Before
    public void init(Scenario scenario) {
        logger.info(String.format("Starting Scenario: \"%s\"", scenario.getName()));
        DriverManager.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario) {
        logger.info(String.format("Ending Scenario: \"%s\"", scenario.getName()));
        DriverManager.closeDriver();
    }

}

