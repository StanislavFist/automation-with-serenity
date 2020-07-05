package testcases;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pageHelpers.Helpers;
import scripts.AuthorizationPageScenarioSteps;
import scripts.HomePageScenarioSteps;

@RunWith(SerenityRunner.class)
public class SuccessfullyLoggedIn {

    @Managed(uniqueSession = true)
    WebDriver driver;

    @Steps
    Helpers helpers;

    @Steps
    HomePageScenarioSteps homePageScenarioSteps;

    @Steps
    AuthorizationPageScenarioSteps authorizationPageScenarioSteps;

    @Test
    public void loginTsum() {
        homePageScenarioSteps.openPage();
        helpers.waitForPageLoad(driver);
        homePageScenarioSteps.homePageIsLoaded();
        homePageScenarioSteps.clickPersonalLk();

        authorizationPageScenarioSteps.authPageIsLoaded();
        authorizationPageScenarioSteps.buttonIsDisabled();
        authorizationPageScenarioSteps.enterEmail("yogad99432@enmail1.com");
        authorizationPageScenarioSteps.enterPassword("testtest1");
        authorizationPageScenarioSteps.clickButton();

        homePageScenarioSteps.homePageIsLoaded();
    }
}