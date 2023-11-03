package sber.spasibo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MobileAppPagesPage {
    SelenideElement
            mobileAppPageTap = $("[href='/landings/app']"),
            headerOfChips = $(".appInfo__items"),
            chipsTaps = $(".app-buttons-wrapper");


    public MobileAppPagesPage scrollPage() {
        $(".appInfo").scrollTo();
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
        chipsTaps.$(byText("Уровень привилегий")).shouldHave(text("Уровень привилегий")).click();
        return this;
    }

    public MobileAppPagesPage verifyPrivilegeLevelPage() {
        headerOfChips.shouldHave(text("Проверяйте уровень"));
        return this;
    }

    public MobileAppPagesPage tapOnTransferBonusesChips() {
        chipsTaps.$(byText("Перевод бонусов")).shouldHave(text("Перевод бонусов")).click();
        return this;
    }

    public MobileAppPagesPage verifyTransferBonusesPage() {
        headerOfChips.shouldHave(text("Пользуйтесь выгодой"));
        return this;
    }



}
