package Assignment_4;

public class Bank {
  public static void main(String[] args) {
    /** decalre the 3 objects of each calss */
    CurrentAccount currAcc1 = new CurrentAccount(123);
    SavingsAccount saveAcc1 = new SavingsAccount(789);

    /** use every method in the Current Account class */
    System.out.println("\n\nCurrent Account 1 --------------------------");
    currAcc1.overDraft(10);
    System.out.printf("Balance: %.2f\n", currAcc1.getBalance());
    currAcc1.overDraft(100);
    System.out.printf("Balance: %.2f\n", currAcc1.getBalance());
    currAcc1.overDraft(50);
    System.out.printf("Balance: %.2f\n", currAcc1.getBalance());
    currAcc1.overDraft(40);
    System.out.printf("Balance: %.2f\n", currAcc1.getBalance());
    currAcc1.overDraft(1);
    System.out.printf("Balance: %.2f\n", currAcc1.getBalance());
    currAcc1.displayNumberOfAccount();
    /** The printAccountInfo will be accesssed through the abstract class */
    currAcc1.printAccountInfo();

    /** Add the 2nd object of the Current Account Class */
    CurrentAccount currAcc2 = new CurrentAccount(321);

    System.out.println("\n\nCurrent Account 2 --------------------------");
    currAcc2.overDraft(15.25);
    System.out.printf("Balance: %.2f\n", currAcc2.getBalance());
    currAcc2.overDraft(15.25);
    System.out.printf("Balance: %.2f\n", currAcc2.getBalance());
    currAcc2.overDraft(68);
    System.out.printf("Balance: %.2f\n", currAcc2.getBalance());
    currAcc2.overDraft(156);
    System.out.printf("Balance: %.2f\n", currAcc2.getBalance());
    currAcc2.overDraft(1);
    System.out.printf("Balance: %.2f\n", currAcc2.getBalance());
    currAcc2.displayNumberOfAccount();
    /** The printAccountInfo will be accesssed through the abstract class */
    currAcc2.printAccountInfo();

    /** use every method in the Savings Account class */
    System.out.println("\n\nSavings Account 1 --------------------------");
    saveAcc1.setBalance(1000);
    saveAcc1.setInterestRate(10);
    saveAcc1.addRate();
    System.out.printf("Balance: %.2f\n", saveAcc1.getBalance());
    saveAcc1.addRate();
    System.out.printf("Balance: %.2f\n", saveAcc1.getBalance());
    saveAcc1.displayNumberOfAccount();
    /** The printAccountInfo will be accesssed through the abstract class */
    saveAcc1.printAccountInfo();

    /** Add the 2nd object of the Savings Account Class */
    SavingsAccount saveAcc2 = new SavingsAccount(987);

    System.out.println("\n\nSavings Account 2 --------------------------");
    saveAcc2.setBalance(12345.51);
    saveAcc2.setInterestRate(8.25);
    saveAcc2.addRate();
    System.out.printf("Balance: %.2f\n", saveAcc2.getBalance());
    saveAcc2.addRate();
    System.out.printf("Balance: %.2f\n", saveAcc2.getBalance());
    saveAcc2.displayNumberOfAccount();
    /** The printAccountInfo will be accesssed through the abstract class */
    saveAcc2.printAccountInfo();
  }
}
