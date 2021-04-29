package Assignment_7;

import java.util.ArrayList;
import java.util.Random;

public class SlideElement extends TextBox {
  private ArrayList<Shape> shape = new ArrayList<Shape>();
  private ArrayList<TextBox> textBoxes = new ArrayList<TextBox>();

  SlideElement(int colour, String txt) {
    super(colour, txt);
    setTextBoxes(colour, txt);
    this.shape.add(new Circle(new Random().nextInt(10) + 1, new Random().nextInt(10) + 1));
    this.shape.add(new Square(new Random().nextInt(10) + 1, new Random().nextInt(10) + 1));
    this.shape.add(new Polygon(new Random().nextInt(10) + 1, new Random().nextInt(10) + 1));
  }

  public void setTextBoxes(int colour, String txt) {
    this.textBoxes.add(new TextBox(colour, txt));
  }
  

  @Override
  public String toString() {
    StringBuilder element = new StringBuilder();

    element.append("\tElement: \n\t\t\tShapes:\n");

    for (Shape shp : shape) {
      element.append("\t\t\t\t" + shp.toString() + "\n");
    }
    element.append("\t\t\tText:\n");
    for (TextBox text : textBoxes) {
      element.append("\t\t\t\t" + text.toString() + "\n");
    }

    return element.toString();
  }
}
