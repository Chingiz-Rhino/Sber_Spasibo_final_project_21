package sber.spasibo.tests.web;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import sber.spasibo.pages.CouponsPage;
import sber.spasibo.pages.GiftCertificatePage;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    CouponsPage couponsPage = new CouponsPage();
    GiftCertificatePage giftCertificatePage = new GiftCertificatePage();

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
