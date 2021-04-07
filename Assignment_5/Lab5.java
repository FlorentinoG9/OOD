package Assignment_5;

import java.util.ArrayList;

public class Lab5 {
  public static void main(String[] args) {
    /** Init the ArrayList of ITacxable objects */
    ArrayList<ITaxable> obj = new ArrayList<ITaxable>();

    /**
     * add new objects inside the arraylist 2 of each 2 Car objects and 2 Employee
     * Objects
     */
    obj.add(new Car("BMW", "M3", 3000));
    obj.add(new Car("BMW", "M2", 1500));
    obj.add(new Employee("Carl", 123456789, 68000));
    obj.add(new Employee("Bob", 987654321, 10500));

    /**
     * call the printTax for each element inside the obj ArrayList since we have
     * this method included as an interface this is a method that is inlcuded in
     * every object
     */
    for (ITaxable i : obj) {
      i.printTax();
      System.out.println();
    }

  }
}
