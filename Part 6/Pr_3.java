// Write a program to increment the value of one variable by one and display it after one
// second using thread using sleep() method.

// ********************** Neel Goyani (21CE036) ***********************


class Pr_3 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {

                // it will sleep the main thread for 1 sec,each time the for loop runs
                Thread.sleep(1000);
                // printing the value of the variable
                System.out.println(i);
            }
        } catch (Exception e) {

            // catching the exception
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        Pr_3 t1 = new Pr_3();

        t1.start();
    }
}