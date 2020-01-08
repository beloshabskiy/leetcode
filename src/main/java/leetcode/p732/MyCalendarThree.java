package leetcode.p732;

import java.util.TreeMap;

/**
 * 732. My Calendar III
 * Implement a MyCalendarThree class to store your events. A new event can always be added.
 * Your class will have one method, book(int start, int end). Formally, this represents a booking on the half open interval [start, end), the range of real numbers x such that start <= x < end.
 * A K-booking happens when K events have some non-empty intersection (ie., there is some time that is common to all K events.)
 * For each call to the method MyCalendar.book, return an integer K representing the largest integer such that there exists a K-booking in the calendar.
 */
public class MyCalendarThree {
    private final TreeMap<Integer, Integer> counts = new TreeMap<>();

    public int book(int start, int end) {
        counts.compute(start, (k, v) -> v == null ? 1 : ++v);
        counts.compute(end, (k, v) -> v == null ? -1 : --v);

        int activeBookings = 0;
        int maxActiveBookings = 0;
        for (Integer nextCount : counts.values()) {
            activeBookings += nextCount;
            if (activeBookings > maxActiveBookings) {
                maxActiveBookings = activeBookings;
            }
        }
        return maxActiveBookings;
    }
}
