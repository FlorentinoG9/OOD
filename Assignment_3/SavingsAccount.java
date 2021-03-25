package Assignment_3;

public class SavingsAccount extends Account {

  SavingsAccount(int accountNumber) {
    super(accountNumber);

  }

  private double interestRate;

  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate / 100;
  }

  public double getInterestRate() {
    return interestRate;
  }

  public void addRate() {
    setBalance(getBalance() * (1 + this.interestRate));
  }
}
