package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.tsum.ru/registration/?backurl=%2F")
public class RegistrationPage extends PageObject {

    @FindBy(xpath = "//*[contains(@class,'auth-layout__form')]")
    public WebElementFacade registrationForm;

    @FindBy(xpath = "//*[@formcontrolname = 'email' and @placeholder = 'Email']")
    public WebElementFacade emailInput;

    @FindBy(xpath = "//*[@formcontrolname = 'password' and @placeholder = 'Пароль']")
    public WebElementFacade passwordInput;

    @FindBy(xpath = "//*[@type = 'submit' and contains(@class, 'ui-button_disabled')]")
    public WebElementFacade disabledButtonSignIn;

    @FindBy(xpath = "//*[@type = 'submit' and text() = 'Зарегистрироваться']")
    public WebElementFacade buttonSignUp;

    @FindBy(xpath = "//*[text() = 'Указан некорректный email']")
    public WebElementFacade incorrectData;

    public boolean registrationPageHasLoaded() {
        return registrationForm.isVisible();
    }

    public boolean checkDisabledButton() {
        return disabledButtonSignIn.isVisible();
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickButton() {
        buttonSignUp.click();
    }

    public boolean checkError() {
        return incorrectData.isVisible();
    }
}
