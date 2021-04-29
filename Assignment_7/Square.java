package Assignment_7;

public class Square extends Shape {
  private double width;
  private double height;

  public Square(int x, int y) {
    super(x, y);
    setHeight(x);
    setWidth(y);
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  @Override
  public String toString() {

    return "Square: Width: " + width + "\n\t\t\t\t\tHeight: " + height;
  }
}
