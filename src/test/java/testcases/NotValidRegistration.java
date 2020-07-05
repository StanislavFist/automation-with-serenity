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
import scripts.RegistrationPageScenarioSteps;

/**
 * Регистрация пользователя с некорректным email
 */
@RunWith(SerenityRunner.class)
public class NotValidRegistration {

    @Managed(uniqueSession = true)
    WebDriver driver;

    @Steps
    Helpers helpers;

    @Steps
    HomePageScenarioSteps homePageScenarioSteps;

    @Steps
    RegistrationPageScenarioSteps registrationPageScenarioSteps;

    @Steps
    AuthorizationPageScenarioSteps authorizationPageScenarioSteps;

    @Test
    public void notValidRegistration() {
        homePageScenarioSteps.openPage();
        helpers.waitForPageLoad(driver);
        homePageScenarioSteps.homePageIsLoaded();
        homePageScenarioSteps.clickPersonalLk();

        authorizationPageScenarioSteps.authPageIsLoaded();
        authorizationPageScenarioSteps.buttonRegistration();

        registrationPageScenarioSteps.registrationPageIsLoaded();
        registrationPageScenarioSteps.buttonIsDisabled();
        registrationPageScenarioSteps.enterEmail("not valid");
        registrationPageScenarioSteps.enterPassword("testtest1");
        registrationPageScenarioSteps.clickButton();
        registrationPageScenarioSteps.errorNotice();
    }
}
