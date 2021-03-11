package Assignment_2;

public class Lab2 {
  public static void main(String[] args) {
    // initialize every student for every constructor 2 each
    Student s1 = new Student("joHn", "male", 12);
    Student s2 = new Student("bob", "m", 15);
    Student s3 = new Student("bertha", "SmiTH", "g", 200);
    Student s4 = new Student("carla", "CastiLLo", "female", 30);

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
