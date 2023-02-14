package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {
    public static Map<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        Map<String, String> res = new LinkedHashMap<>();
        Set<String> keys = new TreeSet<>(data1.keySet());
        keys.addAll(data2.keySet());
        System.out.println(keys);
        for(String key: keys) {
            if(!data1.containsKey(key)) {
                res.put(key, "added");
        } else if (!data2.containsKey(key)) {
                res.put(key, "deleted");
            }
            else if (data1.get(key).equals(data2.get(key))) {
                res.put(key, "unchanged");
            }
            else {
                res.put(key, "changed");
            }


        }
        return res;

    }
}
//END
