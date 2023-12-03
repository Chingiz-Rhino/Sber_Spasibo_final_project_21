package sber.spasibo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class GiftCertificatePage {
    SelenideElement
            giftCertificatePageTap = $("[href='/certificates/list']"),
            headerOfGiftCertificatePage = $(".certificates-list-page__title ui-page-h1"),
            cityButton = $(".app-button__inner"),
            backToMainPageTap = $(".bread__item"),
            chooseSbersEcosystemCB = $(".app-checkbox__text"),
            countOfGiftCertificate = $(".certificates-list-page__count");


    public GiftCertificatePage scrollPage() {
        $(".certificates-list-page__count").scrollTo();
        return this;
    }

    public GiftCertificatePage openGiftCertificatePage() {
        giftCertificatePageTap.shouldHave(text("Подарочные сертификаты")).click();
        return this;
    }

    public GiftCertificatePage verifyGiftCertificatePage() {
        headerOfGiftCertificatePage.$(byText("Подарочные сертификаты")).shouldHave(text("Подарочные сертификаты")).click();
        return this;
    }

    public GiftCertificatePage chooseCity() {
        cityButton.shouldHave(text("Всё верно")).click();
        return this;
    }

    public GiftCertificatePage backToMainPage() {
        backToMainPageTap.click();
        return this;
    }

    public GiftCertificatePage selectSbersEcosystemCheckBox() {
        chooseSbersEcosystemCB.shouldHave(text("Экосистема сбера")).click();
        return this;
    }

    public GiftCertificatePage verifySersEcosystemCategories() {
        countOfGiftCertificate.shouldHave(text("4 предложения"));
        return this;
    }


}
