import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop
{
    @Test
    public void dragsAndDropTest()
    {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        SelenideElement element = $("#column-a");
        SelenideElement element2 = $("#column-b");
        $("#column-a").shouldHave(text("A"));
        $("#column-b").shouldHave(text("B"));
        actions().moveToElement(element).clickAndHold().moveToElement(element2).release().perform();
        element.shouldHave(text("B"));
        element2.shouldHave(text("A"));

    }
}
