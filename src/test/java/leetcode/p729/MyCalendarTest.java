package leetcode.p729;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyCalendarTest {

    @ParameterizedTest
    @MethodSource("calendars")
    public void shouldHandleBaseScenario(MyCalendar calendar) {
        assertTrue(calendar.book(10, 20));
        assertTrue(calendar.book(30, 40));
        assertTrue(calendar.book(22, 25));
        assertTrue(calendar.book(25, 26));
        assertFalse(calendar.book(31, 32));
        assertFalse(calendar.book(5, 11));
        assertFalse(calendar.book(9, 55));
    }

    @ParameterizedTest
    @MethodSource("calendars")
    public void shouldHandleAnotherScenario(MyCalendar calendar) {
        assertTrue(calendar.book(47, 50));
        assertTrue(calendar.book(33, 41));
        assertFalse(calendar.book(39, 45));
        assertFalse(calendar.book(33, 42));
        assertTrue(calendar.book(25, 32));
        assertFalse(calendar.book(26, 35));
        assertTrue(calendar.book(19, 25));
        assertTrue(calendar.book(3, 8));
        assertTrue(calendar.book(8, 13));
        assertFalse(calendar.book(18, 27));
    }

    private static Stream<MyCalendar> calendars() {
        return Stream.of(new MyCalendar_1(), new MyCalendar_2());
    }

}