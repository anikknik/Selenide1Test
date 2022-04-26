package ru.evo;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ContributorsTest {

    @Test
    void FirstContributor() {

        // open repo page
        open("https://github.com/selenide/selenide");

        // drag mouse on 1st avatar in contributors
        $(".Layout-sidebar").$(byText("Contributors")).ancestor("div")
                .$$("ul li").first().hover();
        // check: popup with name Andrey Solntsev
        $$(".Popover-message").findBy(visible)
                .shouldHave(text("Andrei Solntsev"));
    }
}
