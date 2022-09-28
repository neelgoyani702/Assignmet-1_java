// Write a program to create three threads ‘FIRST’, ‘SECOND’, ‘THIRD’. Set the
// priority of the ‘FIRST’ thread to 3, the ‘SECOND’ thread to 5(default) and the
// ‘THIRD’ thread to 7.

// ********************** Neel Goyani (21CE036) **********************

public class Pr_4 extends Thread {
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Pr_4 FIRST = new Pr_4();
        Pr_4 SECOND = new Pr_4();
        Pr_4 THIRD = new Pr_4();

        System.out.println("Before Set Priority");
        System.out.println("FIRST thread priority: " + FIRST.getPriority());
        System.out.println("SECOND thread priority: " + SECOND.getPriority());
        System.out.println("THIRD threrad priority: " + THIRD.getPriority());

        FIRST.setPriority(3);
        SECOND.setPriority(5);
        THIRD.setPriority(7);

        System.out.println("After Set Priority");
        System.out.println("FIRST thread priority: " + FIRST.getPriority());
        System.out.println("SECOND thread priority: " + SECOND.getPriority());
        System.out.println("THIRD threrad priority: " + THIRD.getPriority());

        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Thread Name: " + Thread.currentThread().getPriority());

        currentThread().setPriority(10);
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Thread Name: " + Thread.currentThread().getPriority());
    }
}
