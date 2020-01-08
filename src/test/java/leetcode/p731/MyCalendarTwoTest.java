package leetcode.p731;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyCalendarTwoTest {

    @Test
    void shouldHandleBasicScenario() {
        MyCalendarTwo calendar = new MyCalendarTwo();
        assertTrue(calendar.book(10, 20));
        assertTrue(calendar.book(50, 60));
        assertTrue(calendar.book(10, 40));
        assertFalse(calendar.book(5, 15));
        assertTrue(calendar.book(5, 10));
        assertTrue(calendar.book(25, 55));
    }

    @Test
    void shouldHandleTestScenario1() {
        MyCalendarTwo calendar = new MyCalendarTwo();
        assertTrue(calendar.book(89, 100));
        assertTrue(calendar.book(30, 43));
        assertTrue(calendar.book(92, 100));
        assertTrue(calendar.book(31, 49));
        assertTrue(calendar.book(59, 76));
        assertTrue(calendar.book(60, 73));
        assertFalse(calendar.book(31, 49));
        assertFalse(calendar.book(80, 99));
        assertTrue(calendar.book(48, 60));
        assertFalse(calendar.book(36, 52));
        assertFalse(calendar.book(67, 82));
        assertFalse(calendar.book(96, 100));
        assertFalse(calendar.book(22, 35));
        assertFalse(calendar.book(18, 32));
        assertTrue(calendar.book(9, 24));
        assertTrue(calendar.book(11, 27));
        assertFalse(calendar.book(94, 100));
        assertFalse(calendar.book(12, 22));
        assertFalse(calendar.book(61, 74));
        assertFalse(calendar.book(3, 20));
        assertFalse(calendar.book(14, 28));
        assertFalse(calendar.book(27, 37));
        assertFalse(calendar.book(5, 20));
        assertTrue(calendar.book(1, 11));
        assertFalse(calendar.book(96, 100));
        assertFalse(calendar.book(33, 44));
        assertFalse(calendar.book(90, 100));
        assertFalse(calendar.book(40, 54));
        assertFalse(calendar.book(23, 35));
        assertFalse(calendar.book(18, 32));
        assertTrue(calendar.book(78, 89));
        assertFalse(calendar.book(56, 66));
        assertFalse(calendar.book(83, 93));
        assertFalse(calendar.book(45, 59));
        assertFalse(calendar.book(40, 59));
        assertFalse(calendar.book(94, 100));
        assertFalse(calendar.book(99, 100));
        assertFalse(calendar.book(86, 96));
        assertFalse(calendar.book(43, 61));
        assertFalse(calendar.book(29, 45));
        assertFalse(calendar.book(21, 36));
        assertFalse(calendar.book(13, 31));
        assertFalse(calendar.book(17, 30));
        assertFalse(calendar.book(16, 30));
        assertFalse(calendar.book(80, 94));
        assertFalse(calendar.book(38, 50));
        assertFalse(calendar.book(15, 30));
        assertFalse(calendar.book(62, 79));
        assertFalse(calendar.book(25, 39));
        assertTrue(calendar.book(73, 85));
        assertFalse(calendar.book(39, 56));
        assertFalse(calendar.book(80, 97));
        assertFalse(calendar.book(42, 57));
        assertFalse(calendar.book(32, 47));
        assertFalse(calendar.book(59, 78));
        assertFalse(calendar.book(35, 53));
        assertFalse(calendar.book(56, 74));
        assertFalse(calendar.book(75, 85));
        assertFalse(calendar.book(39, 54));
        assertFalse(calendar.book(63, 82));
    }

    @Test
    void shouldHandleTestScenario2() {
        MyCalendarTwo calendar = new MyCalendarTwo();
        assertTrue(calendar.book(33,44));
        assertTrue(calendar.book(85,95));
        assertTrue(calendar.book(20,37));
        assertTrue(calendar.book(91,100));
        assertFalse(calendar.book(89,100));
        assertTrue(calendar.book(77,87));
        assertFalse(calendar.book(80,95));
        assertTrue(calendar.book(42,61));
        assertFalse(calendar.book(40,50));
        assertFalse(calendar.book(85,99));
        assertFalse(calendar.book(74,91));
        assertTrue(calendar.book(70,82));
        assertTrue(calendar.book(5,17));
        assertFalse(calendar.book(77,89));
        assertTrue(calendar.book(16,26));
        assertFalse(calendar.book(21,31));
        assertFalse(calendar.book(30,43));
        assertTrue(calendar.book(96,100));
        assertFalse(calendar.book(27,39));
        assertTrue(calendar.book(44,55));
        assertFalse(calendar.book(15,34));
        assertFalse(calendar.book(85,99));
        assertFalse(calendar.book(74,93));
        assertFalse(calendar.book(84,94));
        assertFalse(calendar.book(82,94));
        assertFalse(calendar.book(46,65));
        assertFalse(calendar.book(31,49));
        assertTrue(calendar.book(58,73));
        assertFalse(calendar.book(86,99));
        assertFalse(calendar.book(73,84));
        assertFalse(calendar.book(68,80));
        assertFalse(calendar.book(5,18));
        assertFalse(calendar.book(75,87));
        assertFalse(calendar.book(88,100));
        assertFalse(calendar.book(25,41));
        assertFalse(calendar.book(66,79));
        assertFalse(calendar.book(28,41));
        assertFalse(calendar.book(60,70));
        assertFalse(calendar.book(62,73));
        assertFalse(calendar.book(16,33));
    }

    @Test
    void shouldHandleTestScenario2Simple() {
        MyCalendarTwo calendar = new MyCalendarTwo();
        assertTrue(calendar.book(33,44));
        assertTrue(calendar.book(85,95));
        assertTrue(calendar.book(20,37));
        assertTrue(calendar.book(91,100));
        assertTrue(calendar.book(77,87));
        assertTrue(calendar.book(42,61));
        assertTrue(calendar.book(70,82));
        assertTrue(calendar.book(5,17));
        assertTrue(calendar.book(16,26));
        assertTrue(calendar.book(96,100));
        assertTrue(calendar.book(44,55));
        assertTrue(calendar.book(58,73));
        assertFalse(calendar.book(60,70));
    }


}