package tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest extends TestBase {
    @Test
    void dragAndDropTest() {
        open("/drag_and_drop");
        SelenideElement
                a = $("#column-a"),
                b = $("#column-b");

        a.dragAndDropTo(b);
        a.shouldHave(text("B"));
        b.shouldHave(text("A"));
    }
}
