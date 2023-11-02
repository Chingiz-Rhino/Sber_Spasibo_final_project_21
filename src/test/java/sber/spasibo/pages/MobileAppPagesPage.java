package sber.spasibo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.files.DownloadActions.click;

public class MobileAppPagesPage {
    SelenideElement
            mobileAppPageTap = $("[href='/landings/app']"),
            headerOfChips = $(".appInfo__items"),
            chipsTaps = $(".app-buttons-wrapper");


    //scroll
    public MobileAppPagesPage scrollPage() {
        $(".appInfo").scrollTo();
        return this;
    }

    //open mobile page
    public MobileAppPagesPage openMobileAppPage() {
        mobileAppPageTap.click();
        return this;
    }

    //balance and history
    public MobileAppPagesPage verifyBalanceAndHistoryPage() {
        headerOfChips.shouldHave(text("Управляйте бонусами"));
        return this;
    }

    // Privilege level
    public MobileAppPagesPage tapOnPrivilegeLevelChips() {
        chipsTaps.$(byText("Уровень привилегий")).shouldHave(text("Уровень привилегий")).click();
        return this;
    }

    public MobileAppPagesPage verifyPrivilegeLevelPage() {
        headerOfChips.shouldHave(text("Проверяйте уровень"));
        return this;
    }

    //Transfer bonus
    public MobileAppPagesPage tapOnTransferBonusesChips() {
        chipsTaps.$(byText("Перевод бонусов")).shouldHave(text("Перевод бонусов")).click();
        return this;
    }

    public MobileAppPagesPage verifyTransferBonusesPage(){
        headerOfChips.shouldHave(text("Пользуйтесь выгодой"));
        return this;
    }

}
