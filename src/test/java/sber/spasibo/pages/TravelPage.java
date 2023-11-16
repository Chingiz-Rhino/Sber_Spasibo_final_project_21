package sber.spasibo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TravelPage {
    SelenideElement
            travelPageTap = $("[href='/travel']"),
            travelPageHeader = $(".lt-header__content-title");




    public TravelPage goToTravelPage(){
        travelPageTap.click();
        return this;
    }

    public TravelPage headerOfTravelPage(){
        travelPageHeader.shouldHave(text("Путешествуйте за бонусы"));
        return this;
    }
}

