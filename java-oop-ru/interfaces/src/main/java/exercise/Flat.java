package exercise;

// BEGIN
public class Flat implements Home {
    public double area();
    public double balconyArea();
    public int floor();

    public Flat(Double area, Double balconyArea, Integer floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }
    public Flat() {
    }

    //public Double getArea() {
    //    return area;
   // }

    public Double getBalconyArea() {
        return balconyArea;
    }

    public Integer getFloor() {
        return floor;
    }
    public Double getArea() {
        return area + balconyArea;
    }

    public Integer compareTo(Home another) {
        if (getArea() > another.getArea()) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public void toString() {
        System.out.println("Квартира площадью %s метров на %d этаже");
    }


}
// END
