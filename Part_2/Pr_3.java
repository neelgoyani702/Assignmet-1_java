/*
Use the Account class created as above to simulate an ATM machine.
Create 10 accounts with id AC001.....AC010 with initial balance 300₹. The
system prompts the users to enter an id. If the id is entered incorrectly, ask
the user to enter a correct id. Once an id is accepted, display menu with
multiple choices.
1. Balance inquiry
2. Withdraw money [Maintain minimum balance 300₹]
3. Deposit money
4. Money Transfer
5. Create Account
6. Deactivate Account
7. Exit
Hint: Use ArrayList, which is can shrink and expand with compared to Array.
*/


import java.util.*;

public class Pr_3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String id = "";
        String id2 = "";
        boolean flag = true;
        int choice;
        double amt;
        ArrayList<ATM> people = new ArrayList<ATM>();
        for (int i = 1; i <= 10; i++) {
            people.add(new ATM());
        }
        System.out.print("Enter Your Account Number : ");
        id = obj.next();
        int userNumber = userID(id, people);
        while (flag) {
            System.out.println();
            System.out.println("Make a choice......");
            System.out.println("1.Balance inquiry ");
            System.out.println("2.Withdraw money ");
            System.out.println("3.Deposit money");
            System.out.println("4.Money Transfer ");
            System.out.println("5.Create Account ");
            System.out.println("6.Deactivate Account");
            System.out.println("7.Exit ");
            choice =obj.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Account Number : " + id);
                    System.out.println("Current Balance : " + people.get(userNumber).getBalance());
                }
                case 2 -> {
                    System.out.print("Enter Amount To Withdraw : ");
                    amt = obj.nextDouble();
                    people.get(userNumber).withdraw(amt);
                }
                case 3 -> {
                    System.out.print("Enter Amount To Deposit : ");
                    amt = obj.nextInt();
                    people.get(userNumber).deposit(amt);
                }
                case 4 -> {
                    System.out.print("Enter Account Number To Transfer Money :");
                    id2 = obj.next();
                    int u2 = userID(id2, people);
                    System.out.print("Enter Amount To Transfer : ");
                    amt = obj.nextInt();
                    people.get(userNumber).MoneyTransfer(people.get(u2), amt);
                }
                case 5 -> {
                    people.add(new ATM());
                    System.out.println("Account Created Successfully.");
                    System.out.println("The New Account Number Is :" + people.get(people.size() - 1).getId());
                }
                case 6 -> {
                    people.remove(userNumber);
                    System.out.println("Account Deleted Successfully.");
                    flag = false;
                }
                case 7 -> flag = false;
                default -> System.out.println("Make a valid choice..");
            }
        }

        obj.close();
    }

    public static int userID(String id, ArrayList<ATM> people) {
        Scanner s = new Scanner(System.in);
        int user = 0;
        int i;
        for (i = 0; i < people.size(); i++) {
            if (id.equals(people.get(i).getId())) {
                user = i;
                break;
            }
        }
        return user;
    }
}
