package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
class App {
    public static Map<String,Integer> getWordCount(String str) {
        Map<String, Integer> map = new HashMap<>();
        if (str.equals("")) {
            return map;
        }
        List<String> stringList = Arrays.asList(str.split(" "));
        for (String temp: stringList) {
            map.put(temp, Collections.frequency(stringList, temp));
        }
        return map;
    }

    public static String toString (Map<String, Integer> map) {
       // System.out.println(map);
       // String str = map.toString();
        //StringBuilder strBuilder = new StringBuilder(str);
       // String result = str.replace("=", ": ").replace(",", "\n \",\" ").replace("{", "[\"  ").replace("}", "\n \"]");
        //List<String> listResult = Arrays.asList(result);
       // System.out.println(result);
       // System.out.println(result.length());
       // return result;
        if (map.isEmpty()) {
            return map.toString();
        }
        StringBuilder result = new StringBuilder("{");
        for (Map.Entry<String, Integer> word : map.entrySet()) {
            result.append("\n  ").append(word.getKey()).append(": ").append(word.getValue());
        }
        result.append("\n}");
        return result.toString();
    }
}
//END
