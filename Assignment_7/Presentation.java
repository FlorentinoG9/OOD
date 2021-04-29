package Assignment_7;

import java.util.ArrayList;

public class Presentation extends Slide {
  private ArrayList<Slide> slides = new ArrayList<Slide>();

  Presentation(int colour, String txt) {
    super(colour, txt);
    this.slides.add(new Slide(colour, txt));
  }

  public void setSlides(ArrayList<Slide> slides) {
    this.slides = slides;
  }

  @Override
  public String toString() {

    return "Presentation: \n\t" + super.toString();
  }

}
