package sber.spasibo.tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.logevents.SelenideLogger.step;


public class CouponsTests extends TestBase {
    @Test
    @DisplayName("Testing of coupons page opening")
    void couponsOpenTest() {
        step("Open main page", () -> {
            openWebSite();
        });
        step("Open Coupons page", () -> {
            couponsPage.openCouponPage();
        });
        step("Verify coupons page", () -> {
            couponsPage.verifyCouponsMainPage();
        });
    }

    @Test
    @DisplayName("Checking the number of offers on a page")
    void couponsOffersOnPage() {
        step("Open main page", () -> {
            openWebSite();
        });
        step("Open Coupons page", () -> {
            couponsPage.openCouponPage();
        });
        step("Verify offers count", () -> {
            couponsPage.verifyCouponsOffers();
        });
    }

    @Test
    @DisplayName("Checking the checkbox of cafes and restaurants")
    void couponsCafeAndRestaurantsCB() {
        step("Open main page", () -> {
            openWebSite();
        });
        step("Open Coupons page", () -> {
            couponsPage.openCouponPage();
        });
        step("Select Cafe and Restaurant check box", () -> {
            couponsPage.selectCafeAndRestaurantOffers();
        });
        step("Verify result", () -> {
            couponsPage.verifyCafeAndRestaurantOffers();
        });
    }
}
