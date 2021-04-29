package Assignment_7;

import java.util.ArrayList;

public class Polygon extends Shape {
  private ArrayList<Point> points = new ArrayList<Point>();
  
  public Polygon(int x, int y) {
    super(x, y);
    points.add(new Point(x, y));
  }


  @Override
  public String toString() {
    StringBuilder pts = new StringBuilder();

    pts.append("\tPoints:\n\t\t\t\t\t");

      pts.append(" " + points);
    
    
    return "Polygon:\n\t\t\t\t" + pts.toString();
  }

}
