package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.ListIterator;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> home, int num) {
        List<String> listHome = new ArrayList<>();
        if (home.isEmpty()) {
            return listHome;
        }
        home.sort((n1, n2) -> n1.compareTo(n2));
        for (var i = 0; i < num; i++) {
            listHome.add(home.get(i).toString());
        }
        return listHome;
    }
}
// END
