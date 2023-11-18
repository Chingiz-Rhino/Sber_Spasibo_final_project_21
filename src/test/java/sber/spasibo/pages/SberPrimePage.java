package sber.spasibo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SberPrimePage {
    SelenideElement
            sberPrimePageTap = $("[href='/sberprime']"),
            sberPrimePageHeader = $(".sberprime__title"),
            cityButton = $("[aria-label='Оставить выбранным город Москва']"),
            cookieAccept = $(".cookies_accept__button");





    public SberPrimePage scrollPage(){
        $(".sberprime__block").scrollTo();
        return this;
    }

    public SberPrimePage chooseCity() {
        cityButton.click();
        return this;
    }

    public SberPrimePage cookiesAcceptTap(){
        cookieAccept.shouldHave(text("Принять")).click();
        return this;
    }

    public SberPrimePage goToSberPrimePage(){
        sberPrimePageTap.click();
        return this;
    }

    public SberPrimePage headerOfTravelPage(){
        sberPrimePageHeader.$(byText("Подписка СберПрайм")).shouldHave(text("Подписка СберПрайм"));
        return this;
    }


}

