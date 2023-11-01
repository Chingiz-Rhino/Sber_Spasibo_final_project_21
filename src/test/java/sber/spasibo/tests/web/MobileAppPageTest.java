package sber.spasibo.tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class MobileAppPageTest extends TestBase{

    @Test
    @DisplayName("Testing information about Balance and History on page MobileApp")
    void informationAboutBalanceAndHistoryTest() {
        step("Open main page", () -> {
            openWebSite();
        });
        step("Open Mobile app page", () -> {
            mobileAppPagesPage.openMobileAppPage();
            mobileAppPagesPage.scrollPage();
        });
        step("Verify Balance and History information on page", () -> {
            mobileAppPagesPage.verifyBalanceAndHistoryPage();
        });
    }

}
