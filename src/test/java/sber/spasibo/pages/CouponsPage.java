package sber.spasibo.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CouponsPage {
    SelenideElement
            couponPageTap = $(".menu-link__container"),
            headerOfCouponsPage = $(".page__content-title");


    public CouponsPage openWebSite() {
        open("https://spasibosberbank.ru/");
        return this;
    }

    public CouponsPage openCouponPage() {
        couponPageTap.shouldHave(text("Купоны")).click();
        return this;
    }

    public CouponsPage verifyCouponsMainPage(){
        headerOfCouponsPage.shouldHave(text("Купоны"));
        return this;
    }
}
