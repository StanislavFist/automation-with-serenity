package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SuccessRegistration extends PageObject {

    @FindBy(xpath = "//*[text() = ' Ваши предпочтения ']")
    public WebElementFacade successPage;

    public boolean pageSuccess() {
        return successPage.isVisible();
    }

}
