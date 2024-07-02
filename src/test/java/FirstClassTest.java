import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstClassTest {
    MainPage mainPage = new MainPage();

    @Test
    public void search() {
        mainPage.searchButton.click();

        $("[data-test-id='search-input']").sendKeys("Selenium");
        $("button[data-test='full-search-button']").click();

        $("input[data-test-id='search-input']").shouldHave(attribute("value", "Selenium"));
    }

    @Test
    void dataToday() {

        LocalDate localDate = LocalDate.parse("01.07.2024", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        assertEquals(DayOfWeek.MONDAY, localDate.getDayOfWeek());

    }
}