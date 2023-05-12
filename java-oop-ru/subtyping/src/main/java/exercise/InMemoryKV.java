package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    public Map<String, String> dict = new HashMap<>();

    public InMemoryKV(Map<String, String> dict) {
        this.dict = dict;
    }
    @Override
    public void set(String key, String value) {
        dict.put(key, value);

    }
    @Override
    public void  unset(String key) {
        dict.remove(key);
    }
    @Override
    public String get(String key, String defaultValue) {
       // return toMap.get(key);
        return dict.getOrDefault(key, defaultValue);
    }
    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(dict);
       // return dict;
    }



}
// END
