package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.tsum.ru/")
public class HomePage extends PageObject {

    @FindBy(xpath = "//*[@class='page js-body']")
    public WebElementFacade homePageXpath;

    @FindBy(xpath = "//*[@class='header__link ng-star-inserted']")
    public WebElementFacade personalLk;

    public boolean homePageHasLoaded() {
        return homePageXpath.isVisible();
    }

    public void clickPersonalLk() {
        personalLk.click();
    }
}
