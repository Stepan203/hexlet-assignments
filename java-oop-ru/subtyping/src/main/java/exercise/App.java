package exercise;

import java.util.Map;
import java.util.HashMap;
//import java.util.Map.Entry;
//import java.util.Set;
//import java.util.*;

// BEGIN
public class App implements KeyValueStorage {
    public Map<String, String> dict;

    public static Map<String, String> swapKeyValue(KeyValueStorage storage) {
        Map<String, String> swapMap = storage.toMap();
        System.out.println(storage);
       // for(var entry : toMap.entrySet()) {
        for(Map.Entry<String, String> entry : swapMap.entrySet()) {
            swapMap.put(entry.getValue(), entry.getKey());
        }
        return swapMap;
    }

    @Override
    public void set(String key, String value) {
        dict.put(key, value);

    }
    @Override
    public void  unset(String key) {
        dict.remove(key);
    }
    public String get(String key, String defaultValue) {
        // return toMap.get(key);
        return dict.getOrDefault(key, defaultValue);
    }
    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(dict);
    }
}
// END
