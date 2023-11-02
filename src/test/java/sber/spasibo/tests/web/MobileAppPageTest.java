package sber.spasibo.tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class MobileAppPageTest extends TestBase {

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

    @Test
    @DisplayName("Testing information about Privilege level on page MobileApp")
    void informationAboutPrivilegeLevelTest() {
        step("Open main page", () -> {
            openWebSite();
        });
        step("Open Mobile app page", () -> {
            mobileAppPagesPage.openMobileAppPage();
            mobileAppPagesPage.scrollPage();
        });
        step("Tap on Privilege level chips", () -> {
            mobileAppPagesPage.tapOnPrivilegeLevelChips();
        });
        step("Verify Privilege level information on page", () -> {
            mobileAppPagesPage.verifyPrivilegeLevelPage();
        });
    }

    @Test
    @DisplayName("Testing information about Transfer bonus on page MobileApp")
    void informationAboutTransferBonusTest() {
        step("Open main page", () -> {
            openWebSite();
        });
        step("Open Mobile app page", () -> {
            mobileAppPagesPage.openMobileAppPage();
            mobileAppPagesPage.scrollPage();
        });
        step("Tap on Transfer bonus chips", () -> {
            mobileAppPagesPage.tapOnTransferBonusesChips();
        });
        step("Verify Transfer bonus information on page", () -> {
            mobileAppPagesPage.verifyTransferBonusesPage();
        });
    }


}
