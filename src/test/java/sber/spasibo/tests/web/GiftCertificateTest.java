package sber.spasibo.tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class GiftCertificateTest extends TestBase {

    @Test
    @DisplayName("Testing of Gift Certificate page opening")
    void couponsOpenTest() {
        step("Open main page", () -> {
            openWebSite();
        });
        step("Open Gift Certificate page", () -> {
            giftCertificatePage.openGiftCertificatePage();
        });
        step("Verify Gift Certificate page", () -> {
            giftCertificatePage.verifyGiftCertificatePage();
        });
    }
}
