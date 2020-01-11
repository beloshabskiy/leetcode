package leetcode.p981;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeMapTest {

    @Test
    void shouldHandleBasicScenario1() {
        TimeMap kv = new TimeMap();
        kv.set("foo", "bar", 1);

        assertEquals("bar", kv.get("foo", 1));
        assertEquals("bar", kv.get("foo", 3));

        kv.set("foo", "bar2", 4);

        assertEquals("bar2", kv.get("foo", 4));
        assertEquals("bar2", kv.get("foo", 5));
    }

    @Test
    void shouldHandleBasicScenario2() {
        TimeMap kv = new TimeMap();
        kv.set("love", "high", 10);
        kv.set("love", "low", 20);

        assertEquals("", kv.get("love", 5));
        assertEquals("high", kv.get("love", 10));
        assertEquals("high", kv.get("love", 15));
        assertEquals("low", kv.get("love", 20));
        assertEquals("low", kv.get("love", 25));
    }

}