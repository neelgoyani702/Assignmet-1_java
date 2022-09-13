// WAP to show the try - catch block to catch the different types of exception.

public class Pr_1 {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; // May throw Exception
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        try {
            int arr[] = { 1, 3, 5, 7 };
            System.out.println(arr[10]); // may throw exception
        }
        // handling the array exception
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
