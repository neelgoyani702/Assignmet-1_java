/*
    Write a program that raises two exceptions. Specify two ‘catch’ clauses for the two
    exceptions. Each ‘catch’ block handles a different type of exception. For example the
    exception could be ‘ArithmeticException’ and ‘ArrayIndexOutOfBoundsException’.
    Display a message in the ‘finally’ block.
*/

import java.util.Scanner;

public class Pr_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array at least 5: ");
        int siz = s.nextInt();
        int num = 100;
        int[] ar = new int[siz];
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter the element " + (i + 1) + " : ");
                ar[i] = s.nextInt();
            }
            for (int i = 0; i < siz; i++) {
                System.out.println("The value of expression num/ar[" + i + "] is " + num / ar[i]);
            }
        } catch (ArithmeticException aobj) {
            System.out.println("Exception : " + aobj);
        } catch (ArrayIndexOutOfBoundsException arobj) {
            System.out.println("Exception : " + arobj);
        } catch (Exception e) {
            System.out.println("The exception is " + e);
        } finally {
            System.out.println("Enter a valid inputs");
        }
    }
}