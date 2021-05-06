package Assignment_8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Lab8 {
  public static void main(String[] args) throws IOException {
    ArrayList<Customer> customers = new ArrayList<Customer>();

    customers.add(new Customer("Bob", "(083) 123 4567", 20));
    customers.add(new Customer("Carla", "(083) 123 4567", 30));
    customers.add(new Customer("Fernando", "(083) 123 4567", 32));
    customers.add(new Customer("Orlaith", "(083) 123 4567", 22));
    customers.add(new Customer("Maddox", "(083) 123 4567", 19));

    // print unsorted Collection
    for (Customer customer : customers) {
      System.out.println(customer.toString());
    }

    // sort the collection with a custom compareTo method
    Collections.sort(customers);

    // create the new File where we are going to print or add the collection
    PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

    // print sorted collection
    for (Customer customer : customers) {
      System.out.println(customer.toString());
      // add each customer to the text file
      out.println(customer.toString());
    }

    out.close();
  }
}
