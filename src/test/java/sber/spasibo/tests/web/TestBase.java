package sber.spasibo.tests.web;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import sber.spasibo.pages.*;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    CouponsPage couponsPage = new CouponsPage();
    GiftCertificatePage giftCertificatePage = new GiftCertificatePage();
    MobileAppPagesPage mobileAppPagesPage = new MobileAppPagesPage();
    PartnersPage partnersPage = new PartnersPage();
    SberPrimePage sberPrimePage = new SberPrimePage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://spasibosberbank.ru";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";

    }

    public TestBase openWebSite() {
        open("https://spasibosberbank.ru/");
        return this;
    }
}
