package exercise;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App implements KeyValueStorage {
    public static Map<String, String> swapKeyValue(Map<String, String> oldMap) {
        Map<String, String> swapMap = new HashMap<>();
        for (String key : oldMap.keySet()) {
      //  for(Map.Entry<String, String> entry : oldMap.entrySet()) {
            swapMap.put(oldMap.get(key), key);
        }
        return swapMap;
    }
}
// END
