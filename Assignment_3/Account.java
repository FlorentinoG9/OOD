package Assignment_3;

public class Account {
  private double balance;
  private int accountNumber;

  Account(int accountNumber) {
    this.balance = 0;
    this.accountNumber = accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void depositFunds(double deposit) {
    if (deposit <= 0) {
      System.out.println("Error what is deposit cannot be $0.00");
    } else {
      this.balance += deposit;
    }
  }

  public double withdrawFunds(double withdraw) {

    if (this.balance - withdraw < 0) {
      System.out.println("Sorry not enough funds");
    } else {
      this.balance -= withdraw;
    }

    return this.balance;
  }

}
