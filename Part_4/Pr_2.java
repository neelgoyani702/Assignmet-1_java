// WAP to generate user defined exception using “throw” and “throws” keyword.

import java.util.Scanner;

class ZeroID extends Exception {
    @Override
    public String getMessage() {
        return "ID cannot be zero or negative";
    }

    @Override
    public String toString() {
        return "ID set to non positive value";
    }
}

public class Pr_2 {
    int ID;

    void setID() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your ID : ");
        ID = s.nextInt();
    }

    int getID() throws ZeroID {
        setID();
        if (ID <= 0) {
            throw new ZeroID();
        } else {
            return ID;
        }
    }

    public static void main(String[] args) {
        Pr_2 o1 = new Pr_2();
        int id;
        try {
            id = o1.getID();
        } catch (ZeroID obj) {
            System.out.println(obj.getMessage());
            System.out.println(obj.toString());
            System.out.println("ID value is now set to 1");
            o1.ID = 1;
        }
        System.out.println("The ID is : " + o1.ID);
    }
}
