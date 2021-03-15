package Assignment_1;

public class Lab1 {
  public static void main(String[] args) {
    // initialize every student for every constructor 2 each
    Student s1 = new Student("John", "male", 12);
    Student s2 = new Student("Bob", "male", 15);
    Student s3 = new Student("Bertha", "Smith", "female", 20);
    Student s4 = new Student("Carla", "Castillo", "female", 30);

    /*
     * display each student on the console output calling the public method of the
     * Student class
     */
    s1.display();
    s2.display();
    s3.display();
    s4.display();
  }
}
