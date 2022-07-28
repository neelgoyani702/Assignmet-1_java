import java.util.*;

public class Pr_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();

        lastDigit(num1, num2);
        sc.close();
    }

    public static void lastDigit(int a, int b) {
        if (a % 10 == b % 10)
            System.out.println("true");

        else
            System.out.println("false");
    }

}
