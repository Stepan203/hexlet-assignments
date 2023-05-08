package exercise;

// BEGIN
public class Cottage implements Home {
    //public double getArea();
  //  public int getFloorCount();
  //  public int compareTo();
    public Cottage(Double getArea, Integer getFloorCount) {
        area = this.area();
        floorCount = this.floorCount();
    }
    public Cottage() {
    }
    @Override
    public Double getArea() {
        return area;
    }

    public Integer getFloorCount() {
        return floorCount;
    }

    public void toString() {
        System.out.println("%s этажный коттедж площадью %s метров");
    }
    @Override
    public Integer compareTo() {
        return compareTo;
    }
}
// END
