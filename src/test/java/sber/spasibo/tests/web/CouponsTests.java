package sber.spasibo.tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.logevents.SelenideLogger.step;


public class CouponsTests extends TestBase {
    @Test
    @DisplayName("Testing of coupons page opening")
    void couponsOpenTest(){
        step("Open main page", ()->{
        couponsPage.openWebSite();
        });
        step("Open Coupons page", ()->{
        couponsPage.openCouponPage();
        });
        step("Verify coupons page", ()->{
        couponsPage.verifyCouponsMainPage();
        });
    }
}
