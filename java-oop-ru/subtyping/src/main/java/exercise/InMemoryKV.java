package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {

    public InMemoryKV(Map<String, String> Key) {
        this.storage = storage;
    }
    @Override
    public void set(String key, String value) {
        storage.put(key, value);

    }
    @Override
    public void  unset(String key) {
        storage.remove(key);
    }
    public String get(String key, String defaultValue) {
        return storage.get(key);
        return map.getOrDefault(key, defaultValue);
    }
    public Map<String, String> toMap() {
        return new HashMap<>(map);
    }



}
// END
