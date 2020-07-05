package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.tsum.ru/password/forgot/?backurl=%2F")
public class ForgotPage extends PageObject {

    @FindBy(xpath = "//*[text() = ' Восстановить пароль ']")
    public WebElementFacade restorePassword;

    public boolean checkElementName() {
        return restorePassword.isVisible();
    }
}
