package sber.spasibo.tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class SberPrimeTest extends TestBase{
    @Test
    @DisplayName("Go to Sber Prime page test")
    void selectTravelPageTest() {
        step("Open main page", () -> {
            openWebSite();
        });
        step("Open Sber Prime page", () -> {
            sberPrimePage.goToSberPrimePage();
            sberPrimePage.chooseCity();
        });
        step("Verify result", ()->{
            sberPrimePage.headerOfTravelPage();
        });

    }

    @Test
    @DisplayName("Select the 'Okko' tab test")
    void selectTrainTest() {
        step("Open main page", () -> {
            openWebSite();
        });
        step("Open SberPrime page", () -> {
            sberPrimePage.goToSberPrimePage();
            sberPrimePage.chooseCity();
        });
        step("Select 'Okko' page", ()->{
            sberPrimePage.cookiesAcceptTap();
            sberPrimePage.scrollPage();
            sleep(3000);
        });
        step("", () -> {


        });
    }

    @Test
    @DisplayName("Select the plane tickets tab test")
    void selectPlaneTest() {
        step("", () -> {
        });
        step("", () -> {
        });
        step("", ()->{
        });
        step("", () -> {
        });
    }

    @Test
    @DisplayName("Select hotels tab test")
    void selectHotelTest() {
        step("", () -> {
        });
        step("", () -> {
        });
        step("", ()->{
        });
        step("", () -> {
        });
    }
}
