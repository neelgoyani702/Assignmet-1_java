/*
    WAP that illustrate the interface inheritance. Interface
    P is extended by P1 and P2 interfaces.
    Interface P12 extends both P1 and P2. Each interface declares one method and
    one constant. Create one class that implements P12. By using the object of the
    class invokes each of its method and displays constant.
*/

interface P {
    int P = 2;

    void methodP();
}

interface P1 extends P {
    int P1 = 3;

    void methodP1();
}

interface P2 extends P {
    int P2 = 4;

    void methodP2();
}

interface P12 extends P1, P2 {
    int P12 = 5;

    void methodP12();
}

class InterfaceInheritance implements P12 {
    public void methodP() {
        System.out.println("Interface method P called-");
    }

    public void methodP1() {
        System.out.println("Interface method P1 called-");
    }

    public void methodP2() {
        System.out.println("Interface method P2 called-");
    }

    public void methodP12() {
        System.out.println("Interface method called-");
    }
}

public class Pr_3 {
    public static void main(String[] args) {
        InterfaceInheritance Interfacee = new InterfaceInheritance();
        Interfacee.methodP();
        System.out.println("Interface P constant:" + Interfacee.P + "\n");
        Interfacee.methodP1();
        System.out.println("Interface P constant:" + Interfacee.P1 + "\n");
        Interfacee.methodP2();
        System.out.println("Interface P constant:" + Interfacee.P2 + "\n");
        Interfacee.methodP12();
        System.out.println("Interface P constant:" + Interfacee.P12 + "\n");
    }
}