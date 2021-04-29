package Assignment_7;

public class Circle extends Shape {
  private double radius;

  public Circle(int x, int y) {
    super(x, y);
    this.radius = centrePoint.getX() <= centrePoint.getY() ? centrePoint.getY() - centrePoint.getX()
        : centrePoint.getX() - centrePoint.getY();
  }

  @Override
  public String toString() {

    return "Circle: radius: " + radius;
  }

}
