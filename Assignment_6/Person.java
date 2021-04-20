package Assignment_6;


public class Person {
  private String name;
  private String phone;

  Person(String name, String phone) {
    setName(name);
    setPhone(phone);
  }

  public Person(String name2) {
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

  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder();

    sb.append("Name: " + getName() + "\n");
    sb.append("Phone: " + getPhone() + "\n");
    
    return sb.toString();
  }

  @Override
  public boolean equals(Object obj) {

    Person p = (Person) obj;

    return !(p instanceof Person) || p.name.equals(name) && p.phone.equals(phone);
  }
}
