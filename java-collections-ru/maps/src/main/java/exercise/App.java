package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public static String getWordCount() {
    Map<String, Integer> cars = new HashMap<>();
    for (String key : unique) {
        mp2.put(key, Collections.frequency(list, key));
    }
    System.out.println(mp2);
}
//END
