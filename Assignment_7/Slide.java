package Assignment_7;

import java.util.ArrayList;

public class Slide extends SlideElement {
  private int slideNumber;
  private ArrayList<SlideElement> elements = new ArrayList<SlideElement>();

  Slide(int colour, String txt) {
    super(colour, txt);
    this.slideNumber += 1;
    setElements(colour, txt);
  }

  public void setSlideNumber(int slideNumber) {
    this.slideNumber = slideNumber;
  }

  public void setElements(int colour, String txt) {
    this.elements.add(new SlideElement(colour, txt));
  }

  @Override
  public String toString() {
    StringBuilder sld = new StringBuilder();

    sld.append("Slide: " + slideNumber + "\n\t");

    for (SlideElement slideElement : elements) {
      // System.out.println(slideElement);
      sld.append(slideElement.toString() + "\n\t\t\t");
    }

    return sld.toString();

  }

}
