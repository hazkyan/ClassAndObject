import java.util.Scanner;

public class AccountRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acct1 = new Account();
        Account acct2 = new Account();

        double acc1bal = 150.00;
        double acc2bal = 500.53;

        System.out.println("account1 balance: $" + acc1bal);
        System.out.println("account2 balance: $" + acc2bal + "\n");
        System.out.print("Enter withdrawal amount for account 1: ");
        double withdraw1 = sc.nextDouble();

        if (withdraw1 > acc1bal) {
            System.out.println("subtracting " + withdraw1 + " from account 1 balance");
            System.out.println("Debit amount exceeded account balance");
            System.out.println("account1 balance: $" + acc1bal);
            System.out.println("account2 balance: $" + acc2bal + "\n");
        } else {
            acct1.debit(acc1bal, withdraw1);
            System.out.println("subtracting " + withdraw1 + " from account 1 balance");
            System.out.println("account1 balance: $" + acct1.getDiff());
            System.out.println("account2 balance: $" + acc2bal + "\n");
        }

        System.out.print("Enter withdrawal amount for account 2: ");
        double withdraw2 = sc.nextDouble();

        if (withdraw2 > acc2bal) {
            System.out.println("subtracting " + withdraw2 + " from account 2 balance");
            System.out.println("Debit amount exceeded account balance");
            System.out.println("account1 balance: $" + acc1bal);
            System.out.println("account2 balance: $" + acc2bal + "\n");
        } else {
            acct2.debit(acc2bal, withdraw2);
            System.out.println("subtracting " + withdraw2 + " from account 2 balance");
            System.out.println("account1 balance: $" + acc1bal);
            System.out.println("account2 balance: $" + acct2.getDiff());
        }
    }
}
