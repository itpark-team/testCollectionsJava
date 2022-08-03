package com.company;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GlobalData {
    private static Map<String, Object> dictionary = new HashMap<>();

    public static void add(String key, Object value) {
        dictionary.put(key, value);
    }

    public static Optional<Object> getObject(String key) {
        return Optional.ofNullable(dictionary.get(key));
    }

    public static Optional<String> getString(String key) {
        return Optional.ofNullable((String) dictionary.get(key));
    }

    public static Optional<Integer> getInteger(String key) {
        return Optional.ofNullable((Integer) dictionary.get(key));
    }

    public static boolean remove(String key) {
        return dictionary.remove(key) != null;
    }
}
