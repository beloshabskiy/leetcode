package leetcode.p729;

import java.util.Map;
import java.util.TreeMap;

/**
 * 729. My Calendar I
 * Implement a MyCalendar class to store your events. A new event can be added if adding the event will not cause a double booking.
 * Your class will have the method, book(int start, int end). Formally, this represents a booking on the half open interval [start, end), the range of real numbers x such that start <= x < end.
 * A double booking happens when two events have some non-empty intersection (ie., there is some time that is common to both events.)
 * For each call to the method MyCalendar.book, return true if the event can be added to the calendar successfully without causing a double booking. Otherwise, return false and do not add the event to the calendar.
 */
public class MyCalendar_2 implements MyCalendar {
    private final TreeMap<Integer, Integer> bookings = new TreeMap<>();

    @Override
    public boolean book(int start, int end) {
        Map.Entry<Integer, Integer> previousStart = bookings.floorEntry(start);
        Map.Entry<Integer, Integer> nextStart = bookings.ceilingEntry(start);

        if ((previousStart == null || previousStart.getValue() <= start) && (nextStart == null || nextStart.getKey() >= end)) {
            bookings.put(start, end);
            return true;
        } else {
            return false;
        }
    }
}
