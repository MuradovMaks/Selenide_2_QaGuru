import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop
{
    @Test
    public void DragsAndDrop()
    {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        SelenideElement element = $("#column-a");
        SelenideElement element2 = $("#column-b");
        actions().moveToElement(element).clickAndHold().moveToElement(element2).release().perform();
        element.shouldHave(Condition.text("B"));
        element2.shouldHave(Condition.text("A"));
        sleep(5000);

    }
}
