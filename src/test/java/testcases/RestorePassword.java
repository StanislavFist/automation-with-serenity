package testcases;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pageHelpers.Helpers;
import scripts.AuthorizationPageScenarioSteps;
import scripts.ForgotPageScenarioSteps;

/**
 * Попытка авторизации, восстановление пароля пользователя
 */
@RunWith(SerenityRunner.class)
public class RestorePassword {

    @Managed(uniqueSession = true)
    WebDriver driver;

    @Steps
    Helpers helpers;

    @Steps
    AuthorizationPageScenarioSteps authorizationPageScenarioSteps;

    @Steps
    ForgotPageScenarioSteps forgotPageScenarioSteps;

    @Test
    public void restorePasswordTsum() {
        authorizationPageScenarioSteps.openPage();
        helpers.waitForPageLoad(driver);
        authorizationPageScenarioSteps.authPageIsLoaded();
        authorizationPageScenarioSteps.buttonIsDisabled();
        authorizationPageScenarioSteps.enterEmail("yogad99432@enmail1.com");
        authorizationPageScenarioSteps.enterPassword("12345678");
        authorizationPageScenarioSteps.clickButton();
        authorizationPageScenarioSteps.errorNotice();
        authorizationPageScenarioSteps.clickForget();

        forgotPageScenarioSteps.forgotPageIsLoaded();
    }
}
