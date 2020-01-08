package leetcode.p731;

import java.util.TreeMap;

/**
 * 731. My Calendar II
 * Implement a MyCalendarTwo class to store your events. A new event can be added if adding the event will not cause a triple booking.
 * Your class will have one method, book(int start, int end). Formally, this represents a booking on the half open interval [start, end),
 * the range of real numbers x such that start <= x < end.
 * A triple booking happens when three events have some non-empty intersection (ie., there is some time that is common to all 3 events.)
 * For each call to the method MyCalendar.book, return true if the event can be added to the calendar successfully without causing a triple booking.
 * Otherwise, return false and do not add the event to the calendar.
 */
public class MyCalendarTwo {
    private final TreeMap<Integer, Integer> counts = new TreeMap<>();

    public boolean book(int start, int end) {
        counts.compute(start, (k, v) -> v == null ? 1 : ++v);
        counts.compute(end, (k, v) -> v == null ? -1 : --v);

        int activeBookings = 0;
        for (Integer nextCount : counts.values()) {
            activeBookings += nextCount;
            if (activeBookings >= 3) {
                counts.compute(start, (k, v) -> --v);
                counts.compute(end, (k, v) -> ++v);
                return false;
            }
        }
        return true;
    }
}
