import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
public class SearchFindestPage
{
    @Test
    void FindestPage()
    {
        open("https://github.com/");
        $("ul li:nth-child(2) > button").hover();
        $("[href='/enterprise']").click();
        $(".application-main").shouldHave(text("To build, scale, and deliver secure software."));

        sleep(5000);
    }
}
