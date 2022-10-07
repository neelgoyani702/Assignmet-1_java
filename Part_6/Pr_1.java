//  Write a program to create thread which display Hello World message.
// A. by extending Thread class
// B. by using Runnable interface.

// ********************** Neel Goyani (21CE036) ***********************

//  --->    A. by extending Thread class
class Multithreading extends Thread {
    public void run() {
        try {
            System.out.println("Hello World using Thread class");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

// ---> B. by using Runnable interface.

class MultithreadingDemo implements Runnable {
    public void run() {
        try {
            System.out.println("Hello World using Runnable interface");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

class Pr_1 {
    public static void main(String[] args) {
        Multithreading t1 = new Multithreading();
        MultithreadingDemo t2 = new MultithreadingDemo();
        t1.start();
        t2.run();
    }

}