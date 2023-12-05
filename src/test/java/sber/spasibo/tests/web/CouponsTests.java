package sber.spasibo.tests.web;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import sber.spasibo.pages.CouponsPage;

import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static io.qameta.allure.SeverityLevel.NORMAL;


@Owner("Аскаров Ченгиз")
@Epic(value = "Тестирование UI функционала сайта spasibosberbank.ru")
@Feature(value = "Базовая функциональность приложения SberSpasibo")
@Story("Купоны")
public class CouponsTests extends TestBase {
    CouponsPage couponsPage = new CouponsPage();

    @Severity(NORMAL)
    @Tag("Smoke")
    @Tag("Coupons")
    @Test
    @DisplayName("Testing of coupons page opening")
    void couponsOpenTest() {
        step("Open Website page", () -> {
            openWebSite();
        });
        step("Open Coupons page", () -> {
            couponsPage.chooseCity();
            couponsPage.openCouponPage();
        });
        step("Verify coupons page", () -> {
            couponsPage.verifyCouponsMainPage();
        });
    }
    @Severity(NORMAL)
    @Tag("Smoke")
    @Tag("Coupons")
    @Test
    @DisplayName("Checking the number of offers on a page")
    void couponsOffersOnPageTest() {
        step("Open Website page", () -> {
            openWebSite();
        });
        step("Open Coupons page", () -> {
            couponsPage.chooseCity();
            couponsPage.openCouponPage();
        });
        step("Verify offers count", () -> {
            couponsPage.verifyCouponsOffers();
        });
    }
    @Severity(NORMAL)
    @Tag("Smoke")
    @Tag("Coupons")
    @Test
    @DisplayName("Checking the checkbox of cafes and restaurants")
    void couponsCafeAndRestaurantsCBTest() {
        step("Open Website page", () -> {
            openWebSite();
        });
        step("Open Coupons page", () -> {
            couponsPage.chooseCity();
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
