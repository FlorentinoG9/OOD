package Assignment_6;

public class Employee extends Person {
  /** Class Variables */
  private String pps;

  /** Cunstructor */
  Employee(String pps, String name, String phone) {
    super(name, phone);
    setPps(pps);
  }

  /** Setters */
  public void setPps(String pps) {
    this.pps = pps;
  }

  /** Getters */
  public String getPps() {
    return pps;
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
    sb.append("PPS: " + getPps() + "\n");

    return sb.toString();
  }

  /**
   * The equals will get true or false if the object is equal to another object's
   * pps number 
   */
  @Override
  public boolean equals(Object obj) {

    Employee p = (Employee) obj;

    return !(p instanceof Employee) || p.pps.equals(pps);
  }

}
