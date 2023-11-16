package sber.spasibo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CouponsPage {
    SelenideElement
            couponPageTap = $(".menu-link__container"),
            headerOfCouponsPage = $(".page__content-title"),
            offersCount = $(".coupons-list-page__top"),
            cafeAndRestaurantCB = $(".app-checkbox__text");


    public CouponsPage openCouponPage() {
        couponPageTap.shouldHave(text("Купоны")).click();
        return this;
    }

    public CouponsPage verifyCouponsMainPage() {
        headerOfCouponsPage.shouldHave(text("Купоны"));
        return this;
    }

    public CouponsPage verifyCouponsOffers() {
        offersCount.shouldHave(text("56 предложений"));
        return this;
    }

    public CouponsPage selectCafeAndRestaurantOffers() {
        cafeAndRestaurantCB.shouldHave(text("Кафе и рестораны")).click();
        return this;
    }

    public CouponsPage verifyCafeAndRestaurantOffers() {
        offersCount.shouldHave(text("4 предложения"));
        return this;
    }

}
