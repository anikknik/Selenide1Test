package ru.evo;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideWikiTest {

    @Test
    void wikiJunitTest() {

        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("ul li.wiki-more-pages-link").$("button").click();
        $("ul[data-filterable-for=wiki-pages-filter]")
                .$(byText("SoftAssertions")).click();
        $$(".markdown-body h4").findBy(text("JUnit5"))
                .shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}
