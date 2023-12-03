package sber.spasibo.tests.web;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import sber.spasibo.pages.GiftCertificatePage;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static io.qameta.allure.SeverityLevel.NORMAL;

@Owner("Аскаров Ченгиз")
@Epic(value = "Тестирование UI функционала сайта spasibosberbank.ru")
@Feature(value = "Базовая функциональность приложения SberSpasibo")
@Story("Подарочные сертификаты")
public class GiftCertificateTest extends TestBase {
    GiftCertificatePage giftCertificatePage = new GiftCertificatePage();
    @Severity(NORMAL)
    @Tag("Smoke")
    @Tag("GiftCertificate")
    @Test
    @DisplayName("Testing of Gift Certificate page opening")
    void giftCertificateOpenTest() {
        step("Open main page", () -> {
            openWebSite();
        });
        step("Open Gift Certificate page", () -> {
            giftCertificatePage.chooseCity();
            giftCertificatePage.openGiftCertificatePage();

        });
        step("Verify Gift Certificate page", () -> {
            giftCertificatePage.verifyGiftCertificatePage();
        });
    }
    @Severity(NORMAL)
    @Tag("Smoke")
    @Tag("GiftCertificate")
    @Test
    @DisplayName("Testing Back from Gift Certificate page to main")
    void backToMainPageFromGiftCertificatePage() {
        step("Open main page", () -> {
            openWebSite();
        });
        step("Open Gift Certificate page", () -> {
            giftCertificatePage.openGiftCertificatePage();
        });
        step("Back from Gift Certificate page to main", () -> {
            giftCertificatePage.backToMainPage();
        });
    }
    @Severity(NORMAL)
    @Tag("Smoke")
    @Tag("GiftCertificate")
    @Test
    @DisplayName("Testing Chose Sbers Ecosystem category")
    void chooseSbersEcosystemCategory() {
        step("Open main page", () -> {
            openWebSite();
        });
        step("Open Gift Certificate page", () -> {
            giftCertificatePage.openGiftCertificatePage();
        });
        step("Chose Sbers Ecosystem category", () -> {
            giftCertificatePage.selectSbersEcosystemCheckBox();
            giftCertificatePage.scrollPage();
        });
        step("Verify selected category", () -> {
            giftCertificatePage.verifySersEcosystemCategories();
            sleep(3000);
        });
    }
}
