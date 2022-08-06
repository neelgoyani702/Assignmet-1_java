public class ATM {
    private final String id;
    private double balance;
    // private static double annualInterestRate;
    // private java.util.Date dateCreated;

    private static int count = 0;

    public ATM() {
        count++;
        if (count < 10) {
            id = "AC00" + (count);
        } else {
            id = "AC0" + (count);
        }
        balance = 300;
    }
    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
    public void withdraw(double money) {
        if (balance - money >= 300) {
            balance -= money;
            System.out.println(money + " Rs successfully withdrawn.");
            System.out.println("Remaining Balance is : " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw the amount.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "Rs deposited to your account.");
        System.out.println("Current Balance is : " + balance);
    }

    public void MoneyTransfer(ATM obj, double amount) {
        if (balance - amount >= 300) {
            balance -= amount;
            obj.balance += amount;
            System.out.println(amount + " Rs successfully Transferred.");
            System.out.println("Remaining Balance is : " + balance);
        } else {
            System.out.println("Insufficient balance to transfer the amount.");
        }
    }
}