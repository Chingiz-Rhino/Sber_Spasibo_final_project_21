package sber.spasibo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class GiftCertificatePage {
    SelenideElement
                    giftCertificatePageTap = $(".menu-link__container"),

                    headerOfGiftCertificatePage = $(".certificates-list-page__title page__content-title");


    public GiftCertificatePage openGiftCertificatePage(){
        giftCertificatePageTap.shouldHave(exactText("Подарочные сертификаты")).click();
        return this;
    }
    public GiftCertificatePage verifyGiftCertificatePage(){
        headerOfGiftCertificatePage.shouldHave(text("Подарочные сертификаты"));
        return this;
    }
}
