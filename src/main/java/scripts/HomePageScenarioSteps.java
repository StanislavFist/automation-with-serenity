package scripts;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import pages.HomePage;

public class HomePageScenarioSteps extends ScenarioSteps {

    HomePage homePage;

    @Step
    public void openPage() {
        homePage.open();
    }

    @Step
    public void homePageIsLoaded() {
        Assert.assertTrue("Home page is not exist", homePage.homePageHasLoaded());
    }

    @Step
    public void clickPersonalLk() {
        homePage.clickPersonalLk();
    }
}
