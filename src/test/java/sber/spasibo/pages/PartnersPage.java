package sber.spasibo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PartnersPage {
    SelenideElement
            partnersPageTap = $("[href='/partners']"),
            selectTabTap = $("[href='/partners-filter?sectionId=all']"),
            filterListHeader = $(".partners-filter-list__title"),
            selectCheckBox = $(".app-checkbox");


    public PartnersPage openPartnersPage() {
        partnersPageTap.click();
        return this;
    }

    public PartnersPage selectAllPartnersTab() {
        selectTabTap.click();
        return this;
    }
    public PartnersPage verifyAllPartnersTabPage() {
        filterListHeader.shouldHave(text("165 партнёров"));
        return this;
    }

    public PartnersPage selectAccumulateCheckBox(){
        selectCheckBox.$(byText("Накопить")).shouldHave(text("Накопить")).click();
        return this;
    }
    public PartnersPage verifyAccumulatePartnersCount(){
        filterListHeader.shouldHave(text("157 партнёров"));
        return this;
    }

}
