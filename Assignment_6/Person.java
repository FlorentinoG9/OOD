package Assignment_6;

public class Person {
  /** Class Variables */
  private String name;
  private String phone;

  /** Constructor */
  Person(String name, String phone) {
    setName(name);
    setPhone(phone);
  }

  /** Setters */
  public void setName(String name) {
    this.name = name;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /** Getters */
  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }

  /** Methods */
  /**
   * Override the methos to work by testing on what I am doing with the objects
   * inside the class and compare with the variables inside the class toString
   * will print the variables values
   */
  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder();

    sb.append("Name: " + getName() + "\n");
    sb.append("Phone: " + getPhone() + "\n");

    return sb.toString();
  }

  /**
   * the equals method will get back a boolean value indicating it the instance is
   * a person or not also will check if the name variable of the person object is
   * equal to the name of the person as well as the phone variable this will
   * ensure to call the equals method instead of the double equals sign
   */
  @Override
  public boolean equals(Object obj) {

    Person p = (Person) obj;

    return !(p instanceof Person) || p.name.equals(name) && p.phone.equals(phone);
  }
}
