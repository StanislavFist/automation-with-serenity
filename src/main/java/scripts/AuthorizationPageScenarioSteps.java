package scripts;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import pages.AuthorizationPage;

public class AuthorizationPageScenarioSteps extends ScenarioSteps {

    AuthorizationPage authorizationPage;

    @Step
    public void openPage() {
        authorizationPage.open();
    }

    @Step
    public void buttonRegistration() {
        authorizationPage.buttonRegistration();
    }

    @Step
    public void authPageIsLoaded() {
        Assert.assertTrue("Auth page is not exist", authorizationPage.authorizationPageHasLoaded());
    }

    @Step
    public void buttonIsDisabled() {
        Assert.assertTrue("Button is not disabled", authorizationPage.checkDisabledButton());
    }

    @Step
    public void enterEmail(String email) {
        authorizationPage.enterEmail(email);
    }

    @Step
    public void enterPassword(String password) {
        authorizationPage.enterPassword(password);
    }

    @Step
    public void clickButton() {
        authorizationPage.clickButton();
    }

    @Step
    public void clickForget() {
        authorizationPage.clickForgetPassword();
    }

    @Step
    public void errorNotice() {
        Assert.assertTrue("Notice is not exist", authorizationPage.checkError());
    }
}
