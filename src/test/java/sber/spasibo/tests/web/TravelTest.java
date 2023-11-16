package sber.spasibo.tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class TravelTest  extends TestBase{
    @Test
    @DisplayName("Go to travel page test")
    void selectTravelPageTest() {
        step("Open main page", () -> {
            openWebSite();
        });
        step("Open Travel page", () -> {
            travelPage.goToTravelPage();
        });
        step("Verify result", ()->{
            travelPage.headerOfTravelPage();
        });

    }

    @Test
    @DisplayName("Select the train tickets tab test")
    void selectTrainTest() {
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
