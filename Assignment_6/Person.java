package Assignment_6;

public class Person {
  private String name;
  private String phone;


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
  public boolean equals(Object obj){

    Person p = (Person) obj;
    
    return !(p instanceof Person) || p.name.equals(name) && p.phone.equals(phone);
  }
}
