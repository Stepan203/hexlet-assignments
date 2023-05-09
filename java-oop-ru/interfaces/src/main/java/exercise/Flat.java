package exercise;

// BEGIN
public class Flat implements Home {
    public double area;
    public double balconyArea;
    public int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }
    public Flat() {
    }

    //public Double getArea() {
    //    return area;
   // }

    public double getBalconyArea() {
        return balconyArea;
    }

    public int getFloor() {
        return floor;
    }
    @Override
    public double getArea() {
        return this.area + this.balconyArea;
    }
    @Override
    public int compareTo(Home home) {
        if (home.getArea() < this.getArea()) {
            return 1;
        }
        if (home.getArea() > this.getArea()) {
            return -1;
        }
        else {
            return 0;
        }
    }
    public String toString() {
        return "Квартира площадью " + this.getArea() + " метров на " + this.getFloor() + " этаже";
    }
}
// END
