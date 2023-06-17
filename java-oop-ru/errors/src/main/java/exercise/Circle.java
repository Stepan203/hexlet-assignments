package exercise;
import java.lang.Math.*;
//import ecxercise.Point;
// BEGIN
class Circle {
    public Point point;
    public int radius;
    public Circle (Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }
  // public Circle {
  //  }

    public int getRadius() {
        return radius;
    }
    public double getSquare() throws NegativeRadiusException {
        if (getRadius() < 0){
            throw new NegativeRadiusException("Не удалось посчитать площадь");
        }
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
// END
