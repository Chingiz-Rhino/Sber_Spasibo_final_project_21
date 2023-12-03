package sber.spasibo.tests.web;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import sber.spasibo.pages.MobileAppPagesPage;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static io.qameta.allure.SeverityLevel.NORMAL;

@Owner("Аскаров Ченгиз")
@Epic(value = "Тестирование UI функционала сайта spasibosberbank.ru")
@Feature(value = "Базовая функциональность приложения SberSpasibo")
@Story("Мобильное приложение")
public class MobileAppPageTest extends TestBase {
    MobileAppPagesPage mobileAppPagesPage = new MobileAppPagesPage();
    @Severity(NORMAL)
    @Tag("Smoke")
    @Tag("MobileApp")
    @Test
    @DisplayName("Testing information about Balance and History on page MobileApp")
    void informationAboutBalanceAndHistoryTest() {
        step("Open main page", () -> {
            openWebSite();
        });
        step("Open Mobile app page", () -> {
            mobileAppPagesPage.chooseCity();
            mobileAppPagesPage.openMobileAppPage();
            mobileAppPagesPage.scrollPage();
        });
        step("Verify Balance and History information on page", () -> {
            mobileAppPagesPage.verifyBalanceAndHistoryPage();
        });
    }
    @Severity(NORMAL)
    @Tag("Smoke")
    @Tag("MobileApp")
    @Test
    @DisplayName("Testing information about Privilege level on page MobileApp")
    void informationAboutPrivilegeLevelTest() {
        step("Open main page", () -> {
            openWebSite();
        });
        step("Open Mobile app page", () -> {
            mobileAppPagesPage.chooseCity();
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
    @Severity(NORMAL)
    @Tag("Smoke")
    @Tag("MobileApp")
    @Test
    @DisplayName("Testing information about Main page on page MobileApp")
    void informationAboutTransferBonusTest() {
        step("Open main page", () -> {
            openWebSite();
        });
        step("Open Mobile app page", () -> {
            mobileAppPagesPage.chooseCity();
            mobileAppPagesPage.openMobileAppPage();
            mobileAppPagesPage.scrollPage2();
        });
    }


}
