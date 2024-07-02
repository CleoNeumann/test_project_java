import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstClassTest {

    @Test
    void dataToday() {

        LocalDate localDate = LocalDate.parse("01.07.2024", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        assertEquals(DayOfWeek.MONDAY, localDate.getDayOfWeek());

    }
}