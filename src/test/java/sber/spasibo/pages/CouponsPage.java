package sber.spasibo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CouponsPage {
    SelenideElement
            couponPageTap = $("[href='/coupons/list']"),
            cityButton = $(".app-button__inner"),
            headerOfCouponsPage = $(".coupons-list-page__title ui-page-h1"),
            offersCount = $(".coupons-list-page__top"),
            cafeAndRestaurantCB = $(".app-checkbox__text");


    public CouponsPage openCouponPage() {
        couponPageTap.shouldHave(text("Купоны")).click();
        return this;
    }

    public CouponsPage verifyCouponsMainPage() {
        headerOfCouponsPage.$(byText("Купоны")).shouldHave(text("Купоны")).click();
        return this;
    }

    public CouponsPage verifyCouponsOffers() {
        offersCount.shouldHave(text("60 предложений"));
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

    public CouponsPage chooseCity() {
        cityButton.shouldHave(text("Всё верно")).click();
        return this;
    }

}
