package Assignment_7;

public class Shape extends Point {
  protected Point centrePoint;

  public Shape(int x, int y) {
    super(x, y);
    setCentrePoint(x, y);
  }

  public void setCentrePoint(int x, int y) {
    this.centrePoint = new Point(x, y);
  }

  public Point getCentrePoint() {
    return centrePoint;
  }

  @Override
  public String toString() {

    return super.toString();
  }

}
