package ru.evo;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepoTest {

    @Test
    void testSoftAssertion() {

        // открыть страницу Github
        open("https://github.com");

        // ввести в поле поиска Selenide и нажать Enter
        $(".header-search-input").setValue("selenide").pressEnter();
        // Выбираем первый линк из поиска
        $$("ul.repo-list li").first().$("a").click();
        // Проверить, что в заголовке линка указано selenide/selenide
        $("h2").shouldHave(text("selenide / selenide"));

        // ARRANGE
        // ACT
        // ACT
        // ASSERT
        // ACT
        // ASSERT

        // GIVEN
        // WHEN
        // THEN

    }
}
