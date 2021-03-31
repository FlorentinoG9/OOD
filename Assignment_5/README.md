### Object-Oriented Development

#### OOD Lab 5 – Interfaces & Java Collections

- Put your name and student number in a comment at the top of each file.
- Ensure that your code is well formatted e.g. lines after an opening brace should be indented. Each closing brace should be at the same indentation as the statement which opened it. (Use Ctrl + Shift + F if using Eclipse)
- It is compulsory to comment your code appropriately. For each of the exercises ensure that your code is sufficiently commented to demonstrate your understanding of the software you are writing. You do not have to comment every line however.
- Marks will be lost if the above instructions are not followed.
- You may discuss assignments with you classmates but you must write each assignment yourself. Copying another student’s code will be considered plagiarism. Outcomes vary from receiving zero in assessments to failing the course.

---

You need to use the Taxable and PRSI interfaces as detailed below (create a separate java file for each).
  public interface Taxable {
  public abstract double calculateTax();
  public abstract void printTax();
  }
  public interface PRSI {
  static final double rate = 0.04; // 4%
  public abstract double calculatePRSI();
  }

1.  a. Create a Car class which has a make, model and engine size as attributes
    b. Have this class implement the Taxable interface.
    c. A car’s tax is calculated as follows
    (i) If the engine is less than 1000 the tax is 200
    (ii) If the engine is between 1000 and 2000 the tax is 900
    (iii) If the engine is greater than 2000 the tax is 1800
    d. A car should implement the printTax() method by calculating its tax and then printing this along with the make, model and engine size.
2.  a. Create an Employee class which has a name, PPS number an annual salary.
    b. Have this class implement the Taxable and PRSI interfaces.
    c. An employee’s PRSI is calculated as follows:
    (i) If the employee earns less than 352 per week the PRSI is 0, otherwise the PRSI is the salary times PRSI.rate
    d. An employee’s Tax is calculated as follows:
    (i) An employee pays 20% tax on the first 33800 that he/she earns and 40% on the remainder.
    e. An employee should implement the printTax() method by calculating the PRSI and Tax and then printing this along with the name and PPS number.

3.  Create a class called Lab5 to test your classes. Create an ArrayList to hold Taxable objects and add two Cars and two Employees to this list. Iterate through the ArrayList calling printTax() on each of the objects.
