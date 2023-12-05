package sber.spasibo.tests.web;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import sber.spasibo.pages.PartnersPage;

import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static io.qameta.allure.SeverityLevel.NORMAL;

@Owner("Аскаров Ченгиз")
@Epic(value = "Тестирование UI функционала сайта spasibosberbank.ru")
@Feature(value = "Базовая функциональность приложения SberSpasibo")
@Story("Партнёры и Акции")
public class PartnersTest extends TestBase {
    PartnersPage partnersPage = new PartnersPage();
    @Severity(NORMAL)
    @Tag("Smoke")
    @Tag("Partners")
    @Test
    @DisplayName("Testing the tab selection all partners")
    void selectAllPartnersTest() {
        step("Open Website page", () -> {
            openWebSite();
        });
        step("Open Partners and actions page", () -> {
            partnersPage.openPartnersPage();
        });
        step("Select 'All partners' tab", ()->{
            partnersPage.selectAllPartnersTab();
        });
        step("Verify result", () -> {
            partnersPage.verifyAllPartnersTabPage();
        });
    }
    @Severity(NORMAL)
    @Tag("Smoke")
    @Tag("Partners")
    @Test
    @DisplayName("Testing accumulating partners count")
    void selectCheckBoxAccumulateTest() {
        step("Open Website page", () -> {
            openWebSite();
        });
        step("Open Partners and actions page", () -> {
            partnersPage.openPartnersPage();
        });
        step("Select 'All partners' tab ", () -> {
            partnersPage.selectAllPartnersTab();
        });
        step("Select 'Accumulate' check box ", () -> {
            partnersPage.selectAccumulateCheckBox();
        });
        step("Verify partners who accumulate", () -> {
            partnersPage.verifyAccumulatePartnersCount();
        });
    }
}
