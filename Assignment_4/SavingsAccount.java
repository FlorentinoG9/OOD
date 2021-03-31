package Assignment_4;

public class SavingsAccount extends Account {
  /** Call the super class constructor to init the Savings account */
  SavingsAccount(int accountNumber) {
    super(accountNumber);

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
}
