/*
    Write a program to create a default method in an interface IPrinter. Create
    an interface IPrinter and IScanner. You can assume variables and methods for both
    interfaces. Create a concrete class to implement both the interfaces. Create 5 objects of the
    class, store it in Vector and display the result of the vector.
*/

import java.util.*;

interface iprinter {
    String ip();

    default void show() {
        System.out.println("Default iprinter");
    }
}

interface iscanner {
    String isc();

    default void show() {
        System.out.println("Default testinterface2");
    }
}

class defaultmethod implements iprinter, iscanner {
    public String ip() {
        return "iprinter";
    }

    public String isc() {
        return "iscanner";
    }

    public void show() {
        iprinter.super.show();
        iscanner.super.show();
    }
}

public class Pr_2 {
    public static void main(String[] args) {
        Vector<String> s = new Vector<>();
        defaultmethod d = new defaultmethod();
        s.add(d.ip());
        s.add(d.isc());
        s.add(d.ip());
        s.add(d.isc());
        s.add(d.ip());
        d.show();
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }
    }
}
