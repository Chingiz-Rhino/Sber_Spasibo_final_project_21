package sber.spasibo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MobileAppPagesPage {
    SelenideElement
            mobileAppPageTap = $("[href='/landings/app']"),
            headerOfChips = $(".appInfo__items"),
            privilegeLevelTap = $(""),
            transferOfBonusesTap = $(""),
            balanceAndHistoryTap = $("");


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

    public MobileAppPagesPage verifyPrivilegeLevelPage() {
        privilegeLevelTap.shouldHave(text(""));
        return this;
    }

    public MobileAppPagesPage verifyTransferOfBonusesPage() {
        transferOfBonusesTap.shouldHave(text(""));
        return this;
    }
}
