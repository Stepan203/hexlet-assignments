package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static String male = "male";
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
       // String male = "male";
        return users.stream()
                .filter(p -> p.get("gender").equals("male"))
                .sorted(Comparator.comparing(m -> (String)m.get("birthday")))
                .map(p -> p.get("name"))
                .collect(Collectors.toList());
    }
}
// END
