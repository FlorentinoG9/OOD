package Assignment_3;

public class CurrentAccount extends Account {

  CurrentAccount(int accountNumber) {
    super(accountNumber);
    //TODO Auto-generated constructor stub
  }

  public void overDraft(double withdraw) {
    double overDft = getBalance() - withdraw;

    if (overDft >= -200) {
      setBalance(overDft);
    } else {
      System.out.println("Sorry your overdraft limit is reached");
    }
  }

  @Override
  public void setBalance(double balance) {
    // TODO Auto-generated method stub
    super.setBalance(balance);
  }

}
