package ru.evo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragnDropTests {


    @Test
    void dragNDrop() {

        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));

    }


    @Disabled("Selenium видит физический курсор и отвлекается на него. " +
            "Тест успешно проходит если подвести курсор к требуемому объекту или запускать на VM")
    @Test
    void moveNDrop() {

        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().moveToElement($("#column-a"))
                .clickAndHold().moveByOffset(523, 166).release().perform();
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));

    }
}
