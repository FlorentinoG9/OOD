package Assignment_4;

public class CurrentAccount extends Account {

  static int classCounter = 0;

  /**
   * this constructor will assign whatever int value you passed through when
   * creating the object on the main method
   */
  CurrentAccount(int accountNumber) {
    super(accountNumber);
    classCounter++;
  }

  /**
   * this method will ask for a double value to withdraw from the account balance
   */
  public void overDraft(double withdraw) {
    /**
     * first we get the balance from the account super class then we assign in to a
     * variable minus the amount that you want to withdraw
     */
    double overDft = getBalance() - withdraw;

    /**
     * if the amount overDraft variable is higher than -200 you can withdraw tha
     * amount that you want but if is less than -200 will display a message giving
     * some feedback
     */

    if (overDft >= -200) {
      setBalance(overDft);
    } else if (getBalance() <= -200){
      System.out.println("\nSorry you have reached you limit of 200 overdraft\n");
    } else {
      System.out.printf("\nYou can withdraw: $%.2f to reach your limit\n\n", 200 + getBalance());
    }
  }

  /**
   * this method is not necessary since we have it on the super class account but
   * we can added here as an example, when called this method inside this class
   * will call this override method and not from the super class
   */

  public void displayNumberOfAccount() {
    // get the static int by calling the classfirst
    System.out.println("Amount of Current Accounts: " + CurrentAccount.classCounter);
  }

}
