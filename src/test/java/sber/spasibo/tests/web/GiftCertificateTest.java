package sber.spasibo.tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class GiftCertificateTest extends TestBase {

    @Test
    @DisplayName("Testing of Gift Certificate page opening")
    void giftCertificateOpenTest() {
        step("Open main page", () -> {
            openWebSite();
        });
        step("Open Gift Certificate page", () -> {
            giftCertificatePage.openGiftCertificatePage();
            giftCertificatePage.chooseCity();
        });
        step("Verify Gift Certificate page", () -> {
            giftCertificatePage.verifyGiftCertificatePage();
        });
    }

    @Test
    @DisplayName("Testing of Gift Certificate page opening")
    void backToMainPageFromGiftCertificatePage() {
        step("Open main page", () -> {
            openWebSite();
        });
        step("Open Gift Certificate page", () -> {
            giftCertificatePage.openGiftCertificatePage();
            giftCertificatePage.chooseCity();
        });
        step("Back from Gift Certificate page to main", () -> {
            giftCertificatePage.backToMainPage();
        });
    }

    @Test
    @DisplayName("Testing of Gift Certificate page opening")
    void chooseSbersEcosystemCategory() {
        step("Open main page", () -> {
            openWebSite();
        });
        step("Open Gift Certificate page", () -> {
            giftCertificatePage.openGiftCertificatePage();
            giftCertificatePage.chooseCity();
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
