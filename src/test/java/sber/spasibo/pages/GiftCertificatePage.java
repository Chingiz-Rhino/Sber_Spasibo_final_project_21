package sber.spasibo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class GiftCertificatePage {
    SelenideElement
            giftCertificatePageTap = $("[href='/certificates/list']"),
            headerOfGiftCertificatePage = $(".page__content-title"),
            cityButton = $("[aria-label='Оставить выбранным город Москва']"),
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
        headerOfGiftCertificatePage.shouldHave(text("Подарочные сертификаты"));
        return this;
    }

    public GiftCertificatePage chooseCity() {
        cityButton.click();
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
