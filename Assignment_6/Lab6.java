package Assignment_6;

import java.util.ArrayList;

public class Lab6 {
  public static void main(String[] args) {
    ArrayList<Person> ppl = new ArrayList<Person>();

    ppl.add(new Person("Carl", "(083) 123 1234"));
    ppl.add(new Person("Carl", "(083) 123 1234"));
    ppl.add(new Employee("123456789", "Bob", "(083) 123 1234"));
    ppl.add(new Employee("123456789", "Alan", "(083) 123 1234"));

    System.out.printf("The Person %s is equal to %s: %s \n",ppl.get(0).getName(),ppl.get(1).getName(), ppl.get(0).equals(ppl.get(1)));
    System.out.printf("The Employee %s is equal to %s: %s \n",ppl.get(2).getName(), ppl.get(3).getName(), ppl.get(2).equals(ppl.get(3)));

    System.out.printf("Object 2 and object 3 are equal: %s \n",ppl.get(2) == ppl.get(3));

    printArrayList(ppl);

  }

  public static <E> void printArrayList(ArrayList<E> arrlist) {
    for (E element : arrlist) {
      System.out.println(element.toString());
    }
  }
}
