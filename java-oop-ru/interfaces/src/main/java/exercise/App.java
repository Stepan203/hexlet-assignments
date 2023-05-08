package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public int num;
    public Home apartments;

    public App(Home apartments, Integer num) {
        this.apartments = apartments;
        this.num = num;
       // this.buildApartmentsList = buildApartmentsList;
    }
    public App() {
    }

    void buildApartmentsList(List Home, Integer num) {
        System.out.println("Квартира площадью %s метров на %s этаже");
    }
}
// END
