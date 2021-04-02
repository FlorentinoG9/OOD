package Assignment_5;

import java.util.ArrayList;

public class Lab5 {
  public static void main(String[] args) {
  ArrayList<ITaxable> obj = new ArrayList<ITaxable>();

  obj.add(new Car("BMW", "M3", 3000));
  obj.add(new Car("BMW", "M2", 1500));
  obj.add(new Employee("Carl", 123456789, 68000));
  obj.add(new Employee("Bob", 987654321, 10500));


  for (ITaxable i : obj) {
    i.printTax();
    System.out.println();
  }

  }
}
