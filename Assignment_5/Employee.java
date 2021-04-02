package Assignment_5;

public class Employee implements IPRSI, ITaxable {

  private String name;
  private int pps;
  private double annualSalary;

  Employee(String name, int string, double annualSalary){
    setAnnualSalary(annualSalary);
    setName(name);
    setPps(string);
  }

  public void setAnnualSalary(double annualSalary) {
    this.annualSalary = annualSalary;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public void setPps(int pps) {
    this.pps = pps;
  }

  @Override
  public double calculateTax() {

    return annualSalary <= 33800 ? (annualSalary * 0.2) : (annualSalary * 0.2) + ((annualSalary - 33800) * .4);
  }

  @Override
  public void printTax() {
    System.out.printf("Name: %s\n", name );
    System.out.printf("PPS Number: %d\n", pps);
    System.out.printf("PRSI: %.2f\n", calculatePRSI());
    System.out.printf("TAX: %.2f\n", calculateTax());
      
  }

  @Override
  public double calculatePRSI() {
    return (annualSalary / 52) < 352 ? 0 : annualSalary * RATE;
  }
  
}
