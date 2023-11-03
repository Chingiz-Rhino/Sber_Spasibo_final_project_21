package sber.spasibo.tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class PartnersTest extends TestBase {
    @Test
    @DisplayName("Testing the tab selection all partners")
    void selectAllPartnersTest() {
        step("Open main page", () -> {
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
    @Test
    @DisplayName("Testing accumulating partners count")
    void selectCheckBoxAccumulateTest() {
        step("Open main page", () -> {
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
