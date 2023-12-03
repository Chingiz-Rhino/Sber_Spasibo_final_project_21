package sber.spasibo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MobileAppPagesPage {
    SelenideElement
            mobileAppPageTap = $("[href='/mobile-app']"),
            headerOfChips = $(".mobile-app-tabs__content"),
            chipsTaps = $(".app-buttons-wrapper"),
            mobileAppMainPage = $(".mobile-app-cards__text"),
            cityButton = $(".app-button__inner");


    public MobileAppPagesPage scrollPage() {
        $(".mobile-app-tabs__images").scrollTo();
        return this;
    }

    public MobileAppPagesPage scrollPage2() {
        $(".mobile-app-cards__card-wrapper").scrollTo();
        return this;
    }

    public MobileAppPagesPage openMobileAppPage() {
        mobileAppPageTap.click();
        return this;
    }

    public MobileAppPagesPage verifyBalanceAndHistoryPage() {
        headerOfChips.shouldHave(text("Управляйте бонусами"));
        return this;
    }

    public MobileAppPagesPage tapOnPrivilegeLevelChips() {
        chipsTaps.shouldHave(text("Уровень привилегий")).click();
        return this;
    }

    public MobileAppPagesPage verifyPrivilegeLevelPage() {
        headerOfChips.shouldHave(text("Проверяйте уровень"));
        return this;
    }

    public MobileAppPagesPage verifyMobileAppMainPage(){
        mobileAppMainPage.$(byText(" И это ещё не всё ")).shouldHave(text(" И это ещё не всё "));
        return this;
    }

    public MobileAppPagesPage chooseCity() {
        cityButton.shouldHave(text("Всё верно")).click();
        return this;
    }



}
