package sber.spasibo.tests.web;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import sber.spasibo.pages.CouponsPage;

public class TestBase {
    CouponsPage couponsPage = new CouponsPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://spasibosberbank.ru";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }
}
