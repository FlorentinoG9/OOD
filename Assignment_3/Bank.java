package Assignment_3;

public class Bank {
  public static void main(String[] args) {
    /** decalre the 3 objects of each calss */
    CurrentAccount currAcc = new CurrentAccount(123);
    Account acc = new Account(456);
    SavingsAccount saveAcc = new SavingsAccount(789);

    /** use every method in the Current Account class */
    System.out.println("\nCurrent Account--------------------------");
    currAcc.overDraft(10);
    System.out.printf("%.2f\n", currAcc.getBalance());
    currAcc.overDraft(100);
    System.out.printf("%.2f\n", currAcc.getBalance());
    currAcc.overDraft(50);
    System.out.printf("%.2f\n", currAcc.getBalance());
    currAcc.overDraft(40);
    System.out.printf("%.2f\n", currAcc.getBalance());
    currAcc.overDraft(1);
    System.out.printf("%.2f\n", currAcc.getBalance());

    /** use every method in the Savings Account class */
    System.out.println("\nSavings Account--------------------------");
    saveAcc.setBalance(1000);
    saveAcc.setInterestRate(10);
    saveAcc.addRate();
    System.out.printf("%.2f\n", saveAcc.getBalance());
    saveAcc.addRate();
    System.out.printf("%.2f\n", saveAcc.getBalance());

    /** use every method in the Account class */
    System.out.println("\nAccount--------------------------");
    acc.setBalance(1010.05);
    System.out.printf("%.2f\n", acc.getBalance());
    acc.depositFunds(1515.25);
    System.out.printf("%.2f\n", acc.getBalance());
    acc.withdrawFunds(1515.25);
    System.out.printf("%.2f\n", acc.getBalance());
  }
}
