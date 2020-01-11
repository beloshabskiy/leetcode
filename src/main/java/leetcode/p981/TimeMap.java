package leetcode.p981;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 981. Time Based Key-Value Store
 * Create a timebased key-value store class TimeMap, that supports two operations.
 * 1. set(string key, string value, int timestamp)
 * Stores the key and value, along with the given timestamp.
 * 2. get(string key, int timestamp)
 * Returns a value such that set(key, value, timestamp_prev) was called previously, with timestamp_prev <= timestamp.
 * If there are multiple such values, it returns the one with the largest timestamp_prev.
 * If there are no values, it returns the empty string ("").
 */
public class TimeMap {
    private static final String DEFAULT_VALUE = "";
    private final Map<String, TreeMap<Integer, String>> map = new HashMap<>();

    public void set(String key, String value, int timestamp) {
        map.compute(key, (k, v) -> {
            TreeMap<Integer, String> result = v == null ? new TreeMap<>() : v;
            result.put(timestamp, value);
            return result;
        });
    }

    public String get(String key, int timestamp) {
        TreeMap<Integer, String> entries = map.get(key);
        if (entries == null) {
            return DEFAULT_VALUE;
        }

        Map.Entry<Integer, String> floor = entries.floorEntry(timestamp);
        if (floor == null) {
            return DEFAULT_VALUE;
        } else {
            return floor.getValue();
        }
    }
}
