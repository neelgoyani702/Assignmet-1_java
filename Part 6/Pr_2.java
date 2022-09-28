/*
    Generate 15 random numbers from 1 to 100 and store it in an int array. Write a program to
    display the numbers stored at odd indexes by thread1 and display numbers stored at even
    indexes by thread2.
*/

// ********************** Neel Goyani (21CE036) ***********************

import java.util.Random;

class Runnable1 implements Runnable {
    int[] arr;

    public Runnable1(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        try {
            System.out.println("Odd Indexes");
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    System.out.println(arr[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

class Runnable2 implements Runnable {
    int[] arr;

    public Runnable2(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        try {
            System.out.println("Even Indexes");
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    System.out.println(arr[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

public class Pr_2 {

    public static void main(String[] args) {
        Random random = new Random();
        final int[] number = new int[15];
        for (int i = 0; i < 15; i++) {
            number[i] = random.nextInt(100);
        }
        Runnable r1 = new Runnable1(number);
        Thread t1 = new Thread(r1);
        t1.start();
        Runnable r2 = new Runnable2(number);
        Thread t2 = new Thread(r2);
        t2.start();
    }

}
