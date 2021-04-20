package Assignment_6;

public class Employee extends Person {

  private String pps;

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
  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder();

    sb.append("Name: " + getName() + "\n");
    sb.append("Phone: " + getPhone() + "\n");
    sb.append("PPS: " + getPps() + "\n");

    return sb.toString();
  }

  @Override
  public boolean equals(Object obj) {

    Employee p = (Employee) obj;

    return !(p instanceof Employee) || p.pps.equals(pps);
  }

}
