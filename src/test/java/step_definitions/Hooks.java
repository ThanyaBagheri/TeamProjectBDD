

package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.BrowserUtils;
import utils.CucumberLogUtils;

public class Hooks {

    @Before
    public void setUp(Scenario scenario){
        BrowserUtils.getDriver();
        CucumberLogUtils.initScenario(scenario);
    }

    @After
    public void tearDown(Scenario scenario){
        //only takes screen short if it's failing
        if(scenario.isFailed()){
            CucumberLogUtils.logFail(scenario.getName(),false);
        }
        BrowserUtils.quitDriver();
    }
}
