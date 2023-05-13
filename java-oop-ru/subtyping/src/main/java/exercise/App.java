package exercise;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
//import java.util.Map.Entry;
//import java.util.Set;
//import java.util.*;

// BEGIN
public class App {
    public static KeyValueStorage swapKeyValue(KeyValueStorage storage) {
        Map<String, String> data = storage.toMap();
        for (Map.Entry<String, String> keyValue : data.entrySet()) {
            String newKey = keyValue.getValue();
            String newValue = keyValue.getKey();
            storage.set(newKey, newValue);
            storage.unset(newValue);
        }
        return storage;
    }
}
// END
