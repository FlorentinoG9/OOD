package Assignment_7;

public class TextBox {
  private String text = "Sample Text";
  private int colour = 123456;

  TextBox(int colour, String txt){
    this.colour = colour;
    this.text = txt;
  }

  @Override
  public String toString() {
    
    StringBuilder txt = new StringBuilder();

    txt.append("Text Area: " + text + "\n\t\t\t\tColor: " + colour);

    return txt.toString();
  }

}
