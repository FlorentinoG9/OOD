package Assignment_4;

public class CurrentAccount extends Account {

  /**
   * this constructor will assign whatever int value you passed through when
   * creating the object on the main method
   */
  CurrentAccount(int accountNumber) {
    super(accountNumber);
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
    } else {
      System.out.println("Sorry your overdraft limit is reached");
    }
  }

  /**
   * this method is not necessary since we have it on the super class account but
   * we can added here as an example, when called this method inside this class
   * will call this override method and not from the super class
   */
  
  @Override
  public void setBalance(double balance) {
    super.setBalance(balance);
  }

}
