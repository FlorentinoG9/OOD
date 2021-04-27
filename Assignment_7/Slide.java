package Assignment_7;

import java.util.ArrayList;

public class Slide {
  private int slideNumber;
  private ArrayList<SlideElement> elements;

  Slide(int slideNumber, ArrayList<SlideElement> elements){
    setElements(elements);
    setSlideNumber(slideNumber);
  }

  public void setElements(ArrayList<SlideElement> elements) {
    this.elements = elements;
  }

  public void setSlideNumber(int slideNumber) {
    this.slideNumber = slideNumber;
  }
}
