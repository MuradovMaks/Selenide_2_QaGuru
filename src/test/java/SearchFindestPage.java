import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
public class SearchFindestPage
{
    @Test
    void findestPageTest()
    {
        open("https://github.com/");
        $(byTagAndText("button","Solutions")).hover();
        $("[href='/enterprise']").click();
        $(".application-main").shouldHave(text("To build, scale, and deliver secure software."));
    }
}
