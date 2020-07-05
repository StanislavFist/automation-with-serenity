package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.tsum.ru/login/?backurl=%2F")
public class AuthorizationPage extends PageObject {

    @FindBy(xpath = "//*[contains(@class,'auth-form')]")
    public WebElementFacade authForm;

    @FindBy(xpath = "//*[contains(@class,'login')]")
    public WebElementFacade emailInput;

    @FindBy(xpath = "//*[contains(@class,'pwd-input')]")
    public WebElementFacade passwordInput;

    @FindBy(xpath = "//*[@class = 'forget-pwd']")
    public WebElementFacade forgetPassword;

    @FindBy(xpath = "//*[text() = ' Регистрация ']")
    public WebElementFacade pageRegistration;

    @FindBy(xpath = "//*[@type = 'submit' and contains(@class, 'ui-button_disabled')]")
    public WebElementFacade disabledButtonSignIn;

    @FindBy(xpath = "//*[@type = 'submit' and text() = 'Войти ']")
    public WebElementFacade buttonSignIn;

    @FindBy(xpath = "//*[text() = 'Неверный логин или пароль']")
    public WebElementFacade incorrectData;


    public boolean authorizationPageHasLoaded() {
        return authForm.isVisible();
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

    public void buttonRegistration() {
        pageRegistration.click();
    }

    public void clickButton() {
        buttonSignIn.click();
    }

    public void clickForgetPassword() {
        forgetPassword.click();
    }

    public boolean checkError() {
        return incorrectData.isVisible();
    }
}