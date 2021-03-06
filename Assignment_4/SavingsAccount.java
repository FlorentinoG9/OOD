package Assignment_4;

public class SavingsAccount extends Account {

  static int classCounter = 0;

  /** Call the super class constructor to init the Savings account */
  SavingsAccount(int accountNumber) {
    super(accountNumber);
    classCounter++;
  }

  /** declare a variable for the interest */
  private double interestRate;

  /**
   * set the interest rate for the savings account and divide it by 100 si we have
   * the percentage of the interest rate
   */
  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate / 100;
  }

  /**
   * interest rate getter so we dont manipulate diredctly the interest variable
   */
  public double getInterestRate() {
    return interestRate;
  }

  /** Add the interest rate compounding to the assigned balance of the account */
  public void addRate() {
    setBalance(getBalance() * (1 + getInterestRate()));
  }

  public void displayNumberOfAccount() {
    // get the static int by calling the classfirst
    System.out.println("Amount of Saving Accounts: " + SavingsAccount.classCounter);
  }
}
