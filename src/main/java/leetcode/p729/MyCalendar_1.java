package leetcode.p729;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 729. My Calendar I
 * Implement a MyCalendar class to store your events. A new event can be added if adding the event will not cause a double booking.
 * Your class will have the method, book(int start, int end). Formally, this represents a booking on the half open interval [start, end), the range of real numbers x such that start <= x < end.
 * A double booking happens when two events have some non-empty intersection (ie., there is some time that is common to both events.)
 * For each call to the method MyCalendar.book, return true if the event can be added to the calendar successfully without causing a double booking. Otherwise, return false and do not add the event to the calendar.
 */
public class MyCalendar_1 implements MyCalendar {
    private final List<BookingPeriod> bookings = new LinkedList<>();

    @Override
    public boolean book(int start, int end) {
        Iterator<BookingPeriod> iterator = bookings.iterator();
        for (int i = 0; i < bookings.size(); i++) {
            BookingPeriod nextPeriod = iterator.next();
            if (end <= nextPeriod.start) {
                bookings.add(i, new BookingPeriod(start, end));
                return true;
            } else if (nextPeriod.end > start) {
                return false;
            }
        }
        bookings.add(new BookingPeriod(start, end));
        return true;
    }

    private static class BookingPeriod {
        private final int start;
        private final int end;

        public BookingPeriod(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
