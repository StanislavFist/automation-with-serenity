package scripts;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import pages.RegistrationPage;
import pages.SuccessRegistration;

import java.util.Random;

public class RegistrationPageScenarioSteps extends ScenarioSteps {

    RegistrationPage registrationPage;
    SuccessRegistration successRegistration;

    @Step
    public void openPage() {
        registrationPage.open();
    }

    @Step
    public void registrationPageIsLoaded() {
        Assert.assertTrue("Registration page is not exist", registrationPage.registrationPageHasLoaded());
    }

    @Step
    public void buttonIsDisabled() {
        Assert.assertTrue("Button is not disabled", registrationPage.checkDisabledButton());
    }

    @Step
    public void enterRandomEmail(String email) {
        Random random = new Random();
        registrationPage.enterEmail(random.nextInt() + email);
    }

    @Step
    public void enterEmail(String email) {
        registrationPage.enterEmail(email);
    }

    @Step
    public void enterPassword(String password) {
        registrationPage.enterPassword(password);
    }

    @Step
    public void clickButton() {
        registrationPage.clickButton();
    }

    @Step
    public void errorNotice() {
        Assert.assertTrue("Notice is not exist", registrationPage.checkError());
    }

    @Step
    public void checkSuccess() {
        Assert.assertTrue("Registration is not success!", successRegistration.pageSuccess());
    }
}
