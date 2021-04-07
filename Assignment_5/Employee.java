package Assignment_5;

public class Employee implements IPRSI, ITaxable {

  /** Init the variables for employee */
  private String name;
  private int pps;
  private double annualSalary;

  /** Init the constructor and the parameters we are going to pass */
  Employee(String name, int string, double annualSalary) {
    setAnnualSalary(annualSalary);
    setName(name);
    setPps(string);
  }

  /** Setters */
  /** Set Annual Salary */
  public void setAnnualSalary(double annualSalary) {
    this.annualSalary = annualSalary;
  }

  /** Set Name */
  public void setName(String name) {
    this.name = name;
  }

  /** Set PPS */
  public void setPps(int pps) {
    this.pps = pps;
  }

  /** Getters */
  /** Get the Annual Salary */
  public double getAnnualSalary() {
    return annualSalary;
  }

  /** Get the name */
  public String getName() {
    return name;
  }

  /** Get the pps */
  public int getPps() {
    return pps;
  }

  /** Methods */
  /**
   * Init the methods of the interface ITaxable and do some calculations for the
   * tax, if the annual Salary is less than 33,800 just get the 20% of the tax of
   * the annual Salary amount if is higher get the 20% of 33800 + annuala Salary
   * minus the amount and then get the 40% of the that reminder and return
   * whatever value is right as a double
   */
  @Override
  public double calculateTax() {

    return getAnnualSalary() <= 33800 ? (getAnnualSalary() * 0.2) : (33800 * 0.2) + ((getAnnualSalary() - 33800) * .4);
  }

  /**
   * Calculate the PRSI from the interface the the final RATE if the annual salary
   * divide it by 52 we get the salary by week and if this weekly amount is less
   * than 352 we return 0 otherwise we get the annual salary multiplied by RATE
   */
  @Override
  public double calculatePRSI() {
    return (annualSalary / 52) < 352 ? 0 : annualSalary * RATE;
  }

  /**
   * Print the details of the object employee by calling the getters and the
   * methods respectively
   */

  @Override
  public void printTax() {
    System.out.printf("Name: %s\n", getName());
    System.out.printf("PPS Number: %d\n", getPps());
    System.out.printf("PRSI: %.2f\n", calculatePRSI());
    System.out.printf("TAX: %.2f\n", calculateTax());

  }

}
