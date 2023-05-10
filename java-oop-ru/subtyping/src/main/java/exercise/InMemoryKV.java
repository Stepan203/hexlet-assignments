package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    public InMemoryKV(Map<String, String> storage) {
        this.storage = storage;
    }
    @Override
    public void set(String key, String value) {
        Map.put(key, value);

    }
    @Override
    public void  unset(String key) {
        Map.remove(key);
    }
    public String get(String key, String defaultValue) {
        return Map.get(key);
    }
    public Map<String, String> toMap() {
        return Map;
    }



}
// END
