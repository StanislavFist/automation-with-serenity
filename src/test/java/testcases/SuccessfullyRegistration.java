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
 * Успешная регистрация пользователя
 */
@RunWith(SerenityRunner.class)
public class SuccessfullyRegistration {

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
    public void registrationTsum() {
        homePageScenarioSteps.openPage();
        helpers.waitForPageLoad(driver);
        homePageScenarioSteps.homePageIsLoaded();
        homePageScenarioSteps.clickPersonalLk();

        authorizationPageScenarioSteps.authPageIsLoaded();
        authorizationPageScenarioSteps.buttonRegistration();

        registrationPageScenarioSteps.registrationPageIsLoaded();
        registrationPageScenarioSteps.buttonIsDisabled();
        registrationPageScenarioSteps.enterRandomEmail("testing@reg.ru");
        registrationPageScenarioSteps.enterPassword("testtest1");
        registrationPageScenarioSteps.clickButton();

        registrationPageScenarioSteps.checkSuccess();
    }
}
