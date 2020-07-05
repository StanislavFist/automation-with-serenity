package scripts;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import pages.ForgotPage;

public class ForgotPageScenarioSteps extends ScenarioSteps {

    ForgotPage forgotPage;

    @Step
    public void forgotPageIsLoaded() {
        Assert.assertTrue("Forgot page is not exist", forgotPage.checkElementName());
    }
}
