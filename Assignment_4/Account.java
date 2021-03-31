package Assignment_4;

public class Account {
  /** declare the super calss variables for the balance and the account number */
  private double balance;
  private int accountNumber;

  /** constructor to init the aobject */
  Account(int accountNumber) {
    /** at the start of the object init the balance to 0 and the account number */
    setBalance(0);
    setAccountNumber(accountNumber);
  }

  /** Setters for the Account class */
  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  /** Getters for the account class */
  public double getBalance() {
    return balance;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  /** Methods to use in this Account Object */
  public void depositFunds(double deposit) {
    /** check if the deposit number is greater than 0 otherwise display an error */
    if (deposit <= 0) {
      System.out.println("Error your deposit cannot be $0.00");
    } else {
      /** if deposit number is greater than 0 will added to the account */
      this.balance += deposit;
    }
  }

  public double withdrawFunds(double withdraw) {
    /**
     * if the withdrae amount is greater than the amount in the balance will display
     * an error saying that there arent enough funds in the account
     */
    if (getBalance() - withdraw < 0) {
      System.out.println("Sorry not enough funds");
    } else {
      /** if not will withdraw the amount and return the new balance*/
      this.balance -= withdraw;
    }

    return this.balance;
  }

}
