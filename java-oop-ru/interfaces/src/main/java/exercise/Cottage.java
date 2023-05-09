package exercise;

// BEGIN
public class Cottage implements Home {
    public double area;
    public int floorCount;
 //   public int compareTo();
    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }
    public Cottage() {
    }
    public double getsArea() {
        return area;
    }

    @Override
    public double getArea() {
        return area;
    }

    public int getFloorCount() {
        return floorCount;
    }

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
        return this.getFloorCount() + " этажный коттедж площадью " + this.getArea() + " метров";
    }
}
// END
