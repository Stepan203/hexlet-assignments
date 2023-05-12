package exercise;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static Map<String, String> swapKeyValue (KeyValueStorage storage) {
        Map<String, String> swapMap = new HashMap<>();
        for (String key : KeyValueStorage.entrySet()) {
      //  for(Map.Entry<String, String> entry : oldMap.entrySet()) {
            swapMap.put(key.getValue(), key.getKey());
        }
        return swapMap;
    }
}
// END
