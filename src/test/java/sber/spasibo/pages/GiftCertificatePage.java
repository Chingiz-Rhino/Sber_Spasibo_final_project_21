package sber.spasibo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class GiftCertificatePage {
    SelenideElement
                    giftCertificatePageTap = $("[href='/certificates/list']"),

                    headerOfGiftCertificatePage = $(".page__content-title"),
                    cityButton = $("[aria-label='Оставить выбранным город Москва']");


    public GiftCertificatePage openGiftCertificatePage(){
        giftCertificatePageTap.shouldHave(text("Подарочные сертификаты")).click();
        return this;
    }
    public GiftCertificatePage verifyGiftCertificatePage(){
        headerOfGiftCertificatePage.shouldHave(text("Подарочные сертификаты"));
        return this;
    }

    public GiftCertificatePage chooseCity(){
        cityButton.click();
        return this;
    }
}
