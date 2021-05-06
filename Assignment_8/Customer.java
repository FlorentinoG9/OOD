package Assignment_8;

public class Customer implements Comparable<Customer> {
  /** Parameters of the Customer Class */
  private static int idCounter;
  private int id;
  private int age;
  private String name;
  private String phoneNumber;

  /** Constructor */
  Customer(String name, String phoneNumber, int age) {
    setId(idCounter());
    setAge(age);
    setName(name);
    setPhoneNumber(phoneNumber);
  }

  /** Setters */
  public void setId(int id) {
    this.id = id;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /** Getters */
  public int getId() {
    return this.id;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  /** Methods */
  private static int idCounter() {
    return ++idCounter;
  }

  // Oveerride the method toString() so we can show the customer details
  @Override
  public String toString() {

    return getId() + " " + getName() + ", " + getPhoneNumber() + ", " + getAge();
  }

  // Customize the compareTo() method so we can sort the customers by their age
  @Override
  public int compareTo(Customer obj) {
    /**
     * if the current customer's age is greater, return 1, if the obj's age that we
     * are comparing is greater than this customer's age return -1 else return 0
     */
    return this.age > obj.age ? 1 : this.age < obj.age ? -1 : 0;
  }

}
